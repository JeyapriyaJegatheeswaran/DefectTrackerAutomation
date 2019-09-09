package tests.Severity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import pages.SeverityPage;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class AddSeverityTest extends TestBase {

    @Test
    public void addSeverity() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        SeverityPage.clearSeverityName();
        SeverityPage.setSeverityName("High");
        SeverityPage.clearSeverityDescription();
        SeverityPage.setSeverityDescription("test description");
        SeverityPage.setIcon();
        SeverityPage.clickColor();
        SeverityPage.selectColor();
        SeverityPage.clickAddOKbtn();

    }
    @Test
    public void addSeverity2() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        SeverityPage.clearSeverityName();
        SeverityPage.setSeverityName("Medium");
        SeverityPage.clearSeverityDescription();
        SeverityPage.setSeverityDescription("test description");
        SeverityPage.setIcon();
        SeverityPage.clickColor();
        SeverityPage.selectColor();
        SeverityPage.clickAddOKbtn();

    }
    @Test
    public void addSeverity3() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        SeverityPage.clearSeverityName();
        SeverityPage.setSeverityName("Low");
        SeverityPage.clearSeverityDescription();
        SeverityPage.setSeverityDescription("test description");
        SeverityPage.setIcon();
        SeverityPage.clickColor();
        SeverityPage.selectColor();
        SeverityPage.clickAddOKbtn();


    }

}
