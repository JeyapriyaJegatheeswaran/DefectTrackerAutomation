package tests.DefectStatus;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefectStatusPage;
import pages.HomePage;
import pages.ModulePage;
import utils.PageBase;
import utils.TestBase;

public class DefectStatus  extends TestBase {
    @Test(priority=1)
  public void addStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.AddStatusFunction("New","TestNormals");


}
    @Test(priority=2)
    public void EmptyStatus() {
    PageBase.implicitWait(2);
    //DefectStatusPage.isDefectPageDisplayed();
    DefectStatusPage.AddStatusFunction("","");
}
    @Test(priority=3)
    public void DecrptionAddStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.AddStatusFunction("","TestNormals");
    }
    @Test(priority=4)
    public void onlyAddStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.AddStatusFunction("NEW","");
    }
    @Test(priority=4)
    public void NumbervalueAddStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.AddStatusFunction("NEW12@","TestNormals123@");
    }


}
