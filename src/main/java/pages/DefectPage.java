package pages;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectPage.class));


    private static String btnaddDefect = "//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[1]/div/button";
    private static String txtDefectID = "defectId";
    private static String txtProject = "//*[@id=\"gender1\"]/div/div/div";
    private static String txtModule = "//*[@id=\"gender4\"]/div/div/div";
    private static String txtDescription = "defectDescription";
    private static String txtSteps = "stepsToRecreate";
    private static String txtEnteredBy = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[6]/div/div[2]/div/span/div/div/div/div";
    private static String txtFoundIn = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[7]/div/div[2]/div/span/div/div/div/div";
    private static String txtAssignTo = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/div/div[2]/div/span/div/div/div/div";
    private static String txtType = "//*[@id=\"gender6\"]/div/div/div";
    private static String txtSeverity = "//*[@id=\"gender2\"]/div/div/div";
    private static String txtPriority = "//*[@id=\"gender3\"]/div/div/div";

    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefect);

    }



//    public static void Login(String username, String password) {
//        MethodBase.setText_ByID(txtUserName,username);
//        MethodBase.setText_ByID(txtPassword,password);
//        MethodBase.clickButton_ById(btnLogin);
//    }
}
