package tests.Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProjectPage;
import utils.TestBase;

public class DeleteProject extends TestBase {
        @Test(priority=1)
        public void deleteProject() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickProjectMenu();
        ProjectPage.isProjectPageDisplayed();
        ProjectPage.DeleteProject();
        ProjectPage.DeleteSucessfullMsg();
        }
}
