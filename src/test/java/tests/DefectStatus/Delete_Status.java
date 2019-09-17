package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class Delete_Status extends TestBase {
    @Test(priority=1)
    public void DeleteStatus() {
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
        DefectStatusPage.clickDelete();
        extentTest.log(LogStatus.PASS, "Successfull click Delete ststus");
        softAssert.assertTrue(DefectStatusPage.isDefectStatusConformDeleteDisplayed(), "Delete Conform Page not Displayed");
        DefectStatusPage.clickConformDelete();
        extentTest.log(LogStatus.PASS, "Successfull click ConformDelete ststus");
        softAssert.assertAll();

    }
    @Test(priority=2)
    public void CheckDeleteformStatus() {
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
        softAssert.assertAll();

    }
    @Test(priority=3)
    public void CheckPopupmeassageDeleteStatus() {
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
        DefectStatusPage.clickDelete();
        extentTest.log(LogStatus.PASS, "Successfull click Delete ststus");
        softAssert.assertTrue(DefectStatusPage.isDefectStatusConformDeleteDisplayed(), "Delete Conform Page not Displayed");
        softAssert.assertAll();

    }

}
