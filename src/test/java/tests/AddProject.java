package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProjectPage;
import utils.JiraPolicy;
import utils.TestBase;

public class AddProject extends TestBase {
    @Test(priority=1)
    public void addProject() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickProjectMenu();
        ProjectPage.isProjectPageDisplayed();
        ProjectPage.AddProject("Pro123","Defect Tracker","Ui Defect","2019-01-10","2019-01-10","2Y","New");
}
}
