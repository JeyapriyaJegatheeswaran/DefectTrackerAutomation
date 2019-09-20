package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class EditDefectStatus  extends TestBase {
    @Test(priority=64,groups = { "test", "regression","smoke"})
    public void EditStatus() {
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        DefectStatusPage.clickEdit();
        extentTest.log(LogStatus.PASS, "Click Edit Button");
        DefectStatusPage.setDefectType("NEWNEW");
        DefectStatusPage.setDefectDescription("NEWTEST");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=130,groups = { "test", "regression"})
    public void verifyEditStatus() {
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        DefectStatusPage.clickEdit();
        extentTest.log(LogStatus.PASS, "Click Edit Button");
        implicitWait(3);
        softAssert.assertTrue(DefectStatusPage.isEditDefectPageDisplayed(), "Edit Page is not Displayed");
        softAssert.assertTrue(DefectStatusPage.isEditDefectPagedcDisplayed(), "Edit Page dcriptionis not Displayed");
        softAssert.assertTrue(DefectStatusPage.isEditDefectokPagedcDisplayed(), "Edit Page ok button is not Displayed");
        implicitWait(3);
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=129,groups = { "test", "regression","smoke"})
    public void InvalidEditStatus() {
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        DefectStatusPage.clickEdit();
        extentTest.log(LogStatus.PASS, "Click Edit Button");
        DefectStatusPage.setDefectType("");
        DefectStatusPage.setDefectDescription("");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=128,groups = { "test", "regression","smoke"})
    public void SpecialEditStatus() {
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        DefectStatusPage.clickEdit();
        extentTest.log(LogStatus.PASS, "Click Edit Button");
        DefectStatusPage.setDefectType("8eff/*");
        DefectStatusPage.setDefectDescription("52488w223");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
}
