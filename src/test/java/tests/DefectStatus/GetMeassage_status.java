package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class GetMeassage_status extends TestBase {
<<<<<<< HEAD
    @Test(priority=68,groups = { "test", "regression"})
    public void GetMeassageTest() {
=======
    @Test(priority=70,groups = { "test", "regression"})
    public void getMeassage() {
>>>>>>> 4f5adaa958abf4489b9fb018ad69fe2b13d785f6
        softAssert = new SoftAssert();
        PageBase.implicitWait(2);
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        DefectStatusPage.clickAddStatus();
        DefectStatusPage.implicitWait(2);
        extentTest.log(LogStatus.PASS, "Click Add Status ");
        DefectStatusPage.setDefectType("");
        extentTest.log(LogStatus.PASS, "Enter Type ");
        DefectStatusPage.setDefectDescription("");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        DefectStatusPage.implicitWait(2);
        //  softAssert.assertEquals(DefectStatusPage.getMeassagebox(),"Invalid Data"," This Data not matching");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Data"),"Invalid Data","fail");
        softAssert.assertAll();
    }
}
