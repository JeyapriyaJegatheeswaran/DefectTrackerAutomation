package pages.Defect;


import utils.MethodBase;
import utils.PageBase;
/**
 * @author:jeyapriya
 */

import java.util.logging.Logger;

public class EditDefectPage extends PageBase {

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(EditDefectPage.class));

    private static String txtEditDefectFormTitle = "//div[text()='Edit Defects']";
    private static String txtCommonEnteredByOption = "//li[text()=\"Option\"]";


    private static String txtEditProject = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div/span/div/div/span";
    private static String txtEditModule = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[3]/div/div[2]/div/span/div/div/span";
    private static String txtEditDescription = "//textarea[@placeholder=\"Defect Description\"]";
    private static String txtEditSteps = "//textarea[@placeholder=\"Steps To Recreate \"]";
    private static String txtEditEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/span/i";
    private static String txtEditFoundIn = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[7]/div/div[2]/div/span/div/div/span";
    private static String txtEditAssignTo = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/div/div[2]/div/span/div/div/span";
    private static String txtEditType = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]/div/span/div/div/span";
    private static String txtEditSeverity = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[2]/div/span/div/div/span";
    private static String txtEditPriority = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/div[2]/div/span/div/div/span";
    private static String txtEditStatus = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[3]/div/div/div[2]/div/span/div/div/span";
    private static String txtResult = "//td[text()='jp1234']";
    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String btnCancel = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[1]";



    public static String getResult(){
        return MethodBase.get_Text(txtResult);
    }

    public static boolean isEditDefectFormDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtEditDefectFormTitle);
    }


    public static void clickOKButton(){

        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void clickCancelButton(){

        MethodBase.clickButton_ByXpath(btnCancel);
    }


    public static void editEnteredBy(String enteredBy){
        MethodBase.selectAction(txtEditEnteredBy,txtCommonEnteredByOption.replace("Option", enteredBy));

    }
    public static void editFoundIn(String foundIn){
        MethodBase.selectAction(txtEditFoundIn,txtCommonEnteredByOption.replace("Option", foundIn));

    }
    public static void editAssignTo(String assignTo){
        MethodBase.selectAction(txtEditAssignTo,txtCommonEnteredByOption.replace("Option", assignTo));

    }
    public static void editType(String type){
        MethodBase.selectAction(txtEditType,txtCommonEnteredByOption.replace("Option", type));

    }

    public static void editSeverity(String severity){
        MethodBase.selectAction(txtEditSeverity,txtCommonEnteredByOption.replace("Option", severity));

    }
    public static void editPriority(String priority){
        MethodBase.selectAction(txtEditPriority,txtCommonEnteredByOption.replace("Option", priority));

    }
    public static void editStatus(String status){
        MethodBase.selectAction(txtEditStatus,txtCommonEnteredByOption.replace("Option", status));

    }
    public static void editModule(String module){
        MethodBase.selectAction(txtEditModule,txtCommonEnteredByOption.replace("Option", module));

    }
    public static void editDescription(String description){
        MethodBase.clear_ByXpath(txtEditDescription);
        MethodBase.setText_ByXpath(txtEditDescription,description);

    }
    public static void editSteps(String steps){
        MethodBase.clear_ByXpath(txtEditSteps);
        MethodBase.setText_ByXpath(txtEditSteps,steps);

    }
}
