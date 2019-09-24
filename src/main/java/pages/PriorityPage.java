package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import utils.MethodBase;

import static utils.PageBase.getDriver;

public class PriorityPage {
    private static final Logger LOGGER = Logger.getLogger(PriorityPage.class);

    //ADD Priority
    private static String PriorityPageVerify = "//h3[text()='Priority Configuration']";
    private static String priorityBtnVerify = "//span[text()=\"Add priority\"]";
    private static String priorityAddFormVerify = "//div[text()=\" Add Priority\"]";
    private static String btnAddPriority = "//button[@id=\"addPriority\"]";

    private static By nameVerify = By.xpath("//label[@title=\"Name\"]");
    private static By descriptionVerify = By.xpath("//label[@title=\"Description\"]");
    private static By IconVerify = By.xpath("//label[@title=\"Icon\"]");
    private static By ColorVerify = By.xpath("//label[@title=\"Colour\"]");
    private static By OKBtnVerify = By.xpath("//span[text()=\"OK\"]");
    private static By CancleBtnVerify = By.xpath("//span[text()=\"Cancel\"]");

    private static String priorityName = "//input[@id=\"priorityName\"]";
    private static String priorityDescription = "//input[@id=\"priorityValue\"]";
    private static String icon1 = "//div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    private static String clickColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[6]/span";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String cancleBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";

    //EDIT Priority
    private static String editBtnVerify ="//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='higth']]/td[6]/span/i[1]";
    private static String clickEditBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='higth']]/td[6]/span/i[1]";
    private static String editFormVerify = "//div[text()=\"Edit priority\"]";
    private static String priorityNameEdited = "//input[@id=\"priorityName\" and @value=\"higth\"]";
    private static String priorityDescriptionEdited = "//input[@id=\"priorityValue\" and @value=\"defect tracker configuration parts\"]";
    private static String icon1Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div";
    private static String icon2Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[1]";
    private static String clickColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[6]/span";
    private static String okBtnEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static By editNameVerify = By.xpath("//label[@title=\" Name\"]");
    private static By editDescriptionVerify = By.xpath("//label[@title=\"Description\"]");
    private static By editIconVerify = By.xpath("//label[@title=\"Icon\"]");
    private static By editColorVerify = By.xpath("//label[@title=\"Colour\"]");
    private static By editOKBtnVerify = By.xpath("//span[text()=\"OK\"]");
    private static By editCancleBtnVerify = By.xpath("//span[text()=\"Cancel\"]");

    private static String clickDeleteBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='editTest']]/td[6]/span/i[2]";
    private static String clickDeleteOKBtn = "//*[@id=\"deleteConfirmPriority\"]/div/div/div[2]/button[2]";

    private static By addVerify = By.xpath("//*[text()=\"Medium\"]");
    private static By editVerify = By.xpath("//*[text()=\"editTest\"]");
    private static By deleteVerify = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='editTest']]");


    //ADD Priority Form Items Verify
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

    //ADD Priority
    public static String isPriorityPageDisplay() { return MethodBase.get_Text(PriorityPageVerify);}
    public static String priorityAddButtonVerify(){return MethodBase.get_Text(priorityBtnVerify);}
    public static String priorityAddFormVerify(){return MethodBase.get_Text(priorityAddFormVerify);}
    public static void clickAddPrioritybtn() {
        MethodBase.clickButton_ByXpath(btnAddPriority);
    }
    public static void clearPeriorityName() {
        MethodBase.clear_ByXpath(priorityName);
    }
    public static void setPeriorityName(String periorityname) { MethodBase.setText_ByXpath(priorityName, periorityname);}
    public static void clearPeriorityDescription() { MethodBase.clear_ByXpath(priorityDescription); }
    public static void setPeriorityDescription(String perioritydescription) {
        MethodBase.setText_ByXpath(priorityDescription, perioritydescription); }
    public static void setIcon() { MethodBase.selectAction(icon1, icon2); }
    public static void clickColor() {
        MethodBase.click_ByXpath(clickColor);
    }
    public static void selectColor() {
        MethodBase.click_ByXpath(selectColor);
    }
    public static void clickAddbtn() {
        MethodBase.clickButton_ByXpath(okBtn);
    }
    public static void clickCancelBtn(){MethodBase.clickButton_ByXpath(cancleBtn);}

    //EDIT Form Item Verify
    public static String isEditDisplayName() { return  getDriver().findElement(editNameVerify).getText(); }
    public static String isEditDisplayDescription() { return  getDriver().findElement(editDescriptionVerify).getText();}
    public static String isEditDisplayIcon() {
        return  getDriver().findElement(editIconVerify).getText();
    }
    public static String isEditDisplayColor() {
        return  getDriver().findElement(editColorVerify).getText();
    }
    public static String isEditDisplayOKBtn() { return  getDriver().findElement(editOKBtnVerify).getText(); }
    public static String isEditDisplayCancelBtn() {
        return  getDriver().findElement(editCancleBtnVerify).getText();
    }

    //EDIT Priority
    public static boolean editButtonVerify(){return MethodBase.isDisplayed_ByXpath(editBtnVerify);}
    public static void clickEditBtn() { MethodBase.click_ByXpath(clickEditBtn); }
    public static String editFormVerify(){return MethodBase.get_Text(editFormVerify);}
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

    //DELETE Priority
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

    public static boolean isElementPresentDelete() {
        try {
            getDriver().findElement(deleteVerify);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}