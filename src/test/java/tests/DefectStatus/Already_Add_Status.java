package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.TestBase;

public class Already_Add_Status extends TestBase {
    @Test(priority=1,groups = { "test", "regression"})
    public void  addstatusequal() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Dashboard Page Show");
        DefectStatusPage.clickSetting();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        softAssert.assertTrue(DefectStatusPage.isDisplayedGeneralConfiguration(), "GeneralConfiguration not Displayed");
        extentTest.log(LogStatus.PASS, "GeneralConfiguration Show");
        DefectStatusPage.clickGeneralConfiguration();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Configuration");
        softAssert.assertTrue(DefectStatusPage.isDefectStatusDisplayed(), "DefectStatus Tab not Displayed");
        extentTest.log(LogStatus.PASS, "Status Tab Show");
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status");
        softAssert.assertTrue(DefectStatusPage.isDefectAddStatusDisplayed(), "AddStatus Button not Displayed");
        extentTest.log(LogStatus.PASS, "Log AddStatus Button Show");
        DefectStatusPage.clickAddStatus();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Add Status");
        softAssert.assertTrue(DefectStatusPage.isDefectStatusAddfromDisplayed(), "AddStatus Form not Displayed");
        extentTest.log(LogStatus.PASS, "Successfull Show Add form");
        DefectStatusPage.setDefectType("Meddium");
        extentTest.log(LogStatus.PASS, "Enter the Type");
        DefectStatusPage.setDefectDescription("TestLow");
        extentTest.log(LogStatus.PASS, "Enter the decription");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click ok");
        implicitWait(2);
        softAssert.assertEquals(DefectStatusPage.getResult(),"TestLow","not match");
        extentTest.log(LogStatus.PASS, "Successfull Show getresult");
        softAssert.assertAll();
    }
}
