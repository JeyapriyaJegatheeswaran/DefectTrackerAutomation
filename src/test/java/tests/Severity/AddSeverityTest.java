package tests.Severity;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import pages.SeverityPage;
import utils.MethodBase;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class AddSeverityTest extends TestBase {

    @Test(priority = 1,groups = {"regression","test"})
    public void clickSetting() {

        staticWait(3);
        softAssert.assertEquals(HomePage.settingVerify(),"Setting","Setting mani menu not verify");
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting clicked");

    }
    @Test(priority = 2,groups = {"regression","test"})
    public void clickGeneranConfiSetting() {
        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting clicked");
        staticWait(3);
        softAssert.assertEquals(HomePage.generalConfigVerify(),"General Configuration","General Configuration sub menu not verified");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration clicked");
        softAssert.assertAll();
    }
    @Test(priority = 3,groups = {"regression","test"})
    public void submenuSeverityVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration clicked");
        staticWait(3);
        softAssert.assertEquals(HomePage.severityVerify(),"Severity","Severity submenu not verify");
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity sub menu verified");
        softAssert.assertAll();
    }
    @Test(priority = 4,groups = {"regression","test"})
    public void SeverityPageVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_general configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");

    }
    @Test(priority = 5,groups = {"regression","test"})
    public void SeverityAddBtnVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_general configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        softAssert.assertEquals(SeverityPage.severityAddBtnVerify(),"Add severity","Severity Add button not verify");
        extentTest.log(LogStatus.PASS,"Severity Add button verified");
        softAssert.assertAll();
    }

    @Test(priority = 6,groups = {"regression","test"})
    public void SererityAddFormVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_general configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickAddSeveritybtn();
        extentTest.log(LogStatus.PASS,"Severity add button clicked");
        SeverityPage.isSeverityAddFormDisplay();
        extentTest.log(LogStatus.PASS,"severity add form Displayed");
        softAssert.assertEquals(SeverityPage.severityFormVerifyText(),"Add severity","Severity form items not checked");
        extentTest.log(LogStatus.PASS,"Severity form items checked");
        softAssert.assertAll();
    }

    @Test(priority = 7,groups = {"regression","test"})
    public void formItemsVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickAddSeveritybtn();
        extentTest.log(LogStatus.PASS,"Severity add button clicked");
        softAssert.assertEquals(SeverityPage.isDisplayName(),"Name","Severity name not Displayed");
        extentTest.log(LogStatus.PASS,"Severity name displayed");
        softAssert.assertEquals(SeverityPage.isDisplayDescription(),"Description","Severity Description not Displayed");
        extentTest.log(LogStatus.PASS,"Severity description displayed");
        softAssert.assertEquals(SeverityPage.isDisplayIcon(),"Icon","Severity Icon not Displayed");
        extentTest.log(LogStatus.PASS,"Severity Icon Displayed");
        softAssert.assertEquals(SeverityPage.isDisplayColor(),"Colour","Severity color not Display");
        extentTest.log(LogStatus.PASS,"Severity color Displayed");
        softAssert.assertEquals(SeverityPage.isDisplayOKBtn(),"OK","OK button not Displayed");
        extentTest.log(LogStatus.PASS,"OK button Displayed");
        softAssert.assertEquals(SeverityPage.isDisplayCancleBtn(),"Cancel","Cancel button not Displayed");
        extentTest.log(LogStatus.PASS,"Cancle button Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 8,groups = {"regression","smoke","test"})
    public void addSeverityHigh() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickAddSeveritybtn();
        extentTest.log(LogStatus.PASS,"Severity add button clicked");
        SeverityPage.clearSeverityName();
        extentTest.log(LogStatus.PASS," Severity Name Cleared");
        SeverityPage.setSeverityName("High");
        extentTest.log(LogStatus.PASS,"Severity Name Added");
        SeverityPage.clearSeverityDescription();
        extentTest.log(LogStatus.PASS,"Severity Description Cleared");
        SeverityPage.setSeverityDescription("test description");
        extentTest.log(LogStatus.PASS,"Severity Description Added");
        SeverityPage.setIcon();
        extentTest.log(LogStatus.PASS,"Severity Icon Added");
        SeverityPage.clickColor();
        extentTest.log(LogStatus.PASS,"Severity color dropdown clicked");
        SeverityPage.selectColor();
        extentTest.log(LogStatus.PASS,"Severity Color Added");
        SeverityPage.clickAddOKbtn();
        extentTest.log(LogStatus.PASS,"OK button clicked");
        softAssert.assertAll();

    }
    @Test(priority = 9,groups = {"regression","test"})
    public void severityCancleBtnVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickAddSeveritybtn();
        extentTest.log(LogStatus.PASS,"Severity add button clicked");
        softAssert.assertEquals(SeverityPage.severityCancleBtnVerify(),"Cancel","Cancel button not verify");
        softAssert.assertAll();
    }
    @Test(priority = 10,groups = {"regression","test"})
    public void cancelSeverity() {

        implicitWait(5);
        HomePage.clickSetting();
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting main menu clicked");
        HomePage.clickGeneralconfig();
        extentTest.log(LogStatus.PASS,"Side Navigation_General configuration clicked");
        HomePage.clickSeverity();
        extentTest.log(LogStatus.PASS,"Side Navigation_Severity clicked");
        softAssert.assertTrue(SeverityPage.isSeverityPageDisplay(),"severity page is not displayed");
        extentTest.log(LogStatus.PASS,"Severity page displayed");
        SeverityPage.clickAddSeveritybtn();
        extentTest.log(LogStatus.PASS,"Severity add button clicked");
        SeverityPage.clearSeverityName();
        extentTest.log(LogStatus.PASS," Severity Name Cleared");
        SeverityPage.setSeverityName("High");
        extentTest.log(LogStatus.PASS,"Severity Name Added");
        SeverityPage.clearSeverityDescription();
        extentTest.log(LogStatus.PASS,"Severity Description Cleared");
        SeverityPage.setSeverityDescription("test description");
        extentTest.log(LogStatus.PASS,"Severity Description Added");
        SeverityPage.setIcon();
        extentTest.log(LogStatus.PASS,"Severity Icon Added");
        SeverityPage.clickColor();
        extentTest.log(LogStatus.PASS,"Severity color dropdown clicked");
        SeverityPage.selectColor();
        extentTest.log(LogStatus.PASS,"Severity Color Added");
        SeverityPage.clickCancleBtn(); 
        extentTest.log(LogStatus.PASS,"Cancel button clicked");
        SeverityPage.isSeverityPageDisplay();
        extentTest.log(LogStatus.PASS,"Cancel_Severity page displayed");

    }
    @Test(priority = 11,groups = {"regression","test"})
    public void afterCancelCheckField() {

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
        SeverityPage.clickCancleBtn();
        SeverityPage.isSeverityPageDisplay();
        //implicitWait(5);
        SeverityPage.clickAddSeveritybtn();
        softAssert.assertEquals(SeverityPage.cancleSeverityAddName(),"");
        softAssert.assertAll();
    }
    @Test(priority = 12,groups = {"regression","smoke","test"})
    public void addSeverityMedium() {
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
    @Test(priority = 13,groups = {"regression","smoke","test"})
    public void addSeverityLow() {
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

//    @Test(priority = 10)
//    public void SeverityAddedItemCheck() {
//        implicitWait(5);
//        HomePage.clickSetting();
//        HomePage.clickGeneralconfig();
//        HomePage.clickSeverity();
//        SeverityPage.isSeverityPageDisplay();
//        softAssert.assertEquals(SeverityPage.checkAddedItem(),"Low");
//        softAssert.assertAll();
//    }

}
