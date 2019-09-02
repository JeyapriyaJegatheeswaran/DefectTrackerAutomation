package pages;

import utils.MethodBase;

import java.util.logging.Logger;

public class ModulePage {

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(HomePage.class));

    private static String btnAddModuleVerify = "//span[text()='Add Module']";
    private static String btnAddModule = "//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[1]/button";
    private static String idModule = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/span/input";
    private static String nameModule = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/span/input";
    private static String nameProject1 = "//div[text()='Select Project']";
    private static String nameProject2 = "//li[text()='hbtv']";
    private static String btnAdd = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    public static void isModulePageDisplay() {
        MethodBase.isDisplayed_ByXpath(btnAddModuleVerify);
    }
    public static void clickAddmodulebtn(){
        MethodBase.clickButton_ByXpath(btnAddModule);
    }
    public static void clearModuleId(){
        MethodBase.clear_ByXpath(idModule);
    }
    public static void setModuleId(String moduleid){
        MethodBase.setText_ByXpath(idModule,moduleid);
    }
    public static void clearModuleName(){
        MethodBase.clear_ByXpath(nameModule);
    }
    public static void setModuleName(String modulename){
        MethodBase.setText_ByXpath(nameModule,modulename);
    }
    public static void setProjectName(){
        MethodBase.selectAction(nameProject1,nameProject2);
    }
    public static void clickAddbtn(){
        MethodBase.clickButton_ByXpath(btnAdd);
    }

}
