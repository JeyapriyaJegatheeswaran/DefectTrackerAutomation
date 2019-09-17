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
    private static String txtResult = "//td[text()='defectId']";
    private static String btnDelete="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'defectId']]/td[7]/span/a/i";
    private static String deletePopup = "//div[@class=\"ant-popover-inner-content\"]";
    private static String txtDeleteConformationMsg="//div[@class=\"ant-popover-message-title\"]";
    private static String btnDeleteOk="/html/body/div/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String btnEdit="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'defectId']]/td[7]/span/i";
    private static String txtDefectTableData="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'defectId']]/td[index]";

    private static String txtDefectTableHeading="//thead/tr/th[. = 'Heading']";

    public static boolean isAddDefectButtonDisplayed(){
         return MethodBase.isDisplayed_ByXpath(btnaddDefect);
    }
    public static boolean isDefectPageTitleDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtTitle);
    }
    public static boolean isDefectTableDisplayed(){
        return MethodBase.isDisplayed_ByXpath(defectTable);
    }
    public static boolean isDefectTableHeadingDisplayed(String heading){
        return MethodBase.isDisplayed_ByXpath(txtDefectTableHeading.replace("Heading",heading));
    }

    public static void clickAddDefect() {
        MethodBase.clickButton_ByXpath(btnaddDefect);

    }
    public static void clickEditButton(String defectId){

        MethodBase.clickButton_ByXpath(btnEdit.replace("defectId",defectId));
    }
    public static String getResult(String defectId){
        return MethodBase.get_Text(txtResult.replace("defectId", defectId));
    }

    public static void clickDeleteDefect(String defectId){
        MethodBase.clickButton_ByXpath(btnDelete.replace("defectId",defectId));
    }
    public static boolean isDefectDeletePopupDisplayed(){
        return MethodBase.isDisplayed_ByXpath(deletePopup);
    }
    public static void clickDeleteOKButton(){

        staticWait(3);
        MethodBase.clickButton_ByXpath(btnDeleteOk);
    }
    public static String verifyEditStatus(String defectId,String index){
        return MethodBase.get_Text(txtDefectTableData.replace("defectId",defectId).replace("index",index));
    }
    public static String verifyConformationMsg(){
        return MethodBase.get_Text(txtDeleteConformationMsg);
    }
}
