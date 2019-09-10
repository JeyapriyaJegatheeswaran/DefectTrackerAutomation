package tests.Defect;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Defect.DefectPage;
import pages.Defect.EditDefectPage;
import pages.HomePage;
import utils.TestBase;

public class EditDefect extends TestBase {
    @Test(priority=1)
    public void checkEditButton() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton();
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        softAssert.assertAll();
    }

    @Test(priority=2)
    public void editEnteredByOption() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton();
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editEnteredBy("User 3");
        softAssert.assertAll();
    }

}
