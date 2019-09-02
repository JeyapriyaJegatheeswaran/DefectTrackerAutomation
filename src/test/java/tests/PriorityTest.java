package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.PriorityPage;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class PriorityTest extends TestBase {
    @Test
    public void addPriority() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName("High");
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect gracker configuration parts");
        PriorityPage.setIcon();
//
        PriorityPage.clickAddbtn();

    }
}