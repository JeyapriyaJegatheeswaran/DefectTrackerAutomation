package pages;

import utils.MethodBase;

public class PriorityPage {

    private static String btnAddPriorityVerify = "//span[text()=\"Add priority\"]";
    private static String btnAddPriority = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";
    private static String priorityName = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String priorityDescription = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String icon1 = "//div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    private static String color = "";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    public static void isPriorityPageDisplay() {
        MethodBase.isDisplayed_ByXpath(btnAddPriorityVerify);
    }
    public static void clickAddPrioritybtn(){
        MethodBase.clickButton_ByXpath(btnAddPriority);
    }
    public static void clearPeriorityName(){
        MethodBase.clear_ByXpath(priorityName);
    }
    public static void setPeriorityName(String periorityname){
        MethodBase.setText_ByXpath(priorityName,periorityname);
    }
    public static void clearPeriorityDescription(){
        MethodBase.clear_ByXpath(priorityDescription);
    }
    public static void setPeriorityDescription(String perioritydescription){
        MethodBase.setText_ByXpath(priorityDescription,perioritydescription);
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
