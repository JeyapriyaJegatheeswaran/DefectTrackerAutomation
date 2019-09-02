package tests.DefectStatus;

import org.testng.annotations.Test;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class EditDefectStatus  extends TestBase {
    @Test(priority=1)
    public void EditStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.EditStatusFunction("Normaltest","vjkdjnv");


    }
}
