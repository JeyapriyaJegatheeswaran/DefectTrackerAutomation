package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.TestBase;

public class DefectStatus  extends TestBase {
    @Test(priority=1,groups = { "test", "regression"})
    public void  SidebarTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Dashboard Page Show");
        DefectStatusPage.clickSetting();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        implicitWait(2);
        softAssert.assertTrue(DefectStatusPage.isDisplayedGeneralConfiguration(), "GeneralConfiguration not Displayed");
        extentTest.log(LogStatus.PASS, "GeneralConfiguration Show");
        // DefectStatusPage.clickGeneralConfiguration();
        softAssert.assertAll();
    }


    @Test(priority=2,groups = { "test", "regression"})
    public void  sabbartest() {
        softAssert = new SoftAssert();
        SidebarTest();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        softAssert.assertTrue(DefectStatusPage.isDisplayedGeneralConfiguration(), "GeneralConfiguration not Displayed");
        extentTest.log(LogStatus.PASS, "GeneralConfiguration Show");
        DefectStatusPage.clickGeneralConfiguration();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Configuration");
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status");
        softAssert.assertTrue(DefectStatusPage.istablevalidateDisplayed(), "DefectStatus Tab not Displayed");
        softAssert.assertTrue(DefectStatusPage.isttablevalidatedcDisplayed(), "DefectStatus Tab not Displayed");
        extentTest.log(LogStatus.PASS, "Status Tab Show");
        softAssert.assertAll();

    }
    @Test(priority=3,groups = { "test", "regression"})
    public void  conformaddstatustest() {
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
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect status");
        softAssert.assertTrue(DefectStatusPage.istablevalidateDisplayed(), "Addstatus table not Displayed");
        extentTest.log(LogStatus.PASS, "Status Tab Show");
        softAssert.assertTrue(DefectStatusPage.isDisplayedGeneralConfiguration(), "GeneralConfiguration not Displayed");
        softAssert.assertAll();

    }




    @Test(priority=4,groups = { "test", "regression"})
    public void  numbervalue() {
        softAssert = new SoftAssert();
        sabbartest();
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Ok");
        DefectStatusPage.setDefectType("45669");
        extentTest.log(LogStatus.PASS, "Enter the Type");
        DefectStatusPage.setDefectDescription("456456");
        extentTest.log(LogStatus.PASS, "Enter the decription");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Defect Status"),"Invalid Defect Status","fail");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Description"),"Invalid Description","fail");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click ok");
        softAssert.assertAll();

    }
    @Test(priority=5,groups = { "test", "regression"})
    public void  spicalvalue() {
        softAssert = new SoftAssert();
        sabbartest();
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Ok");
        DefectStatusPage.setDefectType("/*-@#$");
        extentTest.log(LogStatus.PASS, "Enter the Type");
        DefectStatusPage.setDefectDescription("4/*-1234");
        extentTest.log(LogStatus.PASS, "Enter the decription");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Defect Status"),"Invalid Defect Status","fail");
        softAssert.assertEquals(DefectStatusPage.CheckValidMsg("Invalid Description"),"Invalid Description","fail");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click ok");
        softAssert.assertAll();

    }
    @Test(priority=6,groups = { "test", "regression"})
    public void  canceldata() {
        softAssert = new SoftAssert();
        sabbartest();
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Ok");
        DefectStatusPage.setDefectType("test");
        extentTest.log(LogStatus.PASS, "Enter the Type");
        DefectStatusPage.setDefectDescription("testtest");
        extentTest.log(LogStatus.PASS, "Enter the decription");
        implicitWait(3);
        DefectStatusPage.clickCancelButton();
        extentTest.log(LogStatus.PASS, "Cancel Button");
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click AddStatus");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=7,groups = { "test", "regression"})
    public void  checkaddstatusforms() {
        softAssert = new SoftAssert();
        sabbartest();
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Ok");
        softAssert.assertTrue(DefectStatusPage.ischeckStatusDisplayed(), "AddStatusField not Displayed");
        softAssert.assertTrue(DefectStatusPage.ischeckdcDisplayed(), "AddStatus Dcription Field not Displayed");
        softAssert.assertTrue(DefectStatusPage.ischeckOkbuttonDisplayed(), "AddStatus Ok Button not Displayed");
        softAssert.assertTrue(DefectStatusPage.ischeckcancelbuttonDisplayed(), "AddStatus Cancel Button not Displayed");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }




}
