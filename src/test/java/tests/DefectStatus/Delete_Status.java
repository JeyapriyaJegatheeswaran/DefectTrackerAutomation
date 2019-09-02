package tests.DefectStatus;

import org.testng.annotations.Test;
import pages.DefectStatusPage;
import utils.PageBase;
import utils.TestBase;

public class Delete_Status extends TestBase {
    @Test(priority=1)
    public void DeleteStatus() {
        PageBase.implicitWait(2);
        DefectStatusPage.DeleteStatusFunction();

    }

}
