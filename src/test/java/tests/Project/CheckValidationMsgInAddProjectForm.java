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

public class CheckValidationMsgInAddProjectForm extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(AddDefect.class);

    @Test(priority=1,groups = { "regression","test"})
    public void addProjectWithoutID() {

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

        AddProjectPage.AddProjectWithoutID("DefectTracker","Mobile Application","2019-01-10","2019-01-11","2","New");

        AddDefectPage.clickAddButton();

        staticWait(1);
        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input ProjectId"),"Please input ProjectId!","Project ID validation msg not displayed");
        LOGGER.info("Project ID validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project ID validation msg  displayed");

        softAssert.assertAll();
    }

    @Test(priority=2,groups = { "regression","test"})
    public void addProjectWithoutName() {

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

        AddProjectPage.AddProjectWithoutName("2","Mobile Application","2019-01-10","2019-01-11","2","New");

        AddDefectPage.clickAddButton();
        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input projectName"),"Please input projectName!","Project Name validation msg not displayed");
        LOGGER.info("Project Name validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project Name validation msg  displayed");

        softAssert.assertAll();
    }

    @Test(priority=3,groups = { "regression","test"})
    public void addProjectWithoutType() {

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

        AddProjectPage.AddProjectWithoutType("2","DefectTracker","2019-01-10","2019-01-11","2","New");

        AddDefectPage.clickAddButton();

        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Type"),"Please input Project Type!","Project Type validation msg not displayed");
        LOGGER.info("Project Type validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Project Type validation msg  displayed");

        softAssert.assertAll();
    }
    @Test(priority=4,groups = { "regression","test"})
    public void addProjectWithoutStartDate() {

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

        AddProjectPage.AddProjectWithoutStartDate("2","DefectTracker","Mobile Application","2019-01-11","2","New");

        AddDefectPage.clickAddButton();

        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input startDate"),"Please input startDate!","startDate validation msg not displayed");
        LOGGER.info("startDate validation msg  displayed");
        extentTest.log(LogStatus.PASS, "startDate validation msg  displayed");

        softAssert.assertAll();
    }
    @Test(priority=5,groups = { "regression","test"})
    public void addProjectWithoutEndDate() {

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

        AddProjectPage.AddProjectWithoutEndDate("2","DefectTracker","Mobile Application","2019-01-10","2","New");

        AddDefectPage.clickAddButton();

        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project End Date"),"Please input Project End Date!","End Date validation msg not displayed");
        LOGGER.info("End Date validation msg  displayed");
        extentTest.log(LogStatus.PASS, "End Date validation msg  displayed");

        softAssert.assertAll();
    }
    @Test(priority=6,groups = { "regression","test"})
    public void addProjectWithoutDuration() {

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

        AddProjectPage.AddProjectWithoutDuration("2","DefectTracker","Mobile Application","2019-01-10","2019-01-11","New");

        AddDefectPage.clickAddButton();

        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Duration"),"Please input Project Duration!","Duration validation msg not displayed");
        LOGGER.info("Duration validation msg  displayed");
        extentTest.log(LogStatus.PASS, "Duration validation msg  displayed");

        softAssert.assertAll();
    }
    @Test(priority=7,groups = { "regression","test"})
    public void addProjectWithoutStatus() {

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

        AddProjectPage.AddProjectWithoutStatus("2","DefectTracker","Mobile Application","2019-01-10","2019-01-11","2");

        AddDefectPage.clickAddButton();

        staticWait(1);

        softAssert.assertEquals(AddProjectPage.CheckValidMsg("Please input Project Status"),"Please input Project Status!","status validation msg not displayed");
        LOGGER.info("status validation msg  displayed");
        extentTest.log(LogStatus.PASS, "status validation msg  displayed");
        softAssert.assertAll();
    }

}
