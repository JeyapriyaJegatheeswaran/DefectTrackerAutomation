package tests.Defect;


import org.openqa.selenium.By;
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
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(3);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=2)
    public void editModule() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        //EditDefectPage.editModule("moduleName");
        EditDefectPage.clickOKButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","2"),"defect","not match");

        softAssert.assertAll();
    }
    @Test(priority=3)
    public void editSeverity() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editSeverity("Low");
        EditDefectPage.clickOKButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","3"),"Low","not match");

        softAssert.assertAll();
    }
    @Test(priority=4)
    public void editPriority() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editPriority("Low");
        EditDefectPage.clickOKButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","4"),"Low","not match");

        softAssert.assertAll();
    }
    @Test(priority=5)
    public void editStatus() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editStatus("Open");
        EditDefectPage.clickOKButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","5"),"Open","not match");

        softAssert.assertAll();
    }
    @Test(priority=6)
    public void editAssignee() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        //EditDefectPage.editAssignTo("jp");
        EditDefectPage.clickOKButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","6"),"jp","not match");

        softAssert.assertAll();
    }
    @Test(priority=7)
    public void editFoundIn() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editFoundIn("Release3");
        EditDefectPage.clickOKButton();
        softAssert.assertAll();
    }
    @Test(priority=8)
    public void editEnteredByOption() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editEnteredBy("User 3");
        EditDefectPage.clickOKButton();
        softAssert.assertAll();
    }
    @Test(priority=9)
    public void editType() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editType("Function");
        EditDefectPage.clickOKButton();
        softAssert.assertAll();
    }
    @Test(priority=9)
    public void checkEditDefectCancelButton() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        staticWait(2);
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickEditButton("DEF001");
        staticWait(2);
        softAssert.assertTrue(EditDefectPage.isEditDefectFormDisplayed(),"Edit Defect Form is not Displayed");
        staticWait(3);
        EditDefectPage.editStatus("status");
        staticWait(3);
        EditDefectPage.clickCancelButton();
        softAssert.assertEquals(DefectPage.verifyEditStatus("DEF001","5"),"Open","not match");

        softAssert.assertAll();
    }
}