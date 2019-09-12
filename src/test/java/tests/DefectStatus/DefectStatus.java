package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Defect.AddDefectPage;
import pages.DefectStatusPage;
import pages.HomePage;
import pages.ModulePage;
import utils.MethodBase;
import utils.PageBase;
import utils.TestBase;

public class DefectStatus  extends TestBase {
    @Test(priority=1)
  public void addStatus() {
        softAssert = new SoftAssert();
        PageBase.implicitWait(2);
//        DefectStatusPage.AddStatusFunction("New","TestNormals");
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
        DefectStatusPage.setDefectType("New");
        extentTest.log(LogStatus.PASS, "Enter Type ");
        DefectStatusPage.setDefectDescription("TestDcription");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        softAssert.assertAll();
}
    @Test(priority=2)
    public void EmptyStatus() {

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
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        softAssert.assertAll();
}
    @Test(priority=3)
    public void DecrptionAddStatus() {
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
        DefectStatusPage.setDefectDescription("NEW High");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        softAssert.assertAll();
    }
    @Test(priority=4)
    public void onlyAddStatus() {
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
        DefectStatusPage.setDefectType("NEW");
        extentTest.log(LogStatus.PASS, "Enter Type ");
        DefectStatusPage.setDefectDescription("");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        softAssert.assertAll();
    }

    @Test(groups = "tests",priority=4)
    public void NumbervalueAddStatus() {
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
        DefectStatusPage.setDefectType("NEW");
        extentTest.log(LogStatus.PASS, "Enter Type ");
        DefectStatusPage.setDefectDescription("TESTTEST");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click Ok ");
        DefectStatusPage.implicitWait(2);
        softAssert.assertEquals(DefectStatusPage.getResult(),"TESTTEST"," This Data not matching");
        softAssert.assertAll();
    }
    @Test(groups = "tests",priority=7)
    public void getMeassage() {
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
    @Test(groups = "tests",priority=5)
     public void  SidebarTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Dashboard Page Show");
        DefectStatusPage.clickSetting();
        staticWait(3);
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        softAssert.assertTrue(DefectStatusPage.isDisplayedGeneralConfiguration(), "GeneralConfiguration not Displayed");
        extentTest.log(LogStatus.PASS, "GeneralConfiguration Show");
       // DefectStatusPage.clickGeneralConfiguration();
        softAssert.assertAll();
    }
    @Test(groups = "tests",priority=6)
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
    @Test(groups = "tests",priority=7)
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
    @Test(groups = "tests",priority=9)
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
    @Test(groups = "tests",priority=10)
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
    @Test(groups = "tests",priority=11)
    public void  invalidateData() {
        softAssert = new SoftAssert();
        sabbartest();
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Ok");
        DefectStatusPage.setDefectType("gjt766h");
        extentTest.log(LogStatus.PASS, "Enter the Type");
        DefectStatusPage.setDefectDescription("hsdhfgywd23");
        extentTest.log(LogStatus.PASS, "Enter the decription");
        DefectStatusPage.clickok();
        extentTest.log(LogStatus.PASS, "Click ok");
        softAssert.assertAll();

    }
    @Test(groups = "tests",priority=12)
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
    @Test(groups = "tests",priority=13)
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



}
