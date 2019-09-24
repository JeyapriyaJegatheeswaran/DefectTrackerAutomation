package tests.Project;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.Defect.AddDefectPage;
import pages.HomePage;
import pages.project.AddProjectPage;
import pages.project.ProjectPage;
import tests.Defect.AddDefect;
import utils.PageBase;
import utils.TestBase;

public class AddProject extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(AddDefect.class);

    @Test(priority=1,groups = { "regression","test"})
    public void checkManageProjectMenu() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertAll();
    }
    @Test(priority=2,groups = { "regression","test"})
    public void checkProjectPage() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");
        softAssert.assertTrue(ProjectPage.isProjectTableDisplayed(),"project table is not Displayed");
        LOGGER.info("project table is not Displayed");
        extentTest.log(LogStatus.PASS, "project table is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=3,groups = { "regression","test"})
    public void checkAddProjectButton() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");
        ProjectPage.clickOnAddProjectButton();
        LOGGER.info("Click Add project button");
        extentTest.log(LogStatus.PASS, "Click Add project button");
        staticWait(2);
        softAssert.assertTrue(AddProjectPage.isAddProjectFormDisplayed(),"Add project Form is not Displayed");
        LOGGER.info("Add project Form is Displayed");
        extentTest.log(LogStatus.PASS, "Add project Form is  Displayed");
        softAssert.assertAll();
    }
    @Test(priority=4,groups = { "regression","test"})
    public void checkAddDefectFormCancelButton() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");
        ProjectPage.clickOnAddProjectButton();
        LOGGER.info("Click Add project button");
        extentTest.log(LogStatus.PASS, "Click Add project button");
        staticWait(2);
        softAssert.assertTrue(AddProjectPage.isAddProjectFormDisplayed(),"Add project Form is not Displayed");
        LOGGER.info("Add project Form is Displayed");
        extentTest.log(LogStatus.PASS, "Add project Form is  Displayed");
        AddProjectPage.clickCancelButton();
        LOGGER.info("Click cancel button");
        extentTest.log(LogStatus.PASS, "Click cancel button");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"project Page is not Displayed");
        LOGGER.info("project page  is displayed");
        extentTest.log(LogStatus.PASS, "project page  is displayed");
        softAssert.assertAll();

    }
    @Test(priority=5,groups = {  "regression","test"})
    public void checkAddProjectFormFields() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");

        ProjectPage.clickOnAddProjectButton();
        LOGGER.info("Click Add project button");
        extentTest.log(LogStatus.PASS, "Click Add project button");
        staticWait(2);
        softAssert.assertTrue(AddProjectPage.isAddProjectFormDisplayed(),"Add project Form is not Displayed");
        LOGGER.info("Add project Form is Displayed");
        extentTest.log(LogStatus.PASS, "Add project Form is  Displayed");
        staticWait(3);
        softAssert.assertTrue(AddProjectPage.isProjectIdFieldDisplayed(),"Project id field is not Displayed");
        LOGGER.info("Project id field is  Displayed");
        extentTest.log(LogStatus.PASS, "Project id field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isProjectNameFieldDisplayed(),"project Name field is not Displayed");
        LOGGER.info("project Name field is  Displayed");
        extentTest.log(LogStatus.PASS, "project Name field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isTypeFieldDisplayed(),"Type field is not Displayed");
        LOGGER.info("Type field is  Displayed");
        extentTest.log(LogStatus.PASS, "Type field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isStartDateFieldDisplayed(),"StartDate field is not Displayed");
        LOGGER.info("StartDate field is  Displayed");
        extentTest.log(LogStatus.PASS, "StartDate field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isEndDateFieldDisplayed(),"EndDate field is not Displayed");
        LOGGER.info("EndDate field is  Displayed");
        extentTest.log(LogStatus.PASS, "EndDate field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isDurationFieldDisplayed(),"Duration field is not Displayed");
        LOGGER.info("Duration field is  Displayed");
        extentTest.log(LogStatus.PASS, "Duration field is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isStatusFieldDisplayed(),"status field is not Displayed");
        LOGGER.info("status field is not Displayed");
        extentTest.log(LogStatus.PASS, "status field is not Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isOkButtonDisplayed(),"OK button is not Displayed");
        LOGGER.info("OK button is  Displayed");
        extentTest.log(LogStatus.PASS, "OK button is  Displayed");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isCancelDisplayed(),"Cancel button is not Displayed");
        LOGGER.info("Cancel button is  Displayed");
        extentTest.log(LogStatus.PASS, "Cancel button is  Displayed");
        softAssert.assertAll();

    }
    @Test(priority=6,groups = {  "regression","test"})
    public void checkProjectDetailsTable() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);

        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");

        softAssert.assertTrue(ProjectPage.isProjectTableDisplayed(),"project table is not Displayed");
        LOGGER.info("project table is not Displayed");
        extentTest.log(LogStatus.PASS, "project table is not Displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Project Id "),"Project id column is displayed");
        LOGGER.info("defect id column id displayed");
        extentTest.log(LogStatus.PASS, "defect id column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Project Name"),"Project name column is displayed");
        LOGGER.info("Project name column id displayed");
        extentTest.log(LogStatus.PASS, "Project name column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Type "),"Type column is displayed");
        LOGGER.info("Type column is displayed");
        extentTest.log(LogStatus.PASS, "Type column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Start Date"),"Start Date column is displayed");
        LOGGER.info("Start Date column is displayed");
        extentTest.log(LogStatus.PASS, "Start Date column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("End Date"),"End Date column is displayed");
        LOGGER.info("End Date column is displayed");
        extentTest.log(LogStatus.PASS, "End Date column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Duration"),"Duration column is displayed");
        LOGGER.info("Duration column is displayed");
        extentTest.log(LogStatus.PASS, "Duration column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Status"),"Status column is displayed");
        LOGGER.info("Status column is displayed");
        extentTest.log(LogStatus.PASS, "Status column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Edit "),"Edit column is displayed");
        LOGGER.info("Edit column is displayed");
        extentTest.log(LogStatus.PASS, "Edit column is displayed");

        softAssert.assertTrue(ProjectPage.isDefectTableHeadingDisplayed("Delete "),"Delete column is displayed");
        LOGGER.info("Delete column is displayed");
        extentTest.log(LogStatus.PASS, "Delete column is displayed");

        softAssert.assertAll();

    }
    @Test(priority=7,groups = {  "regression","smoke","test"})
    public void addProject() {
        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);

        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");

        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is  Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is  Displayed");

        ProjectPage.clickOnAddProjectButton();
        LOGGER.info("Click Add project button");
        extentTest.log(LogStatus.PASS, "Click Add project button");
        staticWait(1);
        softAssert.assertTrue(AddProjectPage.isAddProjectFormDisplayed(),"Add project Form is not Displayed");
        LOGGER.info("Add project Form is Displayed");
        extentTest.log(LogStatus.PASS, "Add project Form is  Displayed");

        AddProjectPage.AddProject("2","DefectTracker","Mobile Application","2019-01-10","2019-01-11","2","New");
        LOGGER.info("Add Project");
        extentTest.log(LogStatus.PASS, "Add Project");

        AddProjectPage.clickOKButton();
        LOGGER.info("click on button");
        extentTest.log(LogStatus.PASS, "click on button");
        staticWait(1);

        softAssert.assertEquals(ProjectPage.getSuccessfulMsg(),"Successfully Added!!!","successful message displayed ");
        LOGGER.info("Successful message displayed ");
        extentTest.log(LogStatus.PASS, "Successful message displayed ");
        staticWait(3);

        PageBase.refreshDriver();

        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","2"),"DefectTracker");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");

        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","3"),"MobileApp");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");

        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","4"),"2019-09-24");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");

        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","5"),"2019-09-24");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");

        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","6"),"2");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");
        softAssert.assertEquals(ProjectPage.checkTableAfterAdded("2","7"),"new");
        LOGGER.info("Added data view in table");
        extentTest.log(LogStatus.PASS, "Added data view in table");
        softAssert.assertAll();

    }
    @Test(priority=8,groups = { "regression","test"})
    public void addProjectWithoutData() {

        PageBase.implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        LOGGER.info("Home Page is Displayed");
        extentTest.log(LogStatus.PASS, "Home page is displayed ");
        staticWait(2);
        softAssert.assertEquals(HomePage.isManageProjectMenuDisplayed(),"Manage Project","Manage Project menu not available");
        LOGGER.info("ManageProject menu is displayed");
        extentTest.log(LogStatus.PASS, "Manage Project menu is displayed");
        HomePage.clickProjectMenu();
        LOGGER.info("Click Manage Project menu");
        extentTest.log(LogStatus.PASS, "Click Manage Project menu");
        staticWait(2);
        softAssert.assertTrue(ProjectPage.isProjectPageDisplayed(),"Project Page Title is not Displayed");
        LOGGER.info("Project page Title is displayed");
        extentTest.log(LogStatus.PASS, "Project page Title is displayed");
        softAssert.assertTrue(ProjectPage.isAddProjectButtonDisplayed(),"Add Defect Button is not Displayed");
        LOGGER.info("Add Defect Button is not Displayed");
        extentTest.log(LogStatus.PASS, "Add Defect Button is not Displayed");

        ProjectPage.clickOnAddProjectButton();
        LOGGER.info("Click Add project button");
        extentTest.log(LogStatus.PASS, "Click Add project button");
        staticWait(1);

        softAssert.assertTrue(AddProjectPage.isAddProjectFormDisplayed(),"Add project Form is not Displayed");
        LOGGER.info("Add project Form is Displayed");
        extentTest.log(LogStatus.PASS, "Add project Form is  Displayed");
        AddDefectPage.clickAddButton();
        staticWait(1);
        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input ProjectId"),"Please input ProjectId!","Project ID validation msg not displayed");
        LOGGER.info("Project ID validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project ID validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input projectName"),"Please input projectName!","Project Name validation msg not displayed");
        LOGGER.info("Project Name validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project Name validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Type"),"Please input Project Type!","Project Type validation msg not displayed");
        LOGGER.info("Project Type validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project Type validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input startDate"),"Please input startDate!","startDate validation msg not displayed");
        LOGGER.info("startDate validation msg  displayed");
        extentTest.log(LogStatus.PASS, "startDate validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project End Date"),"Please input Project End Date!","End Date validation msg not displayed");
        LOGGER.info("End Date validation msg  displayed");
        extentTest.log(LogStatus.PASS, "End Date validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Duration"),"Please input Project Duration!","Duration validation msg not displayed");
        LOGGER.info("Duration validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Duration validation msg  displayed");

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Status"),"Please input Project Status!","status validation msg not displayed");
        LOGGER.info("status validation msg  displayed");
        extentTest.log(LogStatus.PASS, "status validation msg  displayed");
        softAssert.assertAll();
    }

}
