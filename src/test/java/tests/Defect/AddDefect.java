package tests.Defect;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectPage;
import pages.HomePage;
import utils.JiraPolicy;
import utils.MethodBase;
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
        DefectPage.createDefect("jp1234","testing defect service","testing defect service");
        softAssert.assertEquals(DefectPage.getResult(),"jp1234","not match");
        softAssert.assertAll();
    }
    @Test(priority=2)
    public void addDefectWithoutData() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home Page is not Displayed");
        staticWait(2);
        HomePage.clickDefectMenu();
        staticWait(2);
        HomePage.clickDefectSubMenu();
        softAssert.assertTrue(DefectPage.isDefectPageDisplayed(),"Defect Page is not Displayed");
        DefectPage.clickAddDefect();

        staticWait(3);
        DefectPage.createDefectWithoutData();
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please input employeeId"),"Please input employeeId!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select Project"),"Please select Project!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select Module"),"Please select Module!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please input Description"),"Please input Description!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please input Details"),"Please input Details!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select Type"),"Please select Type!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select Severity"),"Please select Severity!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select Priority"),"Please select Priority!","fail");
        softAssert.assertEquals(DefectPage.CheckValidMsg("Please select status"),"Please select status!","fail");

        softAssert.assertAll();
    }
}
