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
    @Test(priority=301,groups = { "test", "regression","smoke"})
    public void AddDefectType() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
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
    @Test(priority=302,groups = { "test", "regression","smoke"})
    public void DefectTypeMainMenuTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        LOGGER.info("Click GeneralConfiguration Tab");
        softAssert.assertAll();
    }
    @Test(priority=303,groups = { "test", "regression","smoke"})
    public void DefectTypeSabMenuTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        LOGGER.info("Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectType();
        extentTest.log(LogStatus.PASS, "Click Defect Type Tab");
        LOGGER.info("Click Defect Status Tab");
        softAssert.assertAll();
    }
    @Test(priority=304,groups = { "test", "regression","smoke"})
    public void CheckDefectTypePageTest() {
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
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
        softAssert.assertTrue(DefectTypePage.isDefectPageCheckTile(), "Title is Not show Defect Type Page");
        softAssert.assertTrue( DefectTypePage.isDefectPageCheckTypeField(), "Not show Defect Field Defect Type Page");
        softAssert.assertTrue( DefectTypePage.isDefectPageCheckTypeDcriptionField(), "Not showDcriptionField Defect Type Page");
        softAssert.assertTrue( DefectTypePage.isDefectPageCheckTypeOkbutton(), "Not show ok Defect Type Page");
        softAssert.assertAll();
    }
    //
    @Test(priority=305,groups = { "test", "regression","smoke"})
    public void CheckEmptyAddDefectType() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
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
        DefectTypePage.setDefectType("");
        extentTest.log(LogStatus.PASS, " Enter The Defect Type Page");
        DefectTypePage.setDescription("");
        extentTest.log(LogStatus.PASS, " Enter The Defect Description");
        DefectTypePage.clickOkButton();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=306,groups = { "test", "regression","smoke"})
    public void CheckSpicalvalueAddDefectType() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
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
        DefectTypePage.setDefectType("tesr12/*-");
        extentTest.log(LogStatus.PASS, " Enter Spical Defect  Type Page");
        DefectTypePage.setDescription("de/*-+1235");
        extentTest.log(LogStatus.PASS, " Enter Defect Spical Description");
        DefectTypePage.clickOkButton();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=307,groups = { "test", "regression","smoke"})
    public void CheckShortFormatAddDefectType() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
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
        DefectTypePage.setDefectType("t");
        extentTest.log(LogStatus.PASS, " Enter Spical Defect  Type Page");
        softAssert.assertEquals( DefectTypePage.isDefectPageDisplayedShortMeasssage(),"Required greater than 2 characters","Not show This meassage");
        DefectTypePage.setDescription("d");
        extentTest.log(LogStatus.PASS, " Enter Defect Spical Description");
        softAssert.assertEquals( DefectTypePage.isDefectPageDisplayedDecriptionShortMeasssage(),"Required greater than 10 characters","Not show Decription meassage");
        DefectTypePage.clickOkButton();
        extentTest.log(LogStatus.PASS, "Click Ok Button");
        softAssert.assertAll();
    }
    @Test(priority=308,groups = { "test", "regression","smoke"})
    public void CheckTheDefectTypeTable() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(DefectStatusPage.isDefectDashboardPageDisplayed(), "Dashboard Page is not Displayed");
        DefectStatusPage.clickSetting();
        extentTest.log(LogStatus.PASS, "Click Setting Tab");
        LOGGER.info("Click Setting Tab");
        implicitWait(3);
        DefectStatusPage.clickGeneralConfiguration();
        extentTest.log(LogStatus.PASS, "Click GeneralConfiguration Tab");
        LOGGER.info("Click GeneralConfiguration Tab");
        implicitWait(3);
        DefectStatusPage.clickClickDefectType();
        extentTest.log(LogStatus.PASS, "Click Defect Type Tab");
        LOGGER.info("Click Defect Type Tab");
        softAssert.assertTrue(DefectTypePage.isDefectTypeDisplayed(), "Not Show Defect Type");
        softAssert.assertTrue(DefectTypePage.isDefectDescriptionDisplayed(), "Not Show Defect Description");
        softAssert.assertTrue(DefectTypePage.isDefectActionDisplayed(), "Not Show Defect Description");
        softAssert.assertAll();
    }



}
