package tests.Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProjectPage;
import utils.JiraPolicy;
import utils.TestBase;

import static utils.PageBase.implicitWait;

//*[@class="ant-select-selection__placeholder"]
public class AddProject extends TestBase {
    @Test(priority=1)
    public void addProject() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickProjectMenu();
        ProjectPage.isProjectPageDisplayed();
        ProjectPage.AddProject("Pro123","Defect Tracker","MobileApp","2019-01-10","2019-01-11","2");
        ProjectPage.AddSucessfullMsg();
    }
}
