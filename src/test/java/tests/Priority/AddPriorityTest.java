package tests.Priority;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class AddPriorityTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddPriorityTest.class);

    @Test(priority = 101,groups = {"regression","test"})
    public void clickSetting() {

        implicitWait(5);
        softAssert.assertEquals(HomePage.settingVerify(),"Setting","Setting not verified");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button verified");
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        staticWait(3);
        softAssert.assertEquals(HomePage.generalConfigVerify(),"General Configuration","General Configuration menu not displayed");
        LOGGER.info("Side Navigation_General Configuration button verified");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button verified");
        softAssert.assertAll();
    }

    @Test(priority =102,groups = {"regression","test"})
    public void clickGeneranConfiSetting() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        softAssert.assertAll();
    }

    @Test(priority = 103,groups = {"regression","test"})
    public void submenuPriorityVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS, "Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS, "Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS, "Side Navigation_Priority button clicked");
        softAssert.assertAll();
    }

    @Test(priority = 104,groups = {"regression","test"})
    public void PriorityPageVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        softAssert.assertEquals(PriorityPage.isPriorityPageDisplay(),"Priority Configuration","Priority Configuration not display");
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 105,groups = {"regression","test"})
    public void PriorityAddButtonVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertEquals(PriorityPage.priorityAddButtonVerify(),"Add priority","Add priority button not verify");
        LOGGER.info("Priority Page_Add button verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button verified");
        softAssert.assertAll();
    }

    @Test(priority = 106,groups = {"regression","test"})
    public void PriorityAddFormVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertEquals(PriorityPage.priorityAddButtonVerify(),"Add priority","Add priority button not verify");
        LOGGER.info("Priority Page_Add button verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button verified");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        staticWait(3);
        softAssert.assertEquals(PriorityPage.priorityAddFormVerify(),"Add Priority","Add priority form not verify");
        LOGGER.info("Priority Page_Add form verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add form verified");
        softAssert.assertAll();
    }
    @Test(priority = 107,groups = {"regression","test"})
    public void formItemsVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertEquals(PriorityPage.priorityAddButtonVerify(),"Add priority","Add priority button not verify");
        LOGGER.info("Priority Page_Add button verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button verified");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        staticWait(3);
        softAssert.assertEquals(PriorityPage.isDisplayName(),"Name","Priority name not Displayed");
        LOGGER.info("Priority name displayed");
        extentTest.log(LogStatus.PASS,"Priority name displayed");
        softAssert.assertEquals(PriorityPage.isDisplayDescription(),"Description","Priority Description not Displayed");
        LOGGER.info("Priority description displayed");
        extentTest.log(LogStatus.PASS,"Priority description displayed");
        softAssert.assertEquals(PriorityPage.isDisplayIcon(),"Icon","Priority Icon not Displayed");
        LOGGER.info("Priority Icon Displayed");
        extentTest.log(LogStatus.PASS,"Priority Icon Displayed");
        softAssert.assertEquals(PriorityPage.isDisplayColor(),"Colour","Priority color not Display");
        LOGGER.info("Priority color Displayed");
        extentTest.log(LogStatus.PASS,"Priority color Displayed");
        softAssert.assertEquals(PriorityPage.isDisplayOKBtn(),"OK","OK button not Displayed");
        LOGGER.info("OK button Displayed");
        extentTest.log(LogStatus.PASS,"OK button Displayed");
        softAssert.assertEquals(PriorityPage.isDisplayCancleBtn(),"Cancel","Cancel button not Displayed");
        LOGGER.info("Cancel button Displayed");
        extentTest.log(LogStatus.PASS,"Cancel button Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 108,groups = {"regression","test"})
    public void cancelPriority() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("High");
        LOGGER.info("Priority Page_Name added");
        extentTest.log(LogStatus.PASS,"Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        extentTest.log(LogStatus.PASS,"Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        extentTest.log(LogStatus.PASS,"Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Selected");
        softAssert.assertEquals(PriorityPage.isDisplayCancleBtn(),"Cancel","Cancel button not Displayed");
        LOGGER.info("Cancle button Displayed");
        extentTest.log(LogStatus.PASS,"Cancle button Displayed");
        PriorityPage.clickCancelBtn();
        LOGGER.info("Cancel button Clicked");
        extentTest.log(LogStatus.PASS,"Cancel button Clicked");
        staticWait(3);
        softAssert.assertEquals(PriorityPage.isPriorityPageDisplay(),"Priority Configuration","Priority page is not displayed");
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 109,groups = {"regression","test","smoke"})
    public void addPriority1() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("High");
        LOGGER.info("Priority Page_Name added");
        extentTest.log(LogStatus.PASS,"Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        extentTest.log(LogStatus.PASS,"Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        extentTest.log(LogStatus.PASS,"Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_OK button clicked");
        softAssert.assertAll();

    }

    @Test(priority = 110,groups = {"regression","test","smoke"})
    public void addPriority2() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Medium");
        LOGGER.info("Priority Page_Name added");
        extentTest.log(LogStatus.PASS,"Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        extentTest.log(LogStatus.PASS,"Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        extentTest.log(LogStatus.PASS,"Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_OK button clicked");
        softAssert.assertEquals(PriorityPage.addPriorityVerify(),"Medium","Added data not equal");
        LOGGER.info("Verify the Added data_Priority Added");
        extentTest.log(LogStatus.PASS,"Verify the Added data_Priority Added");
        softAssert.assertAll();

    }

    @Test(priority = 111,groups = {"regression","test","smoke"})
    public void addPriority3() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Low");
        LOGGER.info("Priority Page_Name added");
        extentTest.log(LogStatus.PASS,"Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        extentTest.log(LogStatus.PASS,"Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        extentTest.log(LogStatus.PASS,"Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_OK button clicked");
        softAssert.assertAll();
    }
    @Test(priority = 112,groups = {"regression","test","smoke"})
    public void addPriority4() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        staticWait(3);
        PriorityPage.setPeriorityName("higth");
        LOGGER.info("Priority Page_Name added");
        extentTest.log(LogStatus.PASS,"Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        extentTest.log(LogStatus.PASS,"Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        extentTest.log(LogStatus.PASS,"Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_OK button clicked");
        softAssert.assertAll();
    }


}