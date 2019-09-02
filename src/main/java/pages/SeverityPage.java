package pages;

import utils.MethodBase;

public class SeverityPage {

    private static String btnAddSeverityVerify = " //span[text()=\"Add severity\"]";
    private static String btnAddSeverity = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String severityName = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String severityDescription = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String icon1 = " //div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    //private static String color = "";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    public static void isSeverityPageDisplay() {
        MethodBase.isDisplayed_ByXpath(btnAddSeverityVerify);
    }
    public static void clickAddSeveritybtn(){
        MethodBase.clickButton_ByXpath(btnAddSeverity);
    }
    public static void clearSeverityName(){
        MethodBase.clear_ByXpath(severityName);
    }
    public static void setSeverityName(String severityname){
        MethodBase.setText_ByXpath(severityName,severityname);
    }
    public static void clearSeverityDescription(){
        MethodBase.clear_ByXpath(severityDescription);
    }
    public static void setSeverityDescription(String severitydescription){
        MethodBase.setText_ByXpath(severityDescription,severitydescription);
    }
    public static void setIcon(){
        MethodBase.selectAction(icon1,icon2);
    }
    //    public static void clickColor(){
//        MethodBase.click_ByXpath(color);
//    }
    public static void clickAddbtn(){
        MethodBase.clickButton_ByXpath(okBtn);
    }


}
