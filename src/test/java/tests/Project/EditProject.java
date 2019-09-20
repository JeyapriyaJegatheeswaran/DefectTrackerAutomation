package tests.Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProjectPage;
import utils.TestBase;

import static utils.PageBase.implicitWait;
import static utils.PageBase.staticWait;

public class EditProject extends TestBase {

        @Test(priority=1)
        public void editProject() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickProjectMenu();
        ProjectPage.isProjectPageDisplayed();
        ProjectPage.EditProject("Pro12345","Defect Tracker New","MobileApp","2019-02-10","2019-01-11","3","New");
        ProjectPage.EditSucessfullMsg();


        }
}

