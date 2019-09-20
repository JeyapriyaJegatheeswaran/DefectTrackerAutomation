package tests.Defect;

/**
 * @author:jeyapriya
 */


import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import pages.Defect.AddDefectPage;
import pages.Defect.DefectPage;
import pages.Defect.MoreDefectPage;
import tests.Priority.AddPriorityTest;
import utils.PageBase;
import utils.TestBase;

public class AddDefectPreRequests extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddDefectPreRequests.class);

    @Test()
    public static void  addPriorityForDefectTesting(String priority) {

        implicitWait(5);
        HomePage.clickSetting();
        HomePage.clickGeneralconfig();
        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName(priority);
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();
    }
    @Test()
    public static void  addPriority1ForDefectTesting(String priority) {

        HomePage.clickPriority();
        PriorityPage.isPriorityPageDisplay();
        PriorityPage.clickAddPrioritybtn();
        PriorityPage.clearPeriorityName();
        PriorityPage.setPeriorityName(priority);
        PriorityPage.clearPeriorityDescription();
        PriorityPage.setPeriorityDescription("defect tracker configuration parts");
        PriorityPage.setIcon();
        PriorityPage.clickColor();
        PriorityPage.selectColor();
        PriorityPage.clickAddbtn();
    }
    @Test()
    public static void addSeverityForDefectTesting(String severity) {
        implicitWait(5);
        HomePage.clickSeverity();
        SeverityPage.clickAddSeveritybtn();
        //SeverityPage.clearSeverityName();
        SeverityPage.setSeverityName(severity);
        SeverityPage.clearSeverityDescription();
        SeverityPage.setSeverityDescription("test description");
        SeverityPage.setIcon();
        SeverityPage.clickColor();
        SeverityPage.selectColor();
        SeverityPage.clickAddOKbtn();

    }
    @Test(priority=51,groups = { "test", "regression","smoke"})
    public static void addStatusForDefectTesting(String status) {
        PageBase.implicitWait(2);
        DefectStatusPage.clickClickDefectStatus();
        DefectStatusPage.clickAddStatus();
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.setDefectType(status);
        DefectStatusPage.setDefectDescription("TestDcription");
        DefectStatusPage.implicitWait(2);
        DefectStatusPage.clickok();

    }
    @Test(priority=1)
    public static void addDefectTypeForDefectTesting(String type) {

        implicitWait(5);
        HomePage.clickDefectTypeSubMenu();
        staticWait(3);
        DefectTypePage.clickAddDefect();
        DefectTypePage.setDefectType(type);
        DefectTypePage.setDescription("ufvbeiebefbei");
        DefectTypePage.clickOkButton();

    }
//    @Test(priority=1)
//    public void te() {
//        addPriorityForDefectTesting("test");
//        staticWait(3);
//        addDefectType("test");
//       staticWait(3);
//       addSeverityMedium("test");
//       staticWait(3);
//       addStatus("test");
//
//    }

}
