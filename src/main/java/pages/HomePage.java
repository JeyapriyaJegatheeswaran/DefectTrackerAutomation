package pages;


import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class HomePage extends PageBase {


    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(HomePage.class));


    private static String defectMenu = "//*[@id=\"root\"]/div/section/aside/div/ul/li[8]/div[1]";
    private static String defectSubMenu = "//*[@id='sub3$Menu']";
    private static String hdrHome = "//span[text()=\"Dashboard Component\"]";

    private static String moduleMenu = "//a[@href=\"#/module\"]";
    private static String settingVerify = "//span[text()=\"Setting\"]";
    private static String settingMenu = "//span[text()=\"Setting\"]";
    private static String generalConfigSubMenuVerify ="//span[text()=\"General Configuration\"]";
    private static String generalConfigSubMenu = "//*[@id=\"sub4$Menu\"]/li[4]/div";
    private static String prioritySubmenuVerify ="//a[text()=\"Priority\"]";
    private static String prioritySubmenu = "//*[@id=\"sub5$Menu\"]/li[1]/a";
    private static String severitySubmenuVerify ="//a[text()=\"Severity\"]";
    private static String severitySubment = "//*[@id=\"sub5$Menu\"]/li[2]/a";

    private static String configurationSubMenu = "//*[@id=\"sub4$Menu\"]/li[4]/div[1]/span/span";
    private static String defectTypeSubMenu = "//*[@href=\"/config/defecttype\"]";

    private static String projectMenu = "//a[@href=\"/project\"]";
    private static String companyMenu = "//*[@id=\"root\"]/div/section/aside/div/ul/li[4]/div/span/span";
    private static String employeeSubMenu = "//*[@id=\"sub2$Menu\"]/li[3]";

//defect test
    public static void clickDefectMenu() {
        MethodBase.click_ByXpath(defectMenu);
    }
    public static void clickDefectSubMenu() {
        MethodBase.click_ByXpath(defectSubMenu);
    }
    public static String isDefectMenuDisplayed(){
        return MethodBase.get_Text(defectMenu);
    }
    public static String isDefectSubMenuDisplayed(){
        return MethodBase.get_Text(defectSubMenu);
    }


//project test
    public static void clickProjectMenu() {
        MethodBase.click_ByXpath(projectMenu);
    }
    public static String isManageProjectMenuDisplayed(){
        return MethodBase.get_Text(projectMenu);
    }


    public static void clickCompanyMenu() {
        MethodBase.click_ByXpath(companyMenu);
    }
    public static void clickEmployeeSubMenu() {
        MethodBase.click_ByXpath(employeeSubMenu);
    }

    public static boolean isHomePageDisplayed() {
        return MethodBase.isDisplayed_ByXpath(hdrHome);
    }
    public static void clickModule(){ MethodBase.click_ByXpath(moduleMenu);}
    public static String settingVerify(){return MethodBase.get_Text(settingVerify);}
    public static void clickSetting(){MethodBase.click_ByXpath(settingMenu); }
    public static String generalConfigVerify(){return MethodBase.get_Text(generalConfigSubMenuVerify);}
    public static void clickGeneralconfig(){
        MethodBase.click_ByXpath(generalConfigSubMenu);
    }
    public static String priorityVerify(){return MethodBase.get_Text(prioritySubmenuVerify);}
    public static void clickPriority(){
        MethodBase.click_ByXpath(prioritySubmenu);
    }
    public static String severityVerify(){return MethodBase.get_Text(severitySubmenuVerify);}
    public static void clickSeverity(){
        MethodBase.click_ByXpath(severitySubment);
    }


//    public static void Login(String username, String password) {
//        MethodBase.setText_ByID(txtUserName,username);
//        MethodBase.setText_ByID(txtPassword,password);
//        MethodBase.clickButton_ById(btnLogin);
//    }

    public static void clickSettingMenu(){
        MethodBase.click_ByXpath(settingMenu);
    }
    public static void clickConficurationSubMenu(){
        MethodBase.click_ByXpath(configurationSubMenu);
    }
    public static void clickDefectTypeSubMenu(){
        MethodBase.click_ByXpath(defectTypeSubMenu);
    }



}

