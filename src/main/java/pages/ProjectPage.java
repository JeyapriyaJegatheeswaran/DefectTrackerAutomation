package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class ProjectPage extends PageBase {

        public SoftAssert softAssert;

        private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(ProjectPage.class));

        private static String hrdProject = "//*[@id=\"root\"]/div/section/section/main/div[1]/div[2]";
        private static String btnAddProject = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[1]/button";
        private static String txtProjectId = "//*[@id=\"projectId\"]";
        private static String txtEditProjectId = "/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div/span/input";
        private static String txtProjectName = "//*[@id=\"projectName\"]";
        private static String txtEditProjectName ="/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[2]/div/span/input";
        private static String drpType = "//*[@id=\"type\"]/div/div";
        private static String drpEditType = "//*[@placeholder=\"Type\"]";
        private static String drpTypeValue = "//*[text()=\"Mobile Application\"]";
        private static String drpEditTypeValue = "private static String drpTypeValue = \"//*[text()=\\\"Mobile Application\\\"]\";";
        private static String drpStartDate = "//*[@name=\"startDate\"]";
        private static String drpEditStartDate = "//input[@placeholder=\"Start Date\"]";
        private static String drpStartDateValue = "/html/body/div[9]/div/div/div/div/div[1]/div/input";
        private static String drpEditStartDateValue = "//input[@placeholder=\"Start Date\"]";
        private static String drpEndDate = "//*[@name=\"endDate\"]";
        private static String drpEditEndDate = "//input[@placeholder=\"End Date\"]";
        private static String drpEndDateValue =   "//*[@ class=\"ant-calendar-input \"]";
        private static String drpEditEndDateValue =   "//input[@class=\"ant-calendar-input \"]";
        private static String txtDuration = "//*[@id=\"duration\"]";
        private static String txtEditDuration = "//input[@placeholder=\"Duration\"]";
        private static String drpStatus = "//*[@id=\"status\"]/div/div/div";
        private static String drpEditStatus = "//input[@placeholder=\"Status\"]";
        private static String drpStatusValue = "//*[text()=\"New\"]";
        private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";
        private static String btnEdit = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[8]";
        private static String btnDelete = "//*[@id=\"root\"]/div/section/section/main/div[2]/div[2]/div/div/div/div/div/table/tbody/tr/td[9]";
        private static String deleteConfirmationOk = "//*[text()=\"OK\"]";
        private static String addSucessfulMsg = "/html/body/div[12]/div/span/div/div/div/span";
        private static String editSucessfulMsg = "/html/body/div[8]/div/span/div/div";
        private static String deleteSucessfulMsg = "/html/body/div[7]/div/span/div/div";
        private static String BtnUpdate = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";




    public static boolean isProjectPageDisplayed() {
       return MethodBase.isDisplayed_ByXpath(hrdProject);

    }
        public static void AddProject(String proId, String proName,String type,String startDate,String endDate,String duration) {
        MethodBase.click_ByXpath(btnAddProject);
        LOGGER.info("Add Project Button Clicked");
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(drpType,drpTypeValue);
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(drpStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(drpStartDateValue, startDate);
        LOGGER.info("Start Date Selected");
        getDriver().findElement(By.xpath("/html/body/div[9]/div/div/div/div/div[1]/div/input")).sendKeys(Keys.ENTER);
        MethodBase.click_ByXpath(drpEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(drpEndDateValue,endDate);
        LOGGER.info("End Date Selected");
        getDriver().findElement(By.xpath("//*[@ class=\"ant-calendar-input \"]")).sendKeys(Keys.ENTER);
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(drpStatus,drpStatusValue);
        LOGGER.info("Status Selected");
        staticWait(3);
        MethodBase.click_ByXpath(btnAdd);
        LOGGER.info("Add Button Clicked");

    }
    public static void AddSucessfullMsg() {
        MethodBase.assertEqual_Text_ByXpath(addSucessfulMsg,"Successfully Added!!!");
        LOGGER.info("Add Sucessfully Message Verified");
    }

    public static void EditProject(String proId, String proName,String type,String startDate,String endDate,String duration,String status) {
        MethodBase.click_ByXpath(btnEdit);
        LOGGER.info("Edit Project Button Clicked");
        implicitWait(2);
        MethodBase.clear_ByXpath(txtEditProjectId);
        MethodBase.setText_ByXpath(txtEditProjectId,proId);
        LOGGER.info("Project ID Entered");
        MethodBase.clear_ByXpath(txtEditProjectName);
        MethodBase.setText_ByXpath(txtEditProjectName,proName);
        LOGGER.info("Project Name Entered");
        //MethodBase.selectAction(drpEditType,drpEditTypeValue);
        //LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(drpEditStartDate);
        MethodBase.setText_ByXpath(drpEditStartDateValue, startDate);
        LOGGER.info("Start Date Selected");
        //getDriver().findElement(By.xpath(drpEditStartDateValue)).sendKeys(Keys.ENTER);
//        MethodBase.click_ByXpath(drpEditEndDate);
//        MethodBase.setText_ByXpath(drpEditEndDateValue,endDate);
//        LOGGER.info("End Date Selected");
//        getDriver().findElement(By.xpath(drpEditEndDateValue)).sendKeys(Keys.ENTER);
//        MethodBase.clear_ByXpath(txtEditDuration);
//        MethodBase.setText_ByXpath(txtEditDuration,duration);
//        LOGGER.info("Duration Entered");
//        MethodBase.selectAction(drpEditStatus,drpStatusValue);
//        LOGGER.info("Status Selected");
//        MethodBase.click_ByXpath(BtnUpdate);
//        LOGGER.info("Update Button Clicked");

    }
    public static void EditSucessfullMsg() {
        MethodBase.assertEqual_Text_ByXpath(editSucessfulMsg,"Edit Successfully!");
        LOGGER.info("Edit Sucessfully Message Verified");
    }
    public static void DeleteProject() {
        MethodBase.click_ByXpath(btnDelete);
        LOGGER.info("Delete Project Button Clicked");
        MethodBase.click_ByXpath(deleteConfirmationOk);
        LOGGER.info("Delete Confirmation Ok Button Clicked");
    }
    public static void DeleteSucessfullMsg() {
        MethodBase.assertEqual_Text_ByXpath(deleteSucessfulMsg,"Delete Successfully");
        LOGGER.info("Delete Sucessfully Message Verified");
    }
}
