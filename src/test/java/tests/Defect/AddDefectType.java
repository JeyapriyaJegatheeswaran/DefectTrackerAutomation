package tests.Defect;


import org.testng.annotations.Test;
import pages.DefectTypePage;
import pages.HomePage;
import utils.TestBase;

public class AddDefectType extends TestBase {
    @Test(priority=1)
    public void addDefectType() {

        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickSettingMenu();
        HomePage.clickConficurationSubMenu();
        HomePage.clickDefectTypeSubMenu();
        staticWait(3);
        DefectTypePage.clickAddDefect();
        DefectTypePage.setDefectType("jjjjjjjjjj");
        DefectTypePage.setDescription("ufvbeiebefbei");
        DefectTypePage.clickOkButton();

    }
}
