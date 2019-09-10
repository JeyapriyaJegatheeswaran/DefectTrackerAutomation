package tests.Employee;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.EmployeePage;
import pages.HomePage;
import utils.TestBase;

public class EditEmployee extends TestBase {

    @Test(priority = 1)
    public void editEmployee() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickCompanyMenu();
        HomePage.clickEmployeeSubMenu();
        EmployeePage.isEmployeePageDisplayed();
        implicitWait(3);
        EmployeePage.EditEmployee("Thanushan","Raveeendran","ravithanu@gmail.com");
    }
}