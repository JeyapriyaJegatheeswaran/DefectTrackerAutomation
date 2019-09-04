package tests.Priority;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class DeletePriorityTest extends TestBase {
    @Test
    public void deletePriority() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickDeletebtn();
        PriorityPage.clickDeleteOKbtn();
        softAssert.assertFalse(PriorityPage.deletePriorityVerify(),"Deleted Priority is displayed");

    }
}