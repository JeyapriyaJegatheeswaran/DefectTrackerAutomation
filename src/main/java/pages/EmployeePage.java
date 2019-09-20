package pages;


import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class EmployeePage extends PageBase {



    //Add Employee
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(EmployeePage.class));
    private static String hdrEmployee= "//*[@id=\"root\"]/div/section/section/main/div[1]/div[2]/span";
    private static String btnAddEmployee = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[1]/div/button";
    private static String txtEmployeeId = "employeeId";
    private static String txtEmployeeName = "employeeName";
    private static String txtEmployeeFirstName = "employeeFirstName";
    private static String drpDesignation = "//*[@id=\"gender\"]";
    private static String designationValue = "//li[text()=\"employee\"]";
    private static String txtEmail = "employeeEmail";
    private static String btnOK = "/html/body/div[6]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String btnAddValue = "//td[text()=\"EMP03\"]";
    private static String errorMessageBlankEmpID= "//*[text()=\"Please input employeeId!\"]";





    private static String btnDeleteValue = "//td[text()=\"EMP03\"]";
    private static String DeleteSucessMsg = "/html/body/div[7]/div/span/div/div";
    private static String EditSucessMsg = "/html/body/div[7]/div/span/div/div/div";
    private static String btnDelete = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[2]/td[7]/a/i";
    private static String btnDeleteOk = "/html/body/div[6]/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String btnEdit = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[4]/div/div/div/div/div/table/tbody/tr[1]/td[6]/a/i";
    private static String txtEditEmployeeName = "//input[@placeholder=\"Employee Name\"]";
    private static String txtEditEmployeeFirstName = "//input[@placeholder=\"Employee FirstName\"]";
    private static String drpEditDesignation = "//*[@id=\"gender\"]/div/div";
    private static String editDesignationValue = "//li[text()=\"Developer\"]";
    private static String txtEditEmail = "//input[@placeholder=\"Email Id\"]";


    public static boolean isEmployeePageDisplayed() {
        return MethodBase.isDisplayed_ByXpath(hdrEmployee);

    }
    public static void AddEmployee(String EmpId, String EmpName,String EmpFirstName,String email) {
        MethodBase.click_ByXpath(btnAddEmployee);
        LOGGER.info("Add employee btn clicked");
        MethodBase.setText_ByID(txtEmployeeId,EmpId);
        LOGGER.info("Employee Id entered");
        MethodBase.setText_ByID(txtEmployeeName,EmpName);
        LOGGER.info("Employee Name entered");
        MethodBase.setText_ByID(txtEmployeeFirstName,EmpFirstName);
        LOGGER.info("Employee First Name entered");
        MethodBase.selectAction(drpDesignation,designationValue);
        LOGGER.info("Designation Selected");
        MethodBase.setText_ByID(txtEmail,email);
        LOGGER.info("Email entered");
        MethodBase.click_ByXpath(btnOK);
        LOGGER.info("Ok button Clicked");


    }
    public static void PageRefresh() {
        MethodBase.refreshDriver();
        LOGGER.info("Page Refreshed");
    }
    public static void ScessfullyAddedValidation() {
        MethodBase.assertEqual_Text_ByXpath(btnAddValue, "EMP03");
        LOGGER.info("Sucessfully Added New Employee");
    }
    public static void BlankEmpIdValidation(){
        MethodBase.assertEqual_Text_ByXpath(errorMessageBlankEmpID,"Please input employeeId!");
        LOGGER.info("Sucessfully validate error message");
    }
    public static void EditEmployee(String EmpName,String EmpFirstName,String email) {
        MethodBase.click_ByXpath(btnEdit);
        LOGGER.info("Edit button Clicked");
        MethodBase.staticWait(3);
        MethodBase.clear_ByXpath(txtEditEmployeeName);
        //LOGGER.info("Employee Name Updated");
        MethodBase.setText_ByXpath(txtEditEmployeeName,EmpName);
        LOGGER.info("Employee Name Updated");
        MethodBase.clear_ByXpath(txtEditEmployeeFirstName);
        MethodBase.setText_ByXpath(txtEditEmployeeFirstName,EmpFirstName);
        LOGGER.info("Employee First Name Updated");
        //MethodBase.clear_ByXpath(txtEditEmployeeFirstName);
//        MethodBase.selectAction(drpEditDesignation,editDesignationValue);
        MethodBase.clear_ByXpath(txtEditEmail);
        MethodBase.setText_ByXpath(txtEditEmail,email);
        LOGGER.info("Email Updated");
        MethodBase.click_ByXpath(btnOK);
        LOGGER.info("Ok Button Clicked");
        MethodBase.assertEqual_Text_ByXpath(EditSucessMsg,"Updated Successfully!!!");

    }
    public static void DeleteEmployee() {
        MethodBase.assertEqual_Text_ByXpath(btnDeleteValue,"EMP03");
        LOGGER.info("Delete Data Verified");
        MethodBase.click_ByXpath(btnDelete);
        LOGGER.info("Delete Button Clicked");
        MethodBase.click_ByXpath(btnDeleteOk);
        LOGGER.info("Delete Confirmation Accepted");
        MethodBase.assertEqual_Text_ByXpath(DeleteSucessMsg,"Successfully Deleted");
        LOGGER.info("Employee Sucessfully Deleted");

    }
}
