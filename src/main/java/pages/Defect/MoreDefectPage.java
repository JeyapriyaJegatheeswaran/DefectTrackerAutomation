package pages.Defect;


import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class MoreDefectPage extends PageBase {

////*[@id="root"]/div/section/section/main/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[td[3][. = 'Login']]/td[5]
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(MoreDefectPage.class));

    private static String txtMoreDefectDetailsPageTitle = "//div[@id=\"rcDialogTitle0\"]";
    private static String txtDescription = "/html/body/div[13]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/p[3]";
    private static String txtSteps = "/html/body/div[13]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/p[4]";
    private static String txtTYpe = "/html/body/div[13]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/p[7]";



    public static boolean isMoreDefectDetailsPageDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtMoreDefectDetailsPageTitle);
    }

    public static String getDescription(){
            return MethodBase.get_Text(txtDescription);
    }
    public static String getsteps(){
        return MethodBase.get_Text(txtSteps);
    }
    public static String getType(){
        return MethodBase.get_Text(txtTYpe);
    }
}
