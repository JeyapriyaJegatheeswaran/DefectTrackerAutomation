package pages.project;
/**
 * @author:jeyapriya
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class AddProjectPage extends PageBase {

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AddProjectPage.class));

    private static String txtAddProjectFormTitle = "//div[@id='rcDialogTitle0']";

    private static String txtProjectId = "//input[@id=\"projectId\"]";
    private static String txtProjectName = "//input[@id=\"projectName\"]";
    private static String txtType = "//div[@id=\"type\"]";
    private static String txtCommonDropValue = "//li[text()=\"value\"]";
    private static String txtStartDate = "//span[@id=\"startDate\"]";
    private static String txtStartDateValue = "//div/div/input[@placeholder=\"Start Date\"]";
    private static String txtEndDate = "//span[@id=\"endDate\"]";
    private static String txtEndDateValue =   "//div/div/input[@placeholder=\"End Date\"]";
    private static String txtDuration = "//input[@id=\"duration\"]";
    private static String txtStatus = "//div[@id=\"status\"]";
    private static String btnAdd = "//div/div/div/button[@class=\"ant-btn ant-btn-primary\"]";
    private static String btnCancel = "//button[@class=\"ant-btn\"]";
    private static String commonValidMsgStatus = "//div[text()='MSG!']";
    public static boolean isAddProjectFormDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtAddProjectFormTitle);
    }
    public static boolean isProjectIdFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtProjectId);
    }
    public static boolean isProjectNameFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtProjectName);
    }
    public static boolean isTypeFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtType);
    }
    public static boolean isStartDateFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtStartDate);
    }
    public static boolean isEndDateFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtEndDate);
    }
    public static boolean isDurationFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtDuration);
    }
    public static boolean isStatusFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtStatus);
    }
    public static boolean isOkButtonDisplayed(){
        return MethodBase.isDisplayed_ByXpath(btnAdd);
    }
    public static boolean isCancelDisplayed(){
        return MethodBase.isDisplayed_ByXpath(btnCancel);
    }

    public static void clickCancelButton(){

        MethodBase.clickButton_ByXpath(btnCancel);
    }

    public static void AddProject(String proId, String proName,String type,String startDate,String endDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutID( String proName,String type,String startDate,String endDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutName(String proId, String type,String startDate,String endDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutType(String proId, String proName,String startDate,String endDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutStartDate(String proId, String proName,String type,String endDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutEndDate(String proId, String proName,String type,String startDate,String duration,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutDuration(String proId, String proName,String type,String startDate,String endDate,String status) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.selectAction(txtStatus,txtCommonDropValue.replace("value",status));
        LOGGER.info("Status Selected");


    }
    public static void AddProjectWithoutStatus(String proId, String proName,String type,String startDate,String endDate,String duration) {
        MethodBase.setText_ByXpath(txtProjectId,proId);
        LOGGER.info("Project Id is Entered");
        MethodBase.setText_ByXpath(txtProjectName,proName);
        LOGGER.info("Project Name is Entered");
        MethodBase.selectAction(txtType,txtCommonDropValue.replace("value",type));
        LOGGER.info("Type Selected");
        MethodBase.click_ByXpath(txtStartDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtStartDateValue, startDate);
        MethodBase.setEnterKey_ByXpath(txtStartDateValue);
        LOGGER.info("Start Date Selected");
        MethodBase.click_ByXpath(txtEndDate);
        implicitWait(2);
        MethodBase.setText_ByXpath(txtEndDateValue,endDate);
        MethodBase.setEnterKey_ByXpath(txtEndDateValue);
        LOGGER.info("End Date Selected");
        MethodBase.setText_ByXpath(txtDuration,duration);
        LOGGER.info("Duration Entered");

    }
    public static void clickOKButton(){

       MethodBase.clickButton_ByXpath(btnAdd);
    }


    public static String CheckValidMsg(String msg){

        return MethodBase.get_Text(commonValidMsgStatus.replace("MSG", msg));
    }
//
//    public static void deleteDefect(){
//        MethodBase.clickButton_ByXpath(btnDelete);
//        staticWait(3);
//        MethodBase.clickButton_ByXpath(btnDeleteOk);
//    }


}
