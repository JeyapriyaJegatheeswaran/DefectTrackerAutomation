package tests.Severity;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import pages.SeverityPage;
import utils.MethodBase;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class AddSeverityTest extends TestBase {

    @Test(priority = 1)
    public void clickSettingVerify() {
        implicitWait(5);
        softAssert.assertEquals(HomePage.settingVerify(),"Setting");
        HomePage.clickSetting();
        softAssert.assertEquals(HomePage.generalConfigVerify(),"General Configuration");
        HomePage.clickGeneralconfig();
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void clickGeneranConfiSettingVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        softAssert.assertEquals(HomePage.severityVerify(),"Severity");
        softAssert.assertAll();
    }
    @Test(priority = 3)
    public void SeverityPageVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public void SeverityAddBtnVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        softAssert.assertEquals(SeverityPage.severityAddBtnVerify(),"Add severity");
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void SererityAddFormVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        SeverityPage.isSeverityAddFormDisplay();
        softAssert.assertEquals(SeverityPage.severityFormVerifyText(),"Add severity");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void formItemsVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        softAssert.assertEquals(SeverityPage.isDisplayName(),"Name");
        softAssert.assertEquals(SeverityPage.isDisplayDescription(),"Description");
        softAssert.assertEquals(SeverityPage.isDisplayIcon(),"Icon");
        softAssert.assertEquals(SeverityPage.isDisplayColor(),"Colour");
        softAssert.assertEquals(SeverityPage.isDisplayOKBtn(),"OK");
        softAssert.assertEquals(SeverityPage.isDisplayCancleBtn(),"Cancel");
        softAssert.assertAll();
    }

    @Test(priority = 7)
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
        softAssert.assertAll();

    }
    @Test(priority = 8)
    public void severityCancleBtnVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickSeverity();
        SeverityPage.isSeverityPageDisplay();
        SeverityPage.clickAddSeveritybtn();
        softAssert.assertEquals(SeverityPage.severityCancleBtnVerify(),"Cancel");
        softAssert.assertAll();
    }
    @Test(priority = 9)
    public void cancelSeverity() {

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

    }
    @Test(priority = 10)
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
    @Test()
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
        softAssert.assertAll();
    }
    @Test()
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
        softAssert.assertAll();
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
