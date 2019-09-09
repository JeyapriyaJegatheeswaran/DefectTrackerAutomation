package tests.Priority;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

public class AddPriorityTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddPriorityTest.class);
    @Test
    public void addPriority1() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("High");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();

    }


    @Test
    public void addPriority2() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Medium");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();
        softAssert.assertEquals(PriorityPage.addPriorityVerify(),"Medium","Added data not equal");
        LOGGER.info("Priority Added");


    }

    @Test
    public void addPriority3() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("Low");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();

    }
    @Test
    public void addPriority4() {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("higth");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();

    }


}