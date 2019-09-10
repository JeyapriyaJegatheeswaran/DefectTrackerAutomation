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
    private static String txtProject = "//*[@id=\"gender1\"]/div/div/div";

    private static String txtModule = "//*[@id=\"gender4\"]/div/div/div";

    private static String txtDescription = "defectDescription";

    private static String txtSteps = "stepsToRecreate";


    private static String txtEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/div/div";
    private static String txtEnteredByOption = "//li[text()=\"Option\"]";

    private static String txtFoundIn = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[7]/div/div[2]/div/span/div/div/div/div";
    private static String txtFoundInOption = "//li[text()=\"Release1\"]";

    private static String txtAssignTo = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/div/div[2]/div/span/div/div/div/div";
    private static String txtAssignToOption = "//li[text()=\"Ram\"]";

    private static String txtType = "//*[@id=\"gender6\"]/div/div/div";
    private static String txtTypeOption = "//li[text()=\"DefectType\"]";

    private static String txtSeverity = "//*[@id=\"gender2\"]/div/div/div";
    private static String txtSeverityOption = "//li[text()=\"Low\"]";

    private static String txtPriority = "//*[@id=\"gender3\"]/div/div/div";
    private static String txtPriorityOption = "//li[text()=\"High\"]";

    private static String txtStatus = "//*[@id=\"gender7\"]/div/div/div";
    private static String txtStatusOption = "//li[text()=\"jptest\"]";

    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";
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
        MethodBase.setText_ByXpath(txtDefectID,id);
    }
    public static void setDescription( String description){
        MethodBase.setText_ByID(txtDescription,description);
    }
    public static void setSteps( String steps){
        MethodBase.setText_ByID(txtSteps,steps);
    }

    public static void setProject(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setModule(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setEnteredBy(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setFoundIn(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setAssignTo(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setDefectType(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setSeverity(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void setPriority(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }public static void setStatus(String defectId, String link){
        MethodBase.selectAction(txtDefectID.replace("Option", link),defectId);
    }
    public static void createDefect(String defectId,String description,String steps){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(txtProject,"defect");
        AddDefectPage.setModule(txtModule,"defect");
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(txtEnteredBy,"User 1");
        AddDefectPage.setFoundIn(txtFoundIn,"Release1");
        AddDefectPage.setAssignTo(txtAssignTo,"jp");
        AddDefectPage.setDefectType(txtType,"UI");
        AddDefectPage.setSeverity(txtSeverity,"High");
        AddDefectPage.setPriority(txtPriority,"High");
        AddDefectPage.setStatus(txtStatus,"New");
        MethodBase.clickButton_ByXpath(btnAdd);
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
