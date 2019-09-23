package pages;
import utils.MethodBase;
import utils.PageBase;


import java.util.logging.Logger;

public class DefectStatusPage extends PageBase {


    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectStatusPage.class));
    private static String ClickSetting = "//*[@id=\"root\"]/div/section/aside/div/ul/li[9]/div[1]";
    private static String HrDefectStatus = "//h3";
    private static String ClickGeneralConfiguration = "//span[text()=\"General Configuration\"]";
    private static String ClickDefectStatus = "//*[@id=\"sub5$Menu\"]/li[4]";
    private static String HrDashboard = "//*[@id=\"root\"]/div/section/aside/div/div";
    private static String ClickAddStatus = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String txtDefectStatus = "//input[@id=\"statusName\"]";
    private static String CheckDC = "//label[text()=\"Description\"]";
    private static String txtDefectDescription= "//input[@id=\"statusValue\"]";
    private static String Clickok= "/html/body/div/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String ClickEditok= "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String ClickEditDefect= "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[1]/td[3]/span/i[1]";
    private static String DeleteDefect= "//*[@id=\"deleteStatus\"]";
    private static String txtResult = "//td[text()='TestLow']";
    private static String meassagebox = "/html/body/div[3]/div/span/div/div/div";
    private static String commonValidMsgStatus = "//div[text()='LINK!']";
    private static String SideGentralConfigration_show="//span[text()=\"General Configuration\"]";
    private static String lowcharecters="//span[text()='LINK']";// Required more than 3 charecters
    private static String ConformDelete="/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String ConformDeleteform="/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div";
    private static String tablevalidate="//span[text()='DefectStatus']";
    private static String tablevalidatedc="//span[text()='Description']";
    private static String cancelbtn="/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";
    private static String txtCheDefectStatus = "//*[@id=\"statusName\"]";
    private static String checkStatus = "//label[text()=\"Defect Status\"]";

    public static boolean ischeckstatusDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtDefectStatus);
    }
    public static boolean ischeckStatusDisplayed(){
        return MethodBase.isDisplayed_ByXpath(checkStatus);
    }
    public static boolean ischeckdcDisplayed(){
        return MethodBase.isDisplayed_ByXpath(CheckDC);
    }
    public static boolean ischeckOkbuttonDisplayed(){
        return MethodBase.isDisplayed_ByXpath(Clickok);
    }
    public static boolean ischeckcancelbuttonDisplayed(){
        return MethodBase.isDisplayed_ByXpath(cancelbtn);
    }
    public static boolean istablevalidateDisplayed(){
        return MethodBase.isDisplayed_ByXpath(tablevalidate);
    }
    public static boolean isttablevalidatedcDisplayed(){
        return MethodBase.isDisplayed_ByXpath(tablevalidatedc);
    }
    public static String CheckValidMsg(String link){

        return MethodBase.get_Text(lowcharecters.replace("LINK", link));
    }
    public static void clickCancelButton() {
        MethodBase.clickButton_ByXpath(cancelbtn);

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
    public static boolean isEditDefectPageDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtDefectStatus);
    }
    public static boolean isEditDefectPagedcDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtDefectDescription);
    }
    public static boolean isEditDefectokPagedcDisplayed(){
        return MethodBase.isDisplayed_ByXpath(ClickEditok);
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
    public static boolean isDefectStatusConformDeleteDisplayed(){
        return MethodBase.isDisplayed_ByXpath(cancelbtn);
    }
    public static boolean isDefectAddStatusDisplayed(){
        return MethodBase.isDisplayed_ByXpath(ClickAddStatus);
    }
    public static boolean isDefectStatusAddfromDisplayed(){
        return MethodBase.isDisplayed_ByXpath(Clickok);
    }

    public static void clickSetting() {
      MethodBase.clickButton_ByXpath(ClickSetting);

    }
    public static void clickok() {
        MethodBase.clickButton_ByXpath(Clickok);

    }public static void clickConformDelete() {
        MethodBase.clickButton_ByXpath(ConformDelete);

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






    }
