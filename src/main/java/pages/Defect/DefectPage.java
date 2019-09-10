package pages.Defect;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class DefectPage extends PageBase {
    public SoftAssert softAssert;
////*[@id="root"]/div/section/section/main/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[td[3][. = 'Login']]/td[5]
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(DefectPage.class));
    private static String btnaddDefect = "//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[1]/div/button";
    private static String txtTitle = "//span[@class='ant-page-header-title-view-title']";
    private static String defectTable = "//thead[@class='ant-table-thead']";
    private static String txtResult = "//td[text()='jp1234']";
    private static String btnDelete="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'jp1234']]/td[7]/span/a/i";
    private static String btnDeleteOk="/html/body/div/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String btnEdit="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'DEF001']]/td[7]/span/i";

    public static boolean isAddDefectButtonDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefect);
    }
    public static boolean isDefectPageTitleDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtTitle);
    }
    public static boolean isDefectTableDisplayed(){
        return MethodBase.isDisplayed_ByXpath(defectTable);
    }

    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefect);

    }
    public static void clickEditButton(){

        MethodBase.clickButton_ByXpath(btnEdit);
    }
    public static String getResult(){
        return MethodBase.get_Text(txtResult);
    }

    public static void deleteDefect(){
        MethodBase.clickButton_ByXpath(btnDelete);
        staticWait(3);
        MethodBase.clickButton_ByXpath(btnDeleteOk);
    }
}
