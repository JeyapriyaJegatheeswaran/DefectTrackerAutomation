package pages;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class HomePage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(HomePage.class));


    private static String defectMenu = "//*[@id=\"root\"]/div/section/aside/div/ul/li[8]/div[1]";
    private static String defectSubMenu = "//*[@id='sub3$Menu']";
    private static String moduleMenu = "//a[@href=\"#/module\"]";
    private static String settingMenu = "//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/div";
    private static String generalConfigSubMenu = "//*[@id=\"sub4$Menu\"]/li[4]/div";
    private static String prioritySubmenu = "//*[@id=\"sub5$Menu\"]/li[1]/a";
    private static String severitySubment = "//*[@id=\"sub5$Menu\"]/li[2]/a";


    public static void clickDefectMenu() {
        MethodBase.click_ByXpath(defectMenu);

    }
    public static void clickDefectSubMenu() {
        MethodBase.click_ByXpath(defectSubMenu);

    }
    public static void clickModule(){
        MethodBase.click_ByXpath(moduleMenu);
    }
    public static void clickSetting(){
        MethodBase.click_ByXpath(settingMenu);
    }
    public static void clickGeneralconfig(){
        MethodBase.click_ByXpath(generalConfigSubMenu);
    }
    public static void clickPriority(){
        MethodBase.click_ByXpath(prioritySubmenu);
    }
    public static void clickSeverity(){
        MethodBase.click_ByXpath(severitySubment);
    }

//    public static void Login(String username, String password) {
//        MethodBase.setText_ByID(txtUserName,username);
//        MethodBase.setText_ByID(txtPassword,password);
//        MethodBase.clickButton_ById(btnLogin);
//    }
}
