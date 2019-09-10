package tests.Severity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SeverityPage;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class EditSeverityTest extends TestBase {
    @Test
    public void severityEditBtnVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        softAssert.assertTrue(SeverityPage.isDisplayEditBtn(),"Edit Button not Display");

    }

    @Test
    public void editSeverityFormVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickEditbtn();
        softAssert.assertEquals(SeverityPage.isSeverityEditFormDisplay(),"Edit Severity");

    }


    @Test
    public void editSeverity() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickEditbtn();
        SeverityPage.clearSeverityNameEdited();
        SeverityPage.setSeverityNameEdited("highest");
        SeverityPage.clearSeverityDescriptionEdited();
        SeverityPage.setSeverityDescriptionEdited("Edit description tested");
        SeverityPage.setIconEdited();
        SeverityPage.clickColorEdited();
        SeverityPage.selectColorEdited();
        SeverityPage.clickEditOKbtn();

    }
}
