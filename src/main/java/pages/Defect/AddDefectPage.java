package pages.Defect;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class AddDefectPage extends PageBase {
    public SoftAssert softAssert;
////*[@id="root"]/div/section/section/main/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[td[3][. = 'Login']]/td[5]
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AddDefectPage.class));

    private static String txtAddDefectFormTitle = "//span[@class=\"ant-page-header-title-view-title\"]";


    private static String txtDefectID = "defectId";
    private static String txtProject = "//div[@id='gender1']";
    private static String txtModule = "//div[@id='gender4']";
    private static String txtDescription = "defectDescription";
    private static String txtSteps = "stepsToRecreate";
    private static String txtEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/div/div";
    private static String txtFoundIn = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[7]/div/div[2]/div/span/div/div/div/div";
    private static String txtAssignTo = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/div/div[2]/div/span/div/div/div/div";
    private static String txtType = "//*[@id=\"gender6\"]/div/div/div";
    private static String txtSeverity = "//*[@id=\"gender2\"]/div/div/div";
    private static String txtPriority = "//*[@id=\"gender3\"]/div/div/div";
    private static String txtStatus = "//*[@id=\"gender7\"]/div/div/div";
    private static String txtCommonOption = "//li[text()=\"Option\"]";
    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/button";
    private static String btnCancel = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[1]";
    private static String txtResult = "//td[text()='jp1234']";
    private static String commonValidMsgStatus = "//div[text()='LINK!']";
    private static String btnDelete="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'jp1234']]/td[7]/span/a/i";
    private static String btnDeleteOk="/html/body/div/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String btnEdit="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'DEF001']]/td[7]/span/i";


    public static boolean isAddDefectFormDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtAddDefectFormTitle);
    }
    public static void clickEditButton(){

        MethodBase.clickButton_ByXpath(btnEdit);
    }
    public static void setDefectId( String id){
        MethodBase.setText_ByID(txtDefectID,id);
    }
    public static void setDescription( String description){
        MethodBase.setText_ByID(txtDescription,description);
    }
    public static void setSteps( String steps){
        MethodBase.setText_ByID(txtSteps,steps);
    }

    public static void setProject( String option){
        MethodBase.selectAction(txtProject,txtCommonOption.replace("Option", option));
    }
    public static void setModule( String option){

        MethodBase.selectAction(txtModule,txtCommonOption.replace("Option", option));
    }

    public static void setEnteredBy(String option){
        MethodBase.selectAction(txtEnteredBy,txtCommonOption.replace("Option", option));
    }
    public static void setFoundIn(String option){
        MethodBase.selectAction(txtFoundIn,txtCommonOption.replace("Option", option));
    }
    public static void setAssignTo(String option){
        MethodBase.selectAction(txtAssignTo,txtCommonOption.replace("Option", option));
    }
    public static void setDefectType(String option){
        MethodBase.selectAction(txtType,txtCommonOption.replace("Option", option));
    }
    public static void setSeverity(String option){
        MethodBase.selectAction(txtSeverity,txtCommonOption.replace("Option", option));
    }
    public static void setPriority(String option){
        MethodBase.selectAction(txtPriority,txtCommonOption.replace("Option", option));
    }public static void setStatus(String option){
        MethodBase.selectAction(txtStatus,txtCommonOption.replace("Option", option));
    }
    public static void clickAddButton(){
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefect(String defectId,String project,String module,String description,
                                    String steps,String enteredBy,String foundIn,String assignTo,
                                    String type,String severity,String priority,String status){
          AddDefectPage.setDefectId(defectId);
          AddDefectPage.setProject(project);
//        AddDefectPage.setDescription(description);
//        AddDefectPage.setSteps(steps);
//        AddDefectPage.setEnteredBy(enteredBy);
//        AddDefectPage.setFoundIn(foundIn);
//        AddDefectPage.setAssignTo(assignTo);
//        AddDefectPage.setDefectType(type);
//        AddDefectPage.setSeverity(severity);
//        AddDefectPage.setPriority(priority);
//        staticWait(3);
//        AddDefectPage.setStatus(status);
//        staticWait(3);
        MethodBase.clickButton_ByXpath(btnAdd);
//        //AddDefectPage.setModule(module);
//        staticWait(3);
//        AddDefectPage.setPriority(priority);
        MethodBase.clickButton_ByXpath(btnAdd);
        staticWait(3);
    }
    public static void createDefectWithoutData(){

        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static String getResult(){
        return MethodBase.get_Text(txtResult);
    }

    public static String CheckValidMsg(String link){

        return MethodBase.get_Text(commonValidMsgStatus.replace("LINK", link));
    }

    public static void deleteDefect(){
        MethodBase.clickButton_ByXpath(btnDelete);
        staticWait(3);
        MethodBase.clickButton_ByXpath(btnDeleteOk);
    }
    public static void clickCancelButton(){

        MethodBase.clickButton_ByXpath(btnCancel);
    }
}
