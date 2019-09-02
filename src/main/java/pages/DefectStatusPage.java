package pages;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectStatusPage  extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectStatusPage.class));
    private static String ClickSetting = "//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/div[1]";
    private static String ClickGeneralConfiguration = "//*[@id=\"sub4$Menu\"]/li[4]/div";
    private static String ClickDefectStatus = "//*[@id=\"sub5$Menu\"]/li[4]";
    private static String ClickAddStatus = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String txtDefectStatus = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String txtDefectDescription= "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String Clickok= "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String ClickEditDefect= "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[1]/td[3]/span/i[1]";

    public static boolean isDefectPageDisplayed(){
        return MethodBase.isDisplayed_ByXpath(ClickAddStatus);
    }

//    public static void clickSetting() {
//        MethodBase.clickButton_ByXpath(ClickSetting);
//
//    }
    public static void AddStatusFunction(String Status,String Description ){

        MethodBase.clickButton_ByXpath(ClickSetting);
        LOGGER.info("Click Setting");
        MethodBase.clickButton_ByXpath(ClickGeneralConfiguration);
        LOGGER.info("Click GeneralConfiguration");
        MethodBase.clickButton_ByXpath(ClickDefectStatus);
        LOGGER.info("Click DefectStatus");
        MethodBase.clickButton_ByXpath(ClickAddStatus);
        LOGGER.info("Click AddStatus");
        MethodBase.setText_ByXpath(txtDefectStatus,Status);
        LOGGER.info("Enter Defect status");
        MethodBase.setText_ByXpath(txtDefectDescription,Description);
        LOGGER.info("Enter Defect Description");
        MethodBase.clickButton_ByXpath(Clickok);
        LOGGER.info("Click Ok ");


    }
    public static void EditStatusFunction(String Status,String Description ){
        MethodBase.clickButton_ByXpath(ClickSetting);
        LOGGER.info("Click Setting");
        MethodBase.clickButton_ByXpath(ClickGeneralConfiguration);
        LOGGER.info("Click GeneralConfiguration");
        MethodBase.clickButton_ByXpath(ClickDefectStatus);
        LOGGER.info("Click DefectStatus");
        MethodBase.click_ByXpath(ClickEditDefect);
        MethodBase.setText_ByXpath(txtDefectStatus,Status);
        LOGGER.info("Enter Defect status");
        MethodBase.setText_ByXpath(txtDefectDescription,Description);
        LOGGER.info("Enter Defect Description");
        MethodBase.clickButton_ByXpath(Clickok);
        LOGGER.info("Click Ok ");

    }



    }
