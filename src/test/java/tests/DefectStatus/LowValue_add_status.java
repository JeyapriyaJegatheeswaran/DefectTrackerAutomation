package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.TestBase;

public class LowValue_add_status extends TestBase {
    @Test(groups = "tests",priority=8)
    public void  lowaddstatus() {
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
        DefectStatusPage.setDefectType("df");
        DefectStatusPage.setDefectDescription("kkk");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Required more than 3 charecters"),"Required more than 3 charecters","fail");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Required more than 5 charecters"),"Required more than 5 charecters","fail");
        softAssert.assertAll();
    }
}
