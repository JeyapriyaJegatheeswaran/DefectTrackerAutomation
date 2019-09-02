package pages;

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
        private static String txtProjectName = "//*[@id=\"projectName\"]";
        private static String drpType = "//*[@id=\"type\"]/div/div";
        private static String drpTypeValue = "//*[text()=\"Mobile Application\"]";
        private static String drpStartDate = "//*[@name=\"startDate\"]";
        private static String drpStartDateValue = "/html/body/div[9]/div/div/div/div/div[1]/div/input";
        private static String drpEndDate = "//*[@name=\"endDate\"]";
        private static String drpEndDateValue = "/html/body/div[11]/div/div/div/div/div[1]/div/input";
        private static String txtDuration = "//*[@id=\"duration\"]";
        private static String drpStatus = "//*[@id=\"status\"]/div/div/div";
        private static String drpStatusValue = "//*[@id=\"a51159ad-82ee-45af-9f21-7a360630604a\"]/ul/li";
        private static String btnAdd = "//*[text()=\"OK\"]";


    public static boolean isProjectPageDisplayed() {
       return MethodBase.isDisplayed_ByXpath(hrdProject);

    }
        public static void AddProject(String proId, String proName,String type,String startDate,String endDate,String duration,String status) {
        MethodBase.click_ByXpath(btnAddProject);
        MethodBase.setText_ByXpath(txtProjectId,proId);
        MethodBase.setText_ByXpath(txtProjectName,proName);
        MethodBase.selectAction(drpType,drpTypeValue);
        MethodBase.click_ByXpath(drpStartDate);
        implicitWait(4);
        MethodBase.setText_ByXpath(drpStartDateValue, startDate);
        MethodBase.click_ByXpath(drpEndDate);
        MethodBase.setText_ByXpath(drpEndDateValue,endDate);
        MethodBase.setText_ByXpath(txtDuration,duration);
        MethodBase.selectAction(drpStatus,drpStatusValue);
        MethodBase.click_ByXpath(btnAdd);

    }
}
