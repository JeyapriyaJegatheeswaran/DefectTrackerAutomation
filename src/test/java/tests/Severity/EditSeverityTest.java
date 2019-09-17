package tests.Severity;

import com.relevantcodes.extentreports.LogStatus;
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
        extentTest.log(LogStatus.PASS,"Setting clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"General Configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Severity clicked");
        SeverityPage.isSeverityPageDisplay();
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        softAssert.assertTrue(SeverityPage.isDisplayEditBtn(),"Edit Button not Display");
        extentTest.log(LogStatus.PASS,"Edit_edit button is displayed");
        softAssert.assertAll();

    }

    @Test(priority = 12)
    public void editSeverityFormVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Setting clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"General Configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Severity clicked");
        SeverityPage.isSeverityPageDisplay();
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickEditbtn();
        extentTest.log(LogStatus.PASS,"Edit_edit button clicked");
        softAssert.assertEquals(SeverityPage.isSeverityEditFormDisplay(),"Edit Severity","Edit form not displayed");
        extentTest.log(LogStatus.PASS,"Edit_edit form displayed");
        softAssert.assertAll();

    }
    @Test(priority = 13)
    public void editSeverityItemVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Setting clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"General Configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Severity clicked");
        SeverityPage.isSeverityPageDisplay();
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickEditbtn();
        extentTest.log(LogStatus.PASS,"Edit_edit button clicked");
        softAssert.assertEquals(SeverityPage.isEditDisplayName(),"Name","Edit_Name not Displayed");
        extentTest.log(LogStatus.PASS,"Edit_name displayed");
        softAssert.assertEquals(SeverityPage.isEditDisplayDescription(),"Description","Edit_Description not Displayed");
        extentTest.log(LogStatus.PASS,"Edit_Description displayed");
        softAssert.assertEquals(SeverityPage.isEditDisplayIcon(),"Icon","Edit_Icon not displayed");
        extentTest.log(LogStatus.PASS,"Edit_Icon displayed");
        softAssert.assertEquals(SeverityPage.isEditDisplayColor(),"Colour","Edit_Color not displayed");
        extentTest.log(LogStatus.PASS,"Edit_Color displayed");
        softAssert.assertEquals(SeverityPage.isEditDisplayOKBtn(),"OK","Edit_OK button not displayed");
        extentTest.log(LogStatus.PASS,"Edit_OK button displayed");
        softAssert.assertEquals(SeverityPage.isEditDisplayCancleBtn(),"Cancel","Edit_Cancel button not displayed");
        extentTest.log(LogStatus.PASS,"Edit_Cancel button displayed");
        softAssert.assertAll();

    }

    @Test(priority = 14)
    public void editSeverity() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Setting clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"General Configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Severity clicked");
        SeverityPage.isSeverityPageDisplay();
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickEditbtn();
        extentTest.log(LogStatus.PASS,"Edit_edit button clicked");
        SeverityPage.clearSeverityNameEdited();
        extentTest.log(LogStatus.PASS,"Edit_Name cleared");
        SeverityPage.setSeverityNameEdited("highest");
        extentTest.log(LogStatus.PASS,"Edit_Name Edited");
        SeverityPage.clearSeverityDescriptionEdited();
        extentTest.log(LogStatus.PASS,"Edit_Description cleared");
        SeverityPage.setSeverityDescriptionEdited("Edit description tested");
        extentTest.log(LogStatus.PASS,"Edit_Description Edited");
        SeverityPage.setIconEdited();
        extentTest.log(LogStatus.PASS,"Edit_Icon Edited");
        SeverityPage.clickColorEdited();
        extentTest.log(LogStatus.PASS,"Edit_Color dropdown clicked");
        SeverityPage.selectColorEdited();
        extentTest.log(LogStatus.PASS,"Edit_Color Edited");
        SeverityPage.clickEditOKbtn();
        extentTest.log(LogStatus.PASS,"Edit_OK button Clicked");
        softAssert.assertEquals(SeverityPage.checkEditedItem(),"highest","Edited item is not verify the Table");
        extentTest.log(LogStatus.PASS,"Edit_Edited Item Verified");
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
