package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import pages.SeverityPage;

import static utils.PageBase.implicitWait;

public class SeverityTest {

    @Test
    public void addSeverity() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        SeverityPage.clearSeverityName();
        SeverityPage.setSeverityName("");
        SeverityPage.clearSeverityDescription();
        SeverityPage.setSeverityDescription("");
        SeverityPage.setIcon();
//
        SeverityPage.clickAddbtn();

    }
}
