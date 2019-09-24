package tests.Priority;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class EditPriorityTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EditPriorityTest.class);
    @Test(priority = 113,groups = {"regression","test"})

    public void priorityPageDisplay() {
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
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_General Configuration button clicked");
        staticWait(3);
        softAssert.assertEquals(HomePage.priorityVerify(),"Priority","Priority not verified");
        LOGGER.info("Side Navigation_Priority button verified");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button verified");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        extentTest.log(LogStatus.PASS,"Side Navigation_Priority button clicked");
        softAssert.assertEquals(PriorityPage.isPriorityPageDisplay(),"Priority Configuration","Priority Configuration not display");
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS,"Priority Page Displayed");
        softAssert.assertAll();
    }

    //edit button verify
    @Test(priority = 114,groups = {"regression","test"})
    public void priorityBtnVerify() {
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
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        extentTest.log(LogStatus.PASS, "Priority Page Displayed");
        softAssert.assertTrue(PriorityPage.editButtonVerify(),"Priority Edit button not Verified");
        LOGGER.info("Priority Edit button Verified");
        extentTest.log(LogStatus.PASS, "Priority Edit button Verified");
        softAssert.assertAll();
    }
    //form verify
    @Test(priority = 115,groups = {"regression","test"})
    public void priorityEditFormVerify() {
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
        softAssert.assertTrue(PriorityPage.editButtonVerify(),"Priority Edit button not Verified");
        LOGGER.info("Priority Page_Edit button verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button verified");
        PriorityPage.clickEditBtn();
        LOGGER.info("Priority Page_Edit button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Edit button Clicked");
        staticWait(3);
        softAssert.assertEquals(PriorityPage.editFormVerify(),"Edit priority","Edit priority form not verify");
        LOGGER.info("Priority Page_Edit form verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Edit form verified");
        softAssert.assertAll();
    }
    //item verify
    @Test(priority = 116,groups = {"regression","test"})
    public void priorityEditFormItemsVerify() {
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
        softAssert.assertTrue(PriorityPage.editButtonVerify(),"Priority Edit button not Verified");
        LOGGER.info("Priority Page_Edit button verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Add button verified");
        PriorityPage.clickEditBtn();
        LOGGER.info("Priority Page_Edit button Clicked");
        extentTest.log(LogStatus.PASS,"Priority Page_Edit button Clicked");
        staticWait(3);
        softAssert.assertEquals(PriorityPage.editFormVerify(),"Edit priority","Edit priority form not verify");
        LOGGER.info("Priority Page_Edit form verified");
        extentTest.log(LogStatus.PASS,"Priority Page_Edit form verified");
        softAssert.assertEquals(PriorityPage.isEditDisplayName(),"Name","Priority name not Displayed");
        LOGGER.info("Priority name displayed");
        extentTest.log(LogStatus.PASS,"Priority name displayed");
        softAssert.assertEquals(PriorityPage.isEditDisplayDescription(),"Description","Priority Description not Displayed");
        LOGGER.info("Priority description displayed");
        extentTest.log(LogStatus.PASS,"Priority description displayed");
        softAssert.assertEquals(PriorityPage.isEditDisplayIcon(),"Icon","Priority Icon not Displayed");
        LOGGER.info("Priority Icon Displayed");
        extentTest.log(LogStatus.PASS,"Priority Icon Displayed");
        softAssert.assertEquals(PriorityPage.isEditDisplayColor(),"Colour","Priority color not Display");
        LOGGER.info("Priority color Displayed");
        extentTest.log(LogStatus.PASS,"Priority color Displayed");
        softAssert.assertEquals(PriorityPage.isEditDisplayOKBtn(),"OK","OK button not Displayed");
        LOGGER.info("OK button Displayed");
        extentTest.log(LogStatus.PASS,"OK button Displayed");
        softAssert.assertEquals(PriorityPage.isEditDisplayCancelBtn(),"Cancel","Cancel button not Displayed");
        LOGGER.info("Cancel button Displayed");
        extentTest.log(LogStatus.PASS,"Cancel button Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 117,groups = {"regression","test","smoke"})
    public void priorityEdited() {
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
        PriorityPage.clickEditBtn();
        LOGGER.info("Priority Edit button clicked");
        extentTest.log(LogStatus.PASS,"Priority Edit button clicked");
        PriorityPage.clearPeriorityNameEdited();
        LOGGER.info("Priority Edit_Name cleared");
        extentTest.log(LogStatus.PASS,"Priority Edit_Name cleared");
        PriorityPage.setPeriorityNameEdited("editTest");
        LOGGER.info("Priority Edit_Name Edited");
        extentTest.log(LogStatus.PASS,"Priority Edit_Name edited");
        PriorityPage.clearPeriorityDescriptionEdited();
        LOGGER.info("Priority Edit_Description cleared");
        extentTest.log(LogStatus.PASS,"Priority Edit_Description cleared");
        PriorityPage.setPeriorityDescriptionEdited("defect tracker configuration parts");
        LOGGER.info("Priority Edit_Description edited");
        extentTest.log(LogStatus.PASS,"Priority Edit_Description edited");
        PriorityPage.setIconEdited();
        LOGGER.info("Priority Edit_Icon edited");
        extentTest.log(LogStatus.PASS,"Priority Edit_Icon edited");
        PriorityPage.clickColorEdited();
        LOGGER.info("Priority Edit_Color dropdown clicked");
        extentTest.log(LogStatus.PASS,"Priority Edit_Color dropdown clicked");
        PriorityPage.selectColorEdited();
        LOGGER.info("Priority Edit_Color edited");
        extentTest.log(LogStatus.PASS,"Priority Edit_Color edited");
        PriorityPage.clickOKbtnEdited();
        LOGGER.info("Priority Edit_OK button clicked");
        extentTest.log(LogStatus.PASS,"Priority Edit_OK button clicked");
        softAssert.assertEquals(PriorityPage.editPriorityVerify(),"editTest","Edited Priority is not show in the table ");
        LOGGER.info("Edited data show in the table");
        extentTest.log(LogStatus.PASS,"Priority Edit button clicked");
        softAssert.assertAll();

    }
}
