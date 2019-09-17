package tests.Defect;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Defect.AddDefectPage;
import pages.Defect.DefectPage;
import pages.HomePage;
import utils.PageBase;
import utils.TestBase;

public class AddDefect extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDefect.class);
    @Test(priority=1,groups = "test")
    public void checkDefectMenu() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        LOGGER.info("Click Defect menu");
        staticWait(2);
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        LOGGER.info("Home Page is Displayed");
        softAssert.assertAll();
    }
    @Test(priority=2)
    public void checkDefectSubMenu() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        softAssert.assertAll();
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=3)
    public void checkDefectPage() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        softAssert.assertAll();
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertTrue(DefectPage.isAddDefectButtonDisplayed(),"Defect Button is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableDisplayed(),"Defect Table is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=4)
    public void checkAddDefectButton() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=5)
    public void checkAddDefectFormCancelButton() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        AddDefectPage.clickCancelButton();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertAll();

    }
    @Test(priority=6)
    public void checkAddDefectFormFields() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        softAssert.assertTrue(AddDefectPage.isDefectIdFieldDisplayed(),"Defect id field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isProjectFieldDisplayed(),"project field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isModuleFieldDisplayed(),"module field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isDescriptionFieldDisplayed(),"description field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isStepsFieldDisplayed(),"steps field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isEnteredByFieldDisplayed(),"enteredBy field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isFoundInFieldDisplayed(),"foundIn field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isAssigneeToFieldDisplayed(),"AssignTo field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isTypeFieldDisplayed(),"Type field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isSeverityFieldDisplayed(),"Severity field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isPriorityFieldDisplayed(),"Priority field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isStatusFieldDisplayed(),"status field is not Displayed");
        softAssert.assertTrue(AddDefectPage.isOkButtonDisplayed(),"OK button is not Displayed");
        softAssert.assertTrue(AddDefectPage.isCancelDisplayed(),"Cancel button is not Displayed");
        softAssert.assertAll();

    }
    @Test(priority=7)
    public void checkDefectDetailsTable() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectTableDisplayed(),"Defect Page is not Displayed");

        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Defect Id"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Module Name"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Severity"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Priority"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Status"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Assign To"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("Action"),"AddDefect Form is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableHeadingDisplayed("More"),"AddDefect Form is not Displayed");

        softAssert.assertAll();

    }
    @Test(priority=8)
    public void addDefect() {
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        AddDefectPage.createDefect("jp12345","defect1","defect",
                "test for add defect","test for add defect",
                "User 1","Release1","jp","type","severity",
                "priority","status"
        );
        softAssert.assertEquals(DefectPage.getResult("jp12345"),"jp12345","not match");
        softAssert.assertAll();
    }
    @Test(priority=9)
    public void addDefectWithoutData() {

        implicitWait(5);
       // softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();

        staticWait(10);
        AddDefectPage.createDefectWithoutData();
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input employeeId"),"Please input employeeId!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Project"),"Please select Project!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Module"),"Please select Module!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Description"),"Please input Description!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Details"),"Please input Details!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Type"),"Please select Type!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Severity"),"Please select Severity!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Priority"),"Please select Priority!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select status"),"Please select status!","fail");

        softAssert.assertAll();
    }
}
