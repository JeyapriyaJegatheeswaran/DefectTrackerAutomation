package tests.Defect;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectPage;
import pages.HomePage;
import utils.JiraPolicy;
import utils.TestBase;

public class AddDefect extends TestBase {
    @Test(priority=1)
    public void addDefect() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        DefectPage.setDefectId("jp1234");
        DefectPage.setProject();
        DefectPage.setModule();
        DefectPage.setDescription("testing defect service");
        DefectPage.setSteps("testing defect service");
        DefectPage.setEnteredBy();
        DefectPage.setFoundIn();
        DefectPage.setAssignTo();
        DefectPage.setType();
        DefectPage.setPriority();
        DefectPage.setSeverioty();
        DefectPage.clickOkButton();
    }
}
