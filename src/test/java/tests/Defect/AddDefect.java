package tests.Defect;


import org.testng.annotations.Test;
import pages.Defect.AddDefectPage;
import pages.Defect.DefectPage;
import pages.HomePage;
import utils.TestBase;

public class AddDefect extends TestBase {
    @Test(priority=1)
    public void checkDefectMenu() {

        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        softAssert.assertAll();
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        softAssert.assertAll();
    }
    @Test(priority=2)
    public void checkDefectSubMenu() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        softAssert.assertAll();
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=3)
    public void checkDefectPage() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        softAssert.assertAll();
        softAssert.assertEquals(HomePage.isDefectMenuDisplayed(),"Defect","defect menu not available");
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertTrue(DefectPage.isAddDefectButtonDisplayed(),"Defect Button is not Displayed");
        softAssert.assertTrue(DefectPage.isDefectTableDisplayed(),"Defect Table is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=4)
    public void checkAddDefectButton() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        softAssert.assertAll();
    }
    @Test(priority=5)
    public void checkAddDefectFormCancelButton() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
        AddDefectPage.clickCancelButton();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        softAssert.assertAll();

    }
//    @Test(priority=6)
//    public void checkAddDefectFormFields() {
//        implicitWait(5);
//        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
//        staticWait(2);
//        HomePage.clickDefectMenu();
//        staticWait(2);
//        HomePage.clickDefectSubMenu();
//        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
//        DefectPage.clickAddDefect();
//        softAssert.assertTrue(AddDefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
//
//        softAssert.assertAll();
//
//    }
//    @Test(priority=7)
//    public void checkDefectDetailsTable() {
//        implicitWait(5);
//        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
//        staticWait(2);
//        HomePage.clickDefectMenu();
//        staticWait(2);
//        HomePage.clickDefectSubMenu();
//        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
//        DefectPage.clickAddDefect();
//        softAssert.assertTrue(DefectPage.isAddDefectFormDisplayed(),"AddDefect Form is not Displayed");
//
//        softAssert.assertAll();
//
//    }
    @Test(priority=8)
    public void addDefect() {
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();
        AddDefectPage.createDefect("jp1234","testing defect service","testing defect service");
        softAssert.assertEquals(AddDefectPage.getResult(),"jp1234","not match");
        softAssert.assertAll();
    }
    @Test(priority=9)
    public void addDefectWithoutData() {

        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageTitleDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();

        staticWait(10);
        AddDefectPage.createDefectWithoutData();
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input employeeId"),"Please input employeeId!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Project"),"Please select Project!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Module"),"Please select Module!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Description"),"Please input Description!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please input Details"),"Please input Details!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Type"),"Please select Type!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Severity"),"Please select Severity!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select Priority"),"Please select Priority!","fail");
        softAssert.assertEquals(AddDefectPage.CheckValidMsg("Please select status"),"Please select status!","fail");

        softAssert.assertAll();
    }
}
