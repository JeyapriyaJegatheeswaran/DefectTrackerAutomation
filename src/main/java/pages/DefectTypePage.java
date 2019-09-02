package pages;

import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectTypePage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectTypePage.class));
    private static String btnaddDefectType = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String txtDefectType = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String txtDescription = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String btnOk = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";


    public static boolean isDefectPageDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefectType);
    }
    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefectType);

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
