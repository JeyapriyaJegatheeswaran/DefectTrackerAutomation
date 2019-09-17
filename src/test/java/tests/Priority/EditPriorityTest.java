package tests.Priority;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class EditPriorityTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EditPriorityTest.class);
    @Test
    public void editPriority() {

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
