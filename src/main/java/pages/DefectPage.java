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
    private static String txtProjectOption = "//li[text()=\"hbtvgyftyghvgj\"]";
    private static String txtModule = "//*[@id=\"gender4\"]/div/div/div";
    private static String txtModuleOption = "//li[text()=\"dfgfhgh\"]";
    private static String txtDescription = "defectDescription";
    private static String txtSteps = "stepsToRecreate";
    private static String txtEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/div/div";
    private static String txtEnteredByOption = "//*[@id=\"73304e1a-9f9e-4cfc-deb0-dc2cab465da4\"]/ul/li[1]";
    private static String txtFoundIn = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[7]/div/div[2]/div/span/div/div/div/div";
    private static String txtFoundInOption = "//*[@id=\"54a0743d-a3e2-4d00-9e42-12ff81c82e81\"]/ul/li[1]";
    private static String txtAssignTo = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/div/div[2]/div/span/div/div/div/div";
    private static String txtAssignToOption = "//*[@id=\"cf84fe75-2fb4-4320-8061-13bccf042706\"]/ul/li";
    private static String txtType = "//*[@id=\"gender6\"]/div/div/div";
    private static String txtTypeOption = "//*[@id=\"ed0e54e2-02b7-4273-f6a1-32a991bca51c\"]/ul/li[1]";
    private static String txtSeverity = "//*[@id=\"gender2\"]/div/div/div";
    private static String txtSeverityOption = "//*[@id=\"3227e634-b51e-4b4f-9648-1a0a67709da8\"]/ul/li";
    private static String txtPriority = "//*[@id=\"gender3\"]/div/div/div";
    private static String txtPriorityOption = "//*[@id=\"c0859e4a-8bd0-42ad-b242-b5af9c1e9fb1\"]/ul/li[1]";
    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    public static boolean isDefectPageDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefect);
    }
    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefect);

    }
    public static void setDefectId(String defectId){
        MethodBase.setText_ByID(txtDefectID,defectId);
    }
    public static void setDescription(String description){
        MethodBase.setText_ByID(txtDescription,description);
    }
    public static void setSteps(String steps){
        MethodBase.setText_ByID(txtSteps,steps);
    }
    public static void setProject(){
        MethodBase.selectAction(txtProject,txtProjectOption);
    }
    public static void setModule(){
        MethodBase.selectAction(txtModule,txtModuleOption);
    }
    public static void setEnteredBy(){
        MethodBase.selectAction(txtEnteredBy,txtEnteredByOption);
    }
    public static void setFoundIn(){
        MethodBase.selectAction(txtFoundIn,txtFoundInOption);
    }

    public static void setAssignTo(){
        MethodBase.selectAction(txtAssignTo,txtAssignToOption);
    }
    public static void setType(){
        MethodBase.selectAction(txtType,txtTypeOption);
    }
    public static void setSeverioty(){
        MethodBase.selectAction(txtSeverity,txtSeverityOption);
    }
    public static void setPriority(){
        MethodBase.selectAction(txtPriority,txtPriorityOption);
    }
    public static void clickOkButton(){
        MethodBase.clickButton_ByXpath(btnAdd);
    }


//    public static void Login(String username, String password) {
//        MethodBase.setText_ByID(txtUserName,username);
//        MethodBase.setText_ByID(txtPassword,password);
//        MethodBase.clickButton_ById(btnLogin);
//    }
}
