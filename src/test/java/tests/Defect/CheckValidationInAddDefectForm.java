package tests.Defect;

/**
 * @author:jeyapriya
 */
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.Defect.AddDefectPage;
import pages.Defect.DefectPage;
import pages.Defect.MoreDefectPage;
import pages.HomePage;
import utils.PageBase;
import utils.TestBase;

public class CheckValidationInAddDefectForm extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(CheckValidationInAddDefectForm.class);
    @Test(priority=211,groups = { "regression","test"})
    public void addDefectWithoutDefectID() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutID("defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        staticWait(2);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input employeeId"),"Please input employeeId!","defectID validation msg not displayed");
        LOGGER.info("defectID validation msg  displayed");
        extentTest.log(LogStatus.PASS, "defectID validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=212,groups = { "regression","test"})
    public void addDefectWithoutProject() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutProject("jp12345","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Project"),"Please select Project!","Project validation msg not displayed");
        LOGGER.info("Project validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=213,groups = { "regression","test"})
    public void addDefectWithoutModule() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutModule("jp12345","defect1",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Module"),"Please select Module!","Module validation msg not displayed");
        LOGGER.info("Module validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Module validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=214,groups = { "regression","test"})
    public void addDefectWithoutDescription() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutDescription("jp12345","defect1","defect",
                "test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Description"),"Please input Description!","Description validation msg not displayed");
        LOGGER.info("Description validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Description validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=215,groups = { "regression","test"})
    public void addDefectWithoutSteps() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutSteps("jp12345","defect1","defect",
                "test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Details"),"Please input Details!","steps validation msg not displayed");
        LOGGER.info("steps validation msg  displayed");
        extentTest.log(LogStatus.PASS, "steps validation msg  displayed");
        softAssert.assertAll();
    }

    @Test(priority=216,groups = { "regression","test"})
    public void addDefectWithoutType() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutType("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","severity",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Type"),"Please select Type!","Type validation msg not displayed");
        LOGGER.info("Type validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Type validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=217,groups = { "regression","test"})
    public void addDefectWithoutSeverity() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutSeverity("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type",
                "priority","status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Severity"),"Please select Severity!","Severity validation msg not displayed");
        LOGGER.info("Severity validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Severity validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=218,groups = { "regression","test"})
    public void addDefectWithoutPriority() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutPriority("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "status"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Priority"),"Please select Priority!","Priority validation msg not displayed");
        LOGGER.info("Priority validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Priority validation msg  displayed");
        softAssert.assertAll();
    }
    @Test(priority=219,groups = { "regression","test"})
    public void addDefectWithoutStatus() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect Page is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect Page is  Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("click add defect  button");
        extentTest.log(LogStatus.PASS, "click add defect button");
        staticWait(3);
        AddDefectPage.createDefectWithoutStatus("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority"
        );
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select status"),"Please select status!","status validation msg not displayed");
        LOGGER.info("status validation msg  displayed");
        extentTest.log(LogStatus.PASS, "status validation msg  displayed");
        softAssert.assertAll();
    }
}
