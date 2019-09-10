package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
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
    @Test(groups = "tests",priority=5)
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


}
