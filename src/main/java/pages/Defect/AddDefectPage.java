package pages.Defect;
/**
 * @author:jeyapriya
 */

import utils.MethodBase;
import utils.PageBase;

import java.util.logging.Logger;

public class AddDefectPage extends PageBase {

////*[@id="root"]/div/section/section/main/div[2]/div/div[2]/div/div/div/div/div/table/tbody/tr[td[3][. = 'Login']]/td[5]
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AddDefectPage.class));

    private static String txtAddDefectFormTitle = "//div[@id='rcDialogTitle0']";


    private static String txtDefectID = "defectId";
    private static String txtProject = "//div[@id='gender1']";
    private static String txtModule = "//div[@id='gender4']";
    private static String txtDescription = "defectDescription";
    private static String txtSteps = "stepsToRecreate";
    private static String txtEnteredBy = "//div[@id='enteredBy']";
    private static String txtFoundIn = "//div[@id='foundIn']";
    private static String txtAssignTo = "//div[@id='assignTo']";
    private static String txtType = "//div[@id='gender6']";
    private static String txtSeverity = "//div[@id='gender2']";
    private static String txtPriority = "//div[@id='gender3']";
    private static String txtStatus = "//div[@id='gender7']";
    private static String txtCommonOption = "//li[text()=\"Option\"]";
    private static String btnAdd = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[2]";
    private static String btnCancel = "/html/body/div[7]/div/div[2]/div/div[2]/div[3]/div/button[1]";
    private static String commonValidMsgStatus = "//div[text()='LINK!']";
    private static String btnDelete="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'jp1234']]/td[7]/span/a/i";
    private static String btnDeleteOk="/html/body/div/div/div/div/div[2]/div/div/div[2]/button[2]";
    private static String btnEdit="//*[@id=\"root\"]/div/section/section/main/div[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[td[1][. = 'DEF001']]/td[7]/span/i";


    public static boolean isAddDefectFormDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtAddDefectFormTitle);
    }
    public static boolean isDefectIdFieldDisplayed(){
        return MethodBase.isDisplayed_ById(txtDefectID);
    }
    public static boolean isProjectFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtProject);
    }
    public static boolean isModuleFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtModule);
    }
    public static boolean isDescriptionFieldDisplayed(){
        return MethodBase.isDisplayed_ById(txtDescription);
    }
    public static boolean isStepsFieldDisplayed(){
        return MethodBase.isDisplayed_ById(txtSteps);
    }
    public static boolean isEnteredByFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtEnteredBy);
    }
    public static boolean isFoundInFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtFoundIn);
    }
    public static boolean isAssigneeToFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtAssignTo);
    }
    public static boolean isTypeFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtType);
    }
    public static boolean isSeverityFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtSeverity);
    }
    public static boolean isPriorityFieldDisplayed(){
        return MethodBase.isDisplayed_ByXpath(txtPriority);
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



    public static void clickEditButton(){

        MethodBase.clickButton_ByXpath(btnEdit);
    }
    public static void setDefectId( String id){
        MethodBase.setText_ByID(txtDefectID,id);
    }
    public static void setDescription( String description){
        MethodBase.setText_ByID(txtDescription,description);
    }
    public static void setSteps( String steps){
        MethodBase.setText_ByID(txtSteps,steps);
    }

    public static void setProject( String option){
        MethodBase.selectAction(txtProject,txtCommonOption.replace("Option", option));
    }
    public static void setModule( String option){

        MethodBase.selectAction(txtModule,txtCommonOption.replace("Option", option));
    }

    public static void setEnteredBy(String option){
        MethodBase.selectAction(txtEnteredBy,txtCommonOption.replace("Option", option));
    }
    public static void setFoundIn(String option){
        MethodBase.selectAction(txtFoundIn,txtCommonOption.replace("Option", option));
    }
    public static void setAssignTo(String option){
        MethodBase.selectAction(txtAssignTo,txtCommonOption.replace("Option", option));
    }
    public static void setDefectType(String option){
        MethodBase.selectAction(txtType,txtCommonOption.replace("Option", option));
    }
    public static void setSeverity(String option){
        MethodBase.selectAction(txtSeverity,txtCommonOption.replace("Option", option));
    }
    public static void setPriority(String option){
        MethodBase.selectAction(txtPriority,txtCommonOption.replace("Option", option));
    }public static void setStatus(String option){
        MethodBase.selectAction(txtStatus,txtCommonOption.replace("Option", option));
    }
    public static void clickAddButton(){
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefect(String defectId,String project,String module,String description,
                                    String steps,String enteredBy,String foundIn,String assignTo,
                                    String type,String severity,String priority,String status){
          AddDefectPage.setDefectId(defectId);
          AddDefectPage.setProject(project);
          AddDefectPage.setModule(module);
          AddDefectPage.setDescription(description);
          AddDefectPage.setSteps(steps);
          AddDefectPage.setEnteredBy(enteredBy);
          AddDefectPage.setFoundIn(foundIn);
          AddDefectPage.setAssignTo(assignTo);
          staticWait(3);
          AddDefectPage.setDefectType(type);
          AddDefectPage.setSeverity(severity);
          staticWait(2);
          AddDefectPage.setPriority(priority);

          AddDefectPage.setStatus(status);
          MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutData(){

        MethodBase.clickButton_ByXpath(btnAdd);
    }

    public static void createDefectWithoutID(String project,String module,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String priority,String status){
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutProject(String defectId,String module,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        //AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutModule(String defectId,String project,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutDescription(String defectId,String project,String module,String steps,
                                             String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutSteps(String defectId,String project,String module,String description,
                                             String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutType(String defectId,String project,String module,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String severity,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutSeverity(String defectId,String project,String module,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String type,String priority,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        staticWait(2);
        AddDefectPage.setPriority(priority);

        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutPriority(String defectId,String project,String module,String description,
                                             String steps,String enteredBy,String foundIn,String assignTo,
                                             String type,String severity,String status){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setStatus(status);
        MethodBase.clickButton_ByXpath(btnAdd);
    }
    public static void createDefectWithoutStatus(String defectId,String project,String module,String description,
                                                   String steps,String enteredBy,String foundIn,String assignTo,
                                                   String type,String severity,String priority){
        AddDefectPage.setDefectId(defectId);
        AddDefectPage.setProject(project);
        AddDefectPage.setModule(module);
        AddDefectPage.setDescription(description);
        AddDefectPage.setSteps(steps);
        AddDefectPage.setEnteredBy(enteredBy);
        AddDefectPage.setFoundIn(foundIn);
        AddDefectPage.setAssignTo(assignTo);
        staticWait(3);
        AddDefectPage.setDefectType(type);
        AddDefectPage.setSeverity(severity);
        staticWait(2);
        AddDefectPage.setPriority(priority);
        MethodBase.clickButton_ByXpath(btnAdd);
    }


    public static String CheckValidMsg(String link){

        return MethodBase.get_Text(commonValidMsgStatus.replace("LINK", link));
    }

    public static void deleteDefect(){
        MethodBase.clickButton_ByXpath(btnDelete);
        staticWait(3);
        MethodBase.clickButton_ByXpath(btnDeleteOk);
    }
    public static void clickCancelButton(){

        MethodBase.clickButton_ByXpath(btnCancel);
    }

}
