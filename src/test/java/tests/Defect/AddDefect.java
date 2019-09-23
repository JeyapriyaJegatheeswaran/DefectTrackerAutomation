package tests.Defect;

/**
 * @author:jeyapriya
 */


import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Defect.AddDefectPage;
import pages.Defect.DefectPage;
import pages.Defect.MoreDefectPage;
import pages.HomePage;
import tests.Priority.AddPriorityTest;
import utils.PageBase;
import utils.TestBase;

public class AddDefect extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDefect.class);
    @Test(priority=200,groups = { "regression","test","smoke"})
    public void te() {
        AddDefectPreRequests.addPriorityForDefectTesting("priority");
        staticWait(3);
        AddDefectPreRequests.addPriority1ForDefectTesting("priorityforedit");
        staticWait(3);
        AddDefectPreRequests.addDefectTypeForDefectTesting("type");
        staticWait(3);
        AddDefectPreRequests.addDefectTypeForDefectTesting("typeforedit");
        staticWait(3);
        AddDefectPreRequests.addSeverityForDefectTesting("severity");
        staticWait(3);
        AddDefectPreRequests.addSeverityForDefectTesting("severityforedit");
        staticWait(3);
        AddDefectPreRequests.addStatusForDefectTesting("status");
        staticWait(3);
        AddDefectPreRequests.addStatusForDefectTesting("statusforedit");

    }
    @Test(priority=201,groups = { "regression","test"})
    public void checkDefectMenu() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Defect menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect menu is displayed");
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectSubMenuDisplayed(),"Defect","defect sub  menu not available");
        LOGGER.info("Defect sub menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect sub menu is displayed");
        softAssert.assertAll();
    }
    @Test(priority=202,groups = { "regression","test"})
    public void checkDefectSubMenu() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Defect menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect menu is displayed");
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectSubMenuDisplayed(),"Defect","defect sub  menu not available");
        LOGGER.info("Defect sub menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect sub menu is displayed");
        HomePage.clickDefectSubMenu();
        LOGGER.info("Click Defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page Title is not Displayed");
        LOGGER.info("Defect page Title is displayed");
        extentTest.log(LogStatus.PASS, "Defect page Title is displayed");
        softAssert.assertAll();
    }
    @Test(priority=203,groups = { "regression","test"})
    public void checkDefectPage() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Defect menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect menu is displayed");
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectSubMenuDisplayed(),"Defect","defect sub  menu not available");
        LOGGER.info("Defect sub menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect sub menu is displayed");
        HomePage.clickDefectSubMenu();
        LOGGER.info("Click Defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect page is displayed");
        extentTest.log(LogStatus.PASS, "Defect page is displayed");
        softAssert.assertTrue(DefectPage.isAddDefectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableDisplayed(),"Defect Table is not Displayed");
        LOGGER.info("Defect Table is not Displayed");
        extentTest.log(LogStatus.PASS, "Defect Table is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=204,groups = { "regression","test"})
    public void checkAddDefectButton() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Defect menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect menu is displayed");
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectSubMenuDisplayed(),"Defect","defect sub  menu not available");
        LOGGER.info("Defect sub menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect sub menu is displayed");
        HomePage.clickDefectSubMenu();
        LOGGER.info("Click Defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page Title is not Displayed");
        LOGGER.info("Defect page Title is displayed");
        extentTest.log(LogStatus.PASS, "Defect page Title is displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("Click Add defect button");
        extentTest.log(LogStatus.PASS, "Click Add defect button");
        staticWait(2);
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        LOGGER.info("AddDefect Form is not Displayed");
        extentTest.log(LogStatus.PASS, "AddDefect Form is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=205,groups = { "regression","test"})
    public void checkAddDefectFormCancelButton() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Defect menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect menu is displayed");
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectSubMenuDisplayed(),"Defect","defect sub  menu not available");
        LOGGER.info("Defect sub menu is displayed");
        extentTest.log(LogStatus.PASS, "Defect sub menu is displayed");
        HomePage.clickDefectSubMenu();
        LOGGER.info("Click Defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page Title is not Displayed");
        LOGGER.info("Defect page Title is displayed");
        extentTest.log(LogStatus.PASS, "Defect page Title is displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("Click Add defect button");
        extentTest.log(LogStatus.PASS, "Click Add defect button");
        staticWait(2);
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        LOGGER.info("AddDefect Form is not Displayed");
        extentTest.log(LogStatus.PASS, "AddDefect Form is not Displayed");
        AddDefectPage.clickCancelButton();
        LOGGER.info("Click cancel button");
        extentTest.log(LogStatus.PASS, "Click cancel button");
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        LOGGER.info("Defect page  is displayed");
        extentTest.log(LogStatus.PASS, "Defect page  is displayed");
        softAssert.assertAll();

    }
    @Test(priority=206,groups = {  "regression","test"})
    public void checkAddDefectFormFields() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        LOGGER.info("Click Add defect button");
        extentTest.log(LogStatus.PASS, "Click Add defect button");
        softAssert.assertTrue(AddDefectPage.isDefectIdFieldDisplayed(),"Defect id field is not Displayed");
        LOGGER.info("Defect id field is  Displayed");
        extentTest.log(LogStatus.PASS, "Defect id field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isProjectFieldDisplayed(),"project field is not Displayed");
        LOGGER.info("project field is  Displayed");
        extentTest.log(LogStatus.PASS, "project field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isModuleFieldDisplayed(),"module field is not Displayed");
        LOGGER.info("module field is  Displayed");
        extentTest.log(LogStatus.PASS, "module field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isDescriptionFieldDisplayed(),"description field is not Displayed");
        LOGGER.info("description field is  Displayed");
        extentTest.log(LogStatus.PASS, "description field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isStepsFieldDisplayed(),"steps field is not Displayed");
        LOGGER.info("steps field is  Displayed");
        extentTest.log(LogStatus.PASS, "steps field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isEnteredByFieldDisplayed(),"enteredBy field is not Displayed");
        LOGGER.info("project field is  Displayed");
        extentTest.log(LogStatus.PASS, "project field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isFoundInFieldDisplayed(),"foundIn field is not Displayed");
        LOGGER.info("foundIn field is  Displayed");
        extentTest.log(LogStatus.PASS, "foundIn field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isAssigneeToFieldDisplayed(),"AssignTo field is not Displayed");
        LOGGER.info("AssignTo field is  Displayed");
        extentTest.log(LogStatus.PASS, "AssignTo field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isTypeFieldDisplayed(),"Type field is not Displayed");
        LOGGER.info("Type field is  Displayed");
        extentTest.log(LogStatus.PASS, "Type field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isSeverityFieldDisplayed(),"Severity field is not Displayed");
        LOGGER.info("Severity field is  Displayed");
        extentTest.log(LogStatus.PASS, "Severity field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isPriorityFieldDisplayed(),"Priority field is not Displayed");
        LOGGER.info("Priority field is  Displayed");
        extentTest.log(LogStatus.PASS, "Priority field is  Displayed");
        softAssert.assertTrue(AddDefectPage.isStatusFieldDisplayed(),"status field is not Displayed");
        LOGGER.info("status field is not Displayed");
        extentTest.log(LogStatus.PASS, "status field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isOkButtonDisplayed(),"OK button is not Displayed");
        LOGGER.info("OK button is  Displayed");
        extentTest.log(LogStatus.PASS, "OK button is  Displayed");
        softAssert.assertTrue(AddDefectPage.isCancelDisplayed(),"Cancel button is not Displayed");
        LOGGER.info("Cancel button is  Displayed");
        extentTest.log(LogStatus.PASS, "Cancel button is  Displayed");
        softAssert.assertAll();

    }
    @Test(priority=207,groups = {  "regression","test"})
    public void checkDefectDetailsTable() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home page is displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("click defect menu");
        extentTest.log(LogStatus.PASS, "click defect menu");
        staticWait(2);
        HomePage.clickDefectSubMenu();
        LOGGER.info("click defect sub menu");
        extentTest.log(LogStatus.PASS, "click defect sub menu");
        softAssert.assertTrue(DefectPage.isDefectTableDisplayed(),"Defect table is not Displayed");
        LOGGER.info("Defect table is displayed");
        extentTest.log(LogStatus.PASS, "Defect table is displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Defect Id"),"defect id column id displayed");
        LOGGER.info("defect id column id displayed");
        extentTest.log(LogStatus.PASS, "defect id column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Module Name"),"module name column id displayed");
        LOGGER.info("module name column id displayed");
        extentTest.log(LogStatus.PASS, "module name column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Severity"),"Severity column id displayed");
        LOGGER.info("Severity column id displayed");
        extentTest.log(LogStatus.PASS, "Severity column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Priority"),"Priority column id displayed");
        LOGGER.info("Priority column id displayed");
        extentTest.log(LogStatus.PASS, "Priority column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Status"),"Status column id displayed");
        LOGGER.info("Status column id displayed");
        extentTest.log(LogStatus.PASS, "Status column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Assign To"),"Assign To column id displayed");
        LOGGER.info("Assign To column id displayed");
        extentTest.log(LogStatus.PASS, "Assign To column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Action"),"Action column id displayed");
        LOGGER.info("Action column id displayed");
        extentTest.log(LogStatus.PASS, "Action column id displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("More"),"More column id displayed");
        LOGGER.info("More column id displayed");
        extentTest.log(LogStatus.PASS, "More column id displayed");

        softAssert.assertAll();

    }
    @Test(priority=208,groups = {  "regression","smoke","test"})
    public void addDefect() {

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
        AddDefectPage.createDefect("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        LOGGER.info("add defect");
        extentTest.log(LogStatus.PASS, "add defect");
        staticWait(3);
        PageBase.refreshDriver();
        softAssert.assertEquals(DefectPage.getResult("jp12345"),"jp12345","not match");
        LOGGER.info("check the table data added ");
        extentTest.log(LogStatus.PASS, "check the table data added ");
        softAssert.assertAll();
    }
    @Test(priority=209,groups = { "regression","test"})
    public void addDefectWithoutData() {

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
        AddDefectPage.createDefectWithoutData();
        staticWait(1);
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input employeeId"),"Please input employeeId!","defectID validation msg not displayed");
        LOGGER.info("defectID validation msg  displayed");
        extentTest.log(LogStatus.PASS, "defectID validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Project"),"Please select Project!","Project validation msg not displayed");
        LOGGER.info("Project validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Module"),"Please select Module!","Module validation msg not displayed");
        LOGGER.info("Module validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Module validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Description"),"Please input Description!","Description validation msg not displayed");
        LOGGER.info("Description validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Description validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Details"),"Please input Details!","steps validation msg not displayed");
        LOGGER.info("steps validation msg  displayed");
        extentTest.log(LogStatus.PASS, "steps validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Type"),"Please select Type!","Type validation msg not displayed");
        LOGGER.info("Type validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Type validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Severity"),"Please select Severity!","Severity validation msg not displayed");
        LOGGER.info("Severity validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Severity validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Priority"),"Please select Priority!","Priority validation msg not displayed");
        LOGGER.info("Priority validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Priority validation msg  displayed");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select status"),"Please select status!","status validation msg not displayed");
        LOGGER.info("status validation msg  displayed");
        extentTest.log(LogStatus.PASS, "status validation msg  displayed");
        softAssert.assertAll();
    }

    @Test(priority=210,groups = {  "regression","test"})
    public void checkMoreButton() {

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
        staticWait(2);
        DefectPage.clickMoreDefectDetailsButton("jp12345");
        staticWait(3);
        softAssert.assertTrue(MoreDefectPage.isMoreDefectDetailsPageDisplayed(),"more Defect details  Page is not Displayed");

        softAssert.assertAll();
    }

}
