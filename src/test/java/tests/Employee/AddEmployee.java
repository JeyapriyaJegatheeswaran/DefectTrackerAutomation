package tests.Employee;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.EmployeePage;
import pages.HomePage;
import utils.TestBase;

public class AddEmployee  extends TestBase {
    @Test(priority = 1)
    public void addEmployee() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickCompanyMenu();
        HomePage.clickEmployeeSubMenu();
        EmployeePage.isEmployeePageDisplayed();
        EmployeePage.AddEmployee("Emp03","Jana","Thass","jana2@gmail.com");
        EmployeePage.PageRefresh();
        EmployeePage.ScessfullyAddedValidation();
    }
    @Test(priority = 2)
    public void addEmployeeWithBlankEmpID() {
        SoftAssert softAssert = new SoftAssert();
        implicitWait(5);
        staticWait(5);
        HomePage.clickCompanyMenu();
        HomePage.clickEmployeeSubMenu();
        EmployeePage.isEmployeePageDisplayed();
        EmployeePage.AddEmployee("","Jana","Thass","jana2@gmail.com");
        EmployeePage.BlankEmpIdValidation();
    }
}