package pages;

import utils.MethodBase;

public class SeverityPage {

    private static String btnAddSeverityVerify = "//span[text()=\"Add severity\"]";
    private static String btnAddSeverity = "//*[@id=\"root\"]/div/section/section/main/div/div[2]/button";

    private static String severityName = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String severityDescription = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String icon1 = " //div[text()=\"Select an option\"]";
    private static String icon2 = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[3]";
    private static String clickColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColor = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[8]/span";
    private static String okBtn = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static String editBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='Hight']]/td[6]/span/i[1]";
    private static String severityNameEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[1]/div[2]/div/span/input";
    private static String severityDescriptionEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[2]/div[2]/div/span/input";
    private static String icon1Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[1]/div[1]";
    private static String icon2Edited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[3]/div[2]/div/span/div/div[2]/div[1]";
    private static String clickColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div";
    private static String selectColorEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div[4]/div[2]/div/span/div[2]/div[2]/div[4]/div[8]/span";
    private static String okBtnEdited = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]";

    private static String deleteBtn = "//*[@id=\"root\"]/div/section/section/main/div/div[3]/div/div/div/div/div/table/tbody/tr[td[2][.='gjh']]/td[6]/span/i[2]";
    private static String deleteOKbtn = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/button[2]";

    //Add Severity
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
        MethodBase.setText_ByXpath(severityDescription,severitydescription); }
    public static void setIcon(){
        MethodBase.selectAction(icon1,icon2);
    }
    public static void clickColor(){MethodBase.click_ByXpath(clickColor);}
    public static void selectColor(){MethodBase.click_ByXpath(selectColor);}
    public static void clickAddOKbtn(){
        MethodBase.clickButton_ByXpath(okBtn);
    }

    //Edit Severity
    public static void clickEditbtn(){
        MethodBase.clickButton_ByXpath(editBtn);
    }
    public static void clearSeverityNameEdited(){
        MethodBase.clear_ByXpath(severityNameEdited);
    }
    public static void setSeverityNameEdited(String severityname){
        MethodBase.setText_ByXpath(severityNameEdited,severityname); }
    public static void clearSeverityDescriptionEdited(){
        MethodBase.clear_ByXpath(severityDescriptionEdited);
    }
    public static void setSeverityDescriptionEdited(String severitydescription){
        MethodBase.setText_ByXpath(severityDescriptionEdited,severitydescription); }
    public static void setIconEdited(){
        MethodBase.selectAction(icon1Edited,icon2Edited); }
    public static void clickColorEdited(){MethodBase.click_ByXpath(clickColorEdited);}
    public static void selectColorEdited(){MethodBase.click_ByXpath(selectColorEdited);}
    public static void clickEditOKbtn(){
        MethodBase.clickButton_ByXpath(okBtnEdited);
    }

    //Delete Severity
    public static void clickDeletebtn(){
        MethodBase.clickButton_ByXpath(deleteBtn);
    }
    public static void clickDeleteOKbtn(){
        MethodBase.clickButton_ByXpath(deleteOKbtn);
    }

}
