package tests.Defect;


import org.testng.annotations.Test;
import pages.Defect.DefectPage;
import pages.HomePage;
import utils.TestBase;

public class DeleteDefect extends TestBase {
    @Test(priority=1)
    public void checkDeleteDefectButton() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickDeleteDefect("DEF001");
        softAssert.assertTrue(DefectPage.isDefectDeletePopupDisplayed(),"Delete popup is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=1)
    public void CheckDeleteDefectConformationMsg() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickDeleteDefect("DEF001");

        softAssert.assertAll();
    }
    @Test(priority=1)
    public void deleteDefect() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickDeleteDefect("DEF001");
        //softAssert.assertEquals(DefectPage.getResult(),"jp1234","not match");
        softAssert.assertAll();
    }

}
