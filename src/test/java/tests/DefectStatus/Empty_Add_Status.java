package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.TestBase;

public class Empty_Add_Status  extends TestBase {
    @Test(priority=68,groups = { "test", "regression"})
    public void  emptystatus() {
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
        DefectStatusPage.setDefectType(" ");
        DefectStatusPage.setDefectDescription(" ");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Defect Status"),"Invalid Defect Status","fail");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Required more than 5 charecters"),"Required more than 5 charecters","fail");
        softAssert.assertAll();
    }
}
