package tests.Priority;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class AddPriorityTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddPriorityTest.class);

    @Test(priority = 1)
    public void clickSettingVerify() {
        implicitWait(5);
        softAssert.assertEquals(HomePage.settingVerify(),"Setting");
        LOGGER.info("Side Navigation_Setting button verified");
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        softAssert.assertEquals(HomePage.generalConfigVerify(),"General Configuration");
        LOGGER.info("Side Navigation_General Configuration button verified");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
       softAssert.assertAll();
    }

    @Test(priority = 2)
    public void clickGeneranConfiSettingVerify() {
        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        softAssert.assertEquals(HomePage.priorityVerify(),"Priority");
        LOGGER.info("Side Navigation_Priority button verified");

    }
    @Test(priority = 3)
    public void Priority1PageVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        softAssert.assertEquals(PriorityPage.isPriorityPageDisplay(),"Priority Configuration");
        LOGGER.info("Priority Page Displayed");
        softAssert.assertAll();
    }
    @Test(priority = 4)
    public void addPriorityBtbVerify() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        softAssert.assertEquals(PriorityPage.priorityAddButtonVerify(),"Add priority");
        LOGGER.info("Priority Page_Add button verified");
        softAssert.assertAll();
    }
    @Test(priority = 5)
    public void addPriority1() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("High");
        LOGGER.info("Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");


    }

    @Test
    public void addPriority2() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Medium");
        LOGGER.info("Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");
        softAssert.assertEquals(PriorityPage.addPriorityVerify(),"Medium","Added data not equal");
        LOGGER.info("Verify the Added data_Priority Added");
        softAssert.assertAll();

    }

    @Test
    public void addPriority3() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Low");
        LOGGER.info("Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        LOGGER.info("Priority Page_Description added");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");

    }
    @Test
    public void addPriority4() {

        implicitWait(5);
        HomePage.clickSetting();
        LOGGER.info("Side Navigation_Setting button clicked");
        HomePage.clickGeneralconfig();
        LOGGER.info("Side Navigation_General Configuration button clicked");
        HomePage.clickPriority();
        LOGGER.info("Side Navigation_Priority button clicked");
        PriorityPage.isPriorityPageDisplay();
        LOGGER.info("Priority Page Displayed");
        PriorityPage.clickAddPrioritybtn();
        LOGGER.info("Priority Page_Add button Clicked");
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("higth");
        LOGGER.info("Priority Page_Name added");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        LOGGER.info("Priority Page_Icon added");
        PriorityPage.clickColor();
        LOGGER.info("Priority Page_Colour dropdown Clicked");
        PriorityPage.selectColor();
        LOGGER.info("Priority Page_Colour Selected");
        PriorityPage.clickAddbtn();
        LOGGER.info("Priority Page_OK button clicked");

    }


}