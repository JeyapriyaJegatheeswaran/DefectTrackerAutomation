package tests.Severity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SeverityPage;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class EditSeverityTest extends TestBase {
    @Test(priority = 11)
    public void severityEditBtnVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        softAssert.assertTrue(SeverityPage.isDisplayEditBtn(),"Edit Button not Display");
        softAssert.assertAll();

    }

    @Test(priority = 12)
    public void editSeverityFormVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickEditbtn();
        softAssert.assertEquals(SeverityPage.isSeverityEditFormDisplay(),"Edit Severity");
        softAssert.assertAll();

    }
    @Test(priority = 13)
    public void editSeverityItemVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickEditbtn();
        softAssert.assertEquals(SeverityPage.isEditDisplayName(),"Name");
        softAssert.assertEquals(SeverityPage.isEditDisplayDescription(),"Description");
        softAssert.assertEquals(SeverityPage.isEditDisplayIcon(),"Icon");
        softAssert.assertEquals(SeverityPage.isEditDisplayColor(),"Colour");
        softAssert.assertEquals(SeverityPage.isEditDisplayOKBtn(),"OK");
        softAssert.assertEquals(SeverityPage.isEditDisplayCancleBtn(),"Cancel");
        softAssert.assertAll();

    }

    @Test(priority = 14)
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
        softAssert.assertEquals(SeverityPage.checkEditedItem(),"highest");
        softAssert.assertAll();
    }

//    @Test(priority = 15)
//    public void editedItemCheck() {
//
//        implicitWait(5);
//        HomePage.clickSetting();
//        HomePage.clickGeneralconfig();
//        HomePage.clickSeverity();
//        SeverityPage.isSeverityPageDisplay();
//        softAssert.assertEquals(SeverityPage.checkEditedItem(),"highest");
//
//    }

}
