package pages;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectPage extends PageBase {
    public SoftAssert softAssert;
////*[@id="root"]/div/section/section/main/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[td[3][. = 'Login']]/td[5]
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectPage.class));
    private static String btnaddDefect = "//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[1]/div/button";
    private static String txtDefectID = "defectId";
    private static String txtProject = "//*[@id=\"gender1\"]/div/div/div";
    private static String txtProjectOption = "//li[text()=\"DefectTracker\"]";
    private static String txtModule = "//*[@id=\"gender4\"]/div/div/div";
    private static String txtModuleOption = "//li[text()=\"Login\"]";
    private static String txtDescription = "defectDescription";
    private static String txtSteps = "stepsToRecreate";
    private static String txtEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/div/div";
    private static String txtEnteredByOption = "//li[text()=\"User 1\"]";
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
    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String txtStatus = "//*[@id=\"gender7\"]/div/div/div";
    private static String txtStatusOption = "//li[text()=\"jptest\"]";
    private static String txtResult = "//td[text()='jp1234']";

    private static String commonValidMsgStatus = "//div[text()='LINK!']";

    private static String btnDelete="    //*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'jp1234']]/td[7]/span/a/i";
    private static String btnDeleteOk="/html/body/div[10]/div/div/div/div[2]/div/div/div[2]/button[2]";
    public static boolean isDefectPageDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefect);
    }
    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefect);

    }


    public static void createDefect(String defectId,String description,String steps){
        MethodBase.setText_ByID(txtDefectID,defectId);
        MethodBase.selectAction(txtProject,txtProjectOption);
        MethodBase.selectAction(txtModule,txtModuleOption);
        MethodBase.setText_ByID(txtDescription,description);
        MethodBase.setText_ByID(txtSteps,steps);
        MethodBase.selectAction(txtEnteredBy,txtEnteredByOption);
        MethodBase.selectAction(txtFoundIn,txtFoundInOption);
        MethodBase.selectAction(txtAssignTo,txtAssignToOption);
        MethodBase.selectAction(txtType,txtTypeOption);
        MethodBase.selectAction(txtSeverity,txtSeverityOption);
        MethodBase.selectAction(txtPriority,txtPriorityOption);
        MethodBase.selectAction(txtStatus,txtStatusOption);
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
}
