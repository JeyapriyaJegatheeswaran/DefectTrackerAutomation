package tests.DefectType;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import pages.DefectTypePage;
import utils.TestBase;

public class AddDefectTypeTesting extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDefectTypeTesting.class);
    @Test(priority=51,groups = { "test", "regression","smoke"})
    public void AddDefectType() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        LOGGER.info("Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectType();
        extentTest.log(LogStatus.PASS, "Click Defect Type Tab");
        LOGGER.info("Click Defect Status Tab");
        DefectStatusPage.clickAddStatus();
        extentTest.log(LogStatus.PASS, "Click Defect Type Add Button");
        LOGGER.info("Click Defect Type Add Button");
        softAssert.assertTrue( DefectTypePage.isDefectPageDisplayed(),"Defect Type Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Defect Type Page is Displayed");
        DefectTypePage.setDefectType("NEW");
        extentTest.log(LogStatus.PASS, " Enter The Defect Type Page");
        DefectTypePage.setDescription("Sumatesting");
        extentTest.log(LogStatus.PASS, " Enter The Defect Description");
        DefectTypePage.clickOkButton();
        extentTest.log(LogStatus.PASS, "Click Ok Button");

        softAssert.assertAll();
    }
}
