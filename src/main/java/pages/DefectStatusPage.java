package pages;


import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;


import java.util.logging.Logger;

public class DefectStatusPage extends PageBase {
    public static SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectStatusPage.class));
    private static String ClickSetting = "//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/div[1]";
    private static String HrDefectStatus = "//h3";
    private static String ClickGeneralConfiguration = "//span[text()=\"General Configuration\"]";
    private static String ClickDefectStatus = "//*[@id=\"sub5$Menu\"]/li[4]";
    private static String HrDashboard = "//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[1]/div/div/div/h1";
    private static String ClickAddStatus = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String txtDefectStatus = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String txtDefectDescription= "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String Clickok= "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String ClickEditDefect= "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[1]/td[3]/span/i[1]";
    private static String DeleteDefect= "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[1]/td[3]/span/i[2]";
    private static String txtResult = "//td[text()='TESTTEST']";
    private static String meassagebox = "/html/body/div[3]/div/span/div/div/div";
    private static String commonValidMsgStatus = "//div[text()='LINK!']";
    private static String SideGentralConfigration_show="//span[text()=\"General Configuration\"]";


//    public static boolean isDefectPageDisplayed(){
//        return MethodBase.isDisplayed_ByXpath(ClickAddStatus);
//    }
    public static String CheckValidMsg(String link){

        return MethodBase.get_Text(commonValidMsgStatus.replace("LINK", link));
    }
    public static String getMeassagebox(){
        return MethodBase.get_Text(meassagebox);
    }
    public static String getResult(){
        return MethodBase.get_Text(txtResult);
    }
    public static boolean isDefectDashboardPageDisplayed(){
        return MethodBase.isDisplayed_ByXpath(HrDashboard);
    }
    public static boolean isDefectStatusPageDisplayed(){
        return MethodBase.isDisplayed_ByXpath(HrDefectStatus);
    }

    public static boolean isDisplayedGeneralConfiguration(){
        return MethodBase.isDisplayed_ByXpath(SideGentralConfigration_show);
    }
    public static boolean isDefectStatusDisplayed(){
        return MethodBase.isDisplayed_ByXpath(ClickDefectStatus);
    }
    public static boolean isDefectAddStatusDisplayed(){
        return MethodBase.isDisplayed_ByXpath(ClickAddStatus);
    }
//    public static void clickSetting() {
//        MethodBase.clickButton_ByXpath(ClickSetting);
//
//    }
    public static void clickSetting() {
      MethodBase.clickButton_ByXpath(ClickSetting);

    }
    public static void clickok() {
        MethodBase.clickButton_ByXpath(Clickok);

    }
    public static void clickGeneralConfiguration() {
        MethodBase.clickButton_ByXpath(ClickGeneralConfiguration);
    }
    public static void clickClickDefectStatus() {
        MethodBase.clickButton_ByXpath(ClickDefectStatus);
    }
    public static void clickAddStatus() {
        MethodBase.clickButton_ByXpath(ClickAddStatus);
    }
    public static void setDefectType(String defectType){
        MethodBase.setText_ByXpath(txtDefectStatus,defectType);
    }
    public static void setDefectDescription(String defectdc){
        MethodBase.setText_ByXpath(txtDefectDescription,defectdc);
    }
    public static void clickEdit() {
        MethodBase.clickButton_ByXpath(ClickEditDefect);
    }
    public static void clickDelete() {
        MethodBase.clickButton_ByXpath(DeleteDefect);
    }



    public static void AddStatusFunction(String Status,String Description ){
        softAssert = new SoftAssert();
        MethodBase.clickButton_ByXpath(ClickSetting);
        LOGGER.info("Click Setting");
        MethodBase.isDisplayed_ByXpath(HrDashboard);
        LOGGER.info("Hearder Show");
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
    public static void DeleteStatusFunction(){
        MethodBase.clickButton_ByXpath(ClickSetting);
        LOGGER.info("Click Setting");
        MethodBase.clickButton_ByXpath(ClickGeneralConfiguration);
        LOGGER.info("Click GeneralConfiguration");
        MethodBase.clickButton_ByXpath(ClickDefectStatus);
        LOGGER.info("Click DefectStatus");
        MethodBase.clickButton_ByXpath(DeleteDefect);
        LOGGER.info("Click Delete Data");

    }


    }
