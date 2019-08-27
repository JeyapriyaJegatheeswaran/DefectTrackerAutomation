package pages;

import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class HomePage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(HomePage.class));


    private static String defectMenu = "//*[@id=\"root\"]/div/section/aside/div/ul/li[8]/div[1]";
    private static String defectSubMenu = "//*[@id='sub3$Menu']";

    public static void clickDefectMenu() {
        MethodBase.click_ByXpath(defectMenu);

    }
    public static void clickDefectSubMenu() {
        MethodBase.click_ByXpath(defectSubMenu);

    }


//    public static void Login(String username, String password) {
//        MethodBase.setText_ByID(txtUserName,username);
//        MethodBase.setText_ByID(txtPassword,password);
//        MethodBase.clickButton_ById(btnLogin);
//    }
}
