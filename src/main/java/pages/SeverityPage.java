package pages;

import org.openqa.selenium.By;
import utils.MethodBase;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static utils.PageBase.getDriver;

public class SeverityPage {

    private static String severityPageDisplayVerify = "//h3[text()=\"Severity Configuration\"]";
    private static String btnAddSeverity = "//button[@id=\"addSeverity\"]";
    //Add Severity
    private static String addBtnVerify = "//button[@id=\"addSeverity\"]";
    private static String formAddSeverityVerify = "//div[text()=\" Add severity\"]";
    private static By severityAddFormVerifyText = By.xpath("//div[text()=\" Add severity\"]");

    private static By nameVerify = By.xpath("//label[@title=\"Name\"]");
    private static By descriptionVerify = By.xpath("//label[@title=\"Description\"]");
    private static By IconVerify = By.xpath("//label[@title=\"Icon\"]");
    private static By ColorVerify = By.xpath("//label[@title=\"Colour\"]");
    private static By OKBtnVerify = By.xpath("//span[text()=\"OK\"]");
    private static By CancleBtnVerify = By.xpath("//span[text()=\"Cancel\"]");
    private static String CancleBtnVerify1 = "//span[text()=\"Cancel\"]";

    private static String severityName = "//input[@id=\"severityName\"]";
    private static String severityDescription = "//input[@id=\"severityValue\"]";
    private static String icon1 = " //div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    private static String clickColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[8]/span";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String cancleBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";

    private static String AddedItemCheck = "//td[text()='Low']";

    //Edit Severity
    private static By editBtnVerify = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='Medium']]/td[6]/span/i[1]");
    private static String editBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='Medium']]/td[6]/span/i[1]";
    private static String severityNameEdited = "//input[@id=\"severityName\" and @value=\"Medium\"]";
    private static String severityDescriptionEdited = "//input[@id=\"severityValue\" and @value=\"test description\"]";
    private static String icon1Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[1]/div[1]";
    private static String icon2Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[1]";
    private static String clickColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[8]/span";
    private static String okBtnEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static String formEditSeverityVerify = "//div[text()=\"Edit Severity\"]";
    private static By editNameVerify = By.xpath("//label[@title=\"Name\"]");
    private static By editDescriptionVerify = By.xpath("//label[@title=\"Description\"]");
    private static By ediyIconVerify = By.xpath("//label[@title=\"Icon\"]");
    private static By editColorVerify = By.xpath("//label[@title=\"Colour\"]");
    private static By editOKBtnVerify = By.xpath("//span[text()='OK']");
    private static By editCancleBtnVerify = By.xpath("//span[text()='Cancel']");

    private static String editAddedItemCheck = "//td[text()='highest']";

    private static String deleteBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='Low']]/td[6]/span/i[2]";
    private static String deleteOKbtn = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/button[2]";

    //Cancle Severity
    private static String cancleName = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[div[label[.=\"Name\"]]]/div[2]/div/span/input";
    private static String cancleDescription = "";
    private static String cancleIcon = "";
    private static String cancleColor = "";
    //Add_Severity

    public static boolean isSeverityPageDisplay() {
        return MethodBase.isDisplayed_ByXpath(severityPageDisplayVerify);

    }
    public static String severityAddBtnVerify(){return MethodBase.get_Text(addBtnVerify); }
    public static void clickAddSeveritybtn(){
        MethodBase.clickButton_ByXpath(btnAddSeverity);
        LOGGER.info("Clicked severity Add button");
    }
    public static void isSeverityAddFormDisplay() {
        MethodBase.isDisplayed_ByXpath(formAddSeverityVerify);
        LOGGER.info("Severity Add Form Displayed");
    }
    public static String severityFormVerifyText() {
        return  getDriver().findElement(severityAddFormVerifyText).getText(); }
    //Add Severity Item Verify

    public static String isDisplayName() { return  getDriver().findElement(nameVerify).getText(); }
    public static String isDisplayDescription() {
        return  getDriver().findElement(descriptionVerify).getText();
    }
    public static String isDisplayIcon() {
        return  getDriver().findElement(IconVerify).getText();
    }
    public static String isDisplayColor() {
        return  getDriver().findElement(ColorVerify).getText();
    }
    public static String isDisplayOKBtn() {
        return  getDriver().findElement(OKBtnVerify).getText();
    }
    public static String isDisplayCancleBtn() {
        return  getDriver().findElement(CancleBtnVerify).getText();
    }
    //Add Severity Item

    public static void clearSeverityName(){
        MethodBase.clear_ByXpath(severityName);
        LOGGER.info("Severity name cleared");
    }
    public static void setSeverityName(String severityname){
        MethodBase.setText_ByXpath(severityName,severityname);
        LOGGER.info("Severity name added");
    }
    public static void clearSeverityDescription(){
        MethodBase.clear_ByXpath(severityDescription);
        LOGGER.info("Severity description cleared");
    }
    public static void setSeverityDescription(String severitydescription){
        MethodBase.setText_ByXpath(severityDescription,severitydescription);
        LOGGER.info("severity description added");
    }
    public static void setIcon(){
        MethodBase.selectAction(icon1,icon2);
        LOGGER.info("severity icon added");
    }
    public static void clickColor(){MethodBase.click_ByXpath(clickColor);
        LOGGER.info("colour dropdown clicked");
    }
    public static void selectColor(){MethodBase.click_ByXpath(selectColor);
        LOGGER.info(" severity colour selected");
    }
    public static void clickAddOKbtn(){
        MethodBase.clickButton_ByXpath(okBtn);
        LOGGER.info("OK button clicked");
    }
    public static void clickCancleBtn(){ MethodBase.clickButton_ByXpath(cancleBtn);
        LOGGER.info("CANCEL button clicked ");
    }
    public static String checkAddedItem(){return MethodBase.get_Text(AddedItemCheck); }

    //cancle severity
    public static String severityCancleBtnVerify(){return MethodBase.get_Text(CancleBtnVerify1);}
    public static String cancleSeverityAddName() {
        return MethodBase.get_Text(cancleName);
    }
//    public static void cancleSeverityAddDescription() {
//        MethodBase.isDisplayed_ByXpath();
//    }
//    public static void cancleSeverityAddIcon() {
//        MethodBase.isDisplayed_ByXpath();
//    }
//    public static void cancleSeverityAddColor() {
//        MethodBase.isDisplayed_ByXpath();
//    }


    //Edit Severity

    public static boolean isDisplayEditBtn() {
        return  getDriver().findElement(editBtnVerify).isDisplayed(); }
    public static void clickEditbtn(){
        MethodBase.clickButton_ByXpath(editBtn);
        LOGGER.info("Edit button clicked");
    }
    public static String isSeverityEditFormDisplay() { return MethodBase.get_Text(formEditSeverityVerify); }


    //Edit Severity Item Verify

    public static String isEditDisplayName() {
        return  getDriver().findElement(editNameVerify).getText();
    }
    public static String isEditDisplayDescription() { return  getDriver().findElement(editDescriptionVerify).getText(); }
    public static String isEditDisplayIcon() {
        return  getDriver().findElement(ediyIconVerify).getText();
    }
    public static String isEditDisplayColor() {
        return  getDriver().findElement(editColorVerify).getText();
    }
    public static String isEditDisplayOKBtn() {
        return  getDriver().findElement(editOKBtnVerify).getText();
    }
    public static String isEditDisplayCancleBtn() {
        return  getDriver().findElement(editCancleBtnVerify).getText();
    }

    public static void clearSeverityNameEdited(){
        MethodBase.clear_ByXpath(severityNameEdited);
        LOGGER.info("Severity Edit_Name cleared");
    }
    public static void setSeverityNameEdited(String severityname){ MethodBase.setText_ByXpath(severityNameEdited,severityname);
        LOGGER.info("Severity Edit_Name Edited");}
    public static void clearSeverityDescriptionEdited(){
        MethodBase.clear_ByXpath(severityDescriptionEdited);
        LOGGER.info("Severity Edit_description cleared");
    }
    public static void setSeverityDescriptionEdited(String severitydescription){
        MethodBase.setText_ByXpath(severityDescriptionEdited,severitydescription);
        LOGGER.info("Severity Edit_description Edited");}
    public static void setIconEdited(){ MethodBase.selectAction(icon1Edited,icon2Edited);
        LOGGER.info("Severity Edit_Icon Edited");}
    public static void clickColorEdited(){MethodBase.click_ByXpath(clickColorEdited);
        LOGGER.info("Severity Edit_color drop down clicked");}
    public static void selectColorEdited(){MethodBase.click_ByXpath(selectColorEdited);
        LOGGER.info("Severity Edit_color edited");}
    public static void clickEditOKbtn(){ MethodBase.clickButton_ByXpath(okBtnEdited);
        LOGGER.info("Severity Edit_OK button clicked");}

    public static String checkEditedItem(){return MethodBase.get_Text(editAddedItemCheck);}

    //Delete Severity
    public static void clickDeletebtn(){
        MethodBase.clickButton_ByXpath(deleteBtn);
        LOGGER.info("Delete button clicked");
    }
    public static void clickDeleteOKbtn(){
        MethodBase.clickButton_ByXpath(deleteOKbtn);
        LOGGER.info("delete OK button clicked");
    }

}
