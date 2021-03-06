package tests.Severity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SeverityPage;
import utils.TestBase;

public class DeleteSeverity extends TestBase {

    @Test(priority = 131,groups = {"regression","test","smoke"})
    public void editSeverity() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickDeletebtn();
        SeverityPage.clickDeleteOKbtn();

    }
}
