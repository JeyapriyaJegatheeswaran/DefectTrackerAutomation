package pages;

import org.openqa.selenium.Keys;

import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectTypePage extends PageBase {


    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectTypePage.class));
    private static String btnaddDefectType = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String AddDefectTypeTitle = "//*[@id=\"rcDialogTitle0\"]";
    private static String txtDefectType = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String txtDescription = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String btnOk = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String ShortMeassage = "//*[text()=\"Required greater than 2 characters\"]";
    private static String DecriptionShortMeassage = "//*[text()=\"Required greater than 10 characters\"]";
    private static String getTableDefectType = "//span[text()=\"Defect Type\"]";
    private static String getTableDefectDescription = "//span[text()=\"Description\"]";
    private static String getTableDefectAction = "//span[text()=\"Action\"]";
    private static String BtnCancel = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";

    public static boolean isDefectPageDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefectType);
    }
    public static boolean isDefectTypeDisplayed(){
        return MethodBase.isDisplayed_ByXpath(getTableDefectType);
    }
    public static boolean isDefectDescriptionDisplayed(){
        return MethodBase.isDisplayed_ByXpath(getTableDefectDescription);
    }
    public static boolean isDefectActionDisplayed(){
        return MethodBase.isDisplayed_ByXpath(getTableDefectAction);
    }
    public static boolean isDefectPageDisplayedShortMeasssage(){
        return MethodBase.isDisplayed_ByXpath(ShortMeassage);
    }
    public static boolean isDefectPageDisplayedDecriptionShortMeasssage(){
        return MethodBase.isDisplayed_ByXpath(DecriptionShortMeassage);
    }
    public static boolean isDefectPageCheckTile(){
        return MethodBase.isDisplayed_ByXpath(AddDefectTypeTitle);
    }
    public static boolean isDefectPageCheckTypeField(){
        return MethodBase.isDisplayed_ByXpath(txtDefectType);
    }
    public static boolean isDefectPageCheckTypeDcriptionField(){
        return MethodBase.isDisplayed_ByXpath(txtDescription);
    }
    public static boolean isDefectPageCheckTypeOkbutton(){
        return MethodBase.isDisplayed_ByXpath(btnOk);
    }

    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefectType);

    }
    public static void clickCancelDefect() {
        MethodBase.clickButton_ByXpath(BtnCancel);

    }
    public static void setDefectType(String defectType){
        MethodBase.setText_ByXpath(txtDefectType,defectType);


    }
    public static void setDescription(String description){
        MethodBase.setText_ByXpath(txtDescription,description);
    }
    public static void clickOkButton(){
        MethodBase.clickButton_ByXpath(btnOk);
    }
}
