package tests.Priority;

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
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickEditBtn();
        PriorityPage.clearPeriorityNameEdited();
        PriorityPage.setPeriorityNameEdited("editTest");
        PriorityPage.clearPeriorityDescriptionEdited();
        PriorityPage.setPeriorityDescriptionEdited("defect tracker configuration parts");
        PriorityPage.setIconEdited();
        PriorityPage.clickColorEdited();
        PriorityPage.selectColorEdited();
        PriorityPage.clickAddbtnEdited();
        softAssert.assertEquals(PriorityPage.editPriorityVerify(),"editTest","Edited data not equal");
        LOGGER.info("Priority Edited");


    }
}
