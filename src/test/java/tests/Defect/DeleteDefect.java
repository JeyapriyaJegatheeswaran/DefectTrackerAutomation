package tests.Defect;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectPage;
import pages.HomePage;
import utils.TestBase;

public class DeleteDefect extends TestBase {
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
        DefectPage.deleteDefect();
        //softAssert.assertEquals(DefectPage.getResult(),"jp1234","not match");
        softAssert.assertAll();
    }

}
