package tests.DefectStatus;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class Add_Status_Test extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(Add_Status_Test.class);
    @Test(priority=51,groups = { "test", "regression","smoke"})
    public void AddDefectStatus() {
        softAssert = new SoftAssert();
        PageBase.implicitWait(2);
//        DefectStatusPage.AddStatusFunction("New","TestNormals");
       softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        LOGGER.info("Click GeneralConfiguration Tab");
        DefectStatusPage.clickClickDefectStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Status Tab");
        LOGGER.info("Click Defect Status Tab");
        softAssert.assertTrue( DefectStatusPage.isDefectStatusPageDisplayed(),"Defect status Dashboard Page is not Displayed");
        LOGGER.info("Defect status Dashboard Page Displayed");
        DefectStatusPage.clickAddStatus();
        LOGGER.info("Click Add Button");
        DefectStatusPage.implicitWait(2);
        extentTest.log(LogStatus.PASS, "Click Add Status ");
        DefectStatusPage.setDefectType("New");
        extentTest.log(LogStatus.PASS, "Enter Type ");
        LOGGER.info("Enter Type ");
        DefectStatusPage.setDefectDescription("TestDcription");
        LOGGER.info("Enter DefectDescription");
        extentTest.log(LogStatus.PASS, "Enter DefectDescription ");
        implicitWait(3);
        DefectStatusPage.clickok();
        LOGGER.info("Click Ok ");
        extentTest.log(LogStatus.PASS, "Click Ok ");
        softAssert.assertAll();
    }
}
