package tests.Module;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ModulePage;
import utils.TestBase;

import static utils.PageBase.implicitWait;

public class AddModuleTest extends TestBase {
    @Test
    public void addModule() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        HomePage.clickModule();
        ModulePage.isModulePageDisplay();
        ModulePage.clickAddmodulebtn();
        ModulePage.clearModuleId();
        ModulePage.setModuleId("Mod2");
        ModulePage.clearModuleName();
        ModulePage.setModuleName("Defect");
        ModulePage.setProjectName();
        ModulePage.clickAddbtn();
    }

}

