package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import utils.MethodBase;

import static utils.PageBase.getDriver;

public class PriorityPage {
    private static final Logger LOGGER = Logger.getLogger(PriorityPage.class);

    private static String PriorityPageVerify = "//h3[text()='Priority Configuration']";
    private static String priorityBtnVerify = "//span[text()=\"Add priority\"]";
    private static String btnAddPriority = "//button[@id=\"addPriority\"]";
    private static String priorityName = "//input[@id=\"priorityName\"]";
    private static String priorityDescription = "//input[@id=\"priorityValue\"]";
    private static String icon1 = "//div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    private static String clickColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[6]/span";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static String clickEditBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='higth']]/td[6]/span/i[1]";
    private static String priorityNameEdited = "//input[@id=\"priorityName\" and @value=\"higth\"]";
    private static String priorityDescriptionEdited = "//input[@id=\"priorityValue\" and @value=\"defect tracker configuration parts\"]";
    private static String icon1Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div";
    private static String icon2Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[1]";
    private static String clickColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[6]/span";
    private static String okBtnEdited = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static String clickDeleteBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='higth']]/td[6]/span/i[2]";
    private static String clickDeleteOKBtn = "/html/body/div/div/div/div/div[2]/div/div/div[2]/button[2]";

    private static By addVerify = By.xpath("//*[text()=\"Medium\"]");
    private static By editVerify = By.xpath("//*[text()=\"editTest\"]");
    private static By deleteVerify = By.xpath("//*[text()=\"editTest\"]");


    //Add Priority
    public static String isPriorityPageDisplay() {
        return MethodBase.get_Text(PriorityPageVerify);}
        //LOGGER.info("Priority Page is Displayed "); }
    public static String priorityAddButtonVerify(){return MethodBase.get_Text(priorityBtnVerify);}
    public static void clickAddPrioritybtn() {
        MethodBase.clickButton_ByXpath(btnAddPriority);
    }
    public static void clearPeriorityName() {
        MethodBase.clear_ByXpath(priorityName);
    }
    public static void setPeriorityName(String periorityname) {
        MethodBase.setText_ByXpath(priorityName, periorityname); }
    public static void clearPeriorityDescription() {
        MethodBase.clear_ByXpath(priorityDescription); }
    public static void setPeriorityDescription(String perioritydescription) {
        MethodBase.setText_ByXpath(priorityDescription, perioritydescription); }
    public static void setIcon() {
        MethodBase.selectAction(icon1, icon2); }
    public static void clickColor() {
        MethodBase.click_ByXpath(clickColor);
    }
    public static void selectColor() {
        MethodBase.click_ByXpath(selectColor);
    }
    public static void clickAddbtn() {
        MethodBase.clickButton_ByXpath(okBtn);
    }

    //Edit Priority
    public static void clickEditBtn() {
        MethodBase.click_ByXpath(clickEditBtn);
    }
    public static void clearPeriorityNameEdited() {
        MethodBase.clear_ByXpath(priorityNameEdited);
    }
    public static void setPeriorityNameEdited(String periorityname) {
        MethodBase.setText_ByXpath(priorityNameEdited, periorityname); }
    public static void clearPeriorityDescriptionEdited() {
        MethodBase.clear_ByXpath(priorityDescriptionEdited);
    }
    public static void setPeriorityDescriptionEdited(String perioritydescription) {
        MethodBase.setText_ByXpath(priorityDescriptionEdited, perioritydescription); }
    public static void setIconEdited() {
        MethodBase.selectAction(icon1Edited, icon2Edited);
    }
    public static void clickColorEdited() {
        MethodBase.click_ByXpath(clickColorEdited);
    }
    public static void selectColorEdited() {
        MethodBase.click_ByXpath(selectColorEdited);
    }
    public static void clickOKbtnEdited() {
        MethodBase.clickButton_ByXpath(okBtnEdited);
    }

    //Delete Priority
    public static void clickDeletebtn() {
        MethodBase.clickButton_ByXpath(clickDeleteBtn);
    }
    public static void clickDeleteOKbtn() {
        MethodBase.clickButton_ByXpath(clickDeleteOKBtn);
    }

    //Verification
    public static String addPriorityVerify(){
        return  getDriver().findElement(addVerify).getText();
    }
    public static String editPriorityVerify(){
        return  getDriver().findElement(editVerify).getText();
    }
    public static Boolean deletePriorityVerify(){
        return  getDriver().findElement(deleteVerify).isDisplayed();
    }
}