package tests;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Defect.DefectPage;
import pages.HomePage;
import utils.JiraPolicy;

import static utils.PageBase.implicitWait;


public class Tests {

    @JiraPolicy(logTicketReady=true)
    @Test(priority=1, enabled=true)
    public void testLogin() {
        SoftAssert softAssert=new SoftAssert();
        implicitWait(5);
        HomePage.clickDefectMenu();
        HomePage.clickDefectSubMenu();
        DefectPage.clickAddDefect();
    }
}
