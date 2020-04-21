//package com.bitrix24.automation.tests;
//
//import com.bitrix24.automation.pages.LoginPage;
//import com.bitrix24.automation.pages.more.workflows.WorkflowsPage;
//import org.testng.annotations.Test;
//
//
//public class WorkflowsTest extends TestBase{
//    LoginPage loginPage=new LoginPage();
//    WorkflowsPage workflowsPage =new WorkflowsPage();
//
//@Test
//    public void verifyLeaveApproval(){
//    loginPage.login();
//    workflowsPage.navigateTo("More");
//    workflowsPage.navigateTo("Workflows");
//    workflowsPage.clickWorkflowsInActivityStreamButton();
//    workflowsPage.navigateToWorkflowsInActivityStreamModules("Leave Approval");
//    workflowsPage.clickAddButton();
//    workflowsPage.enterStartDate();
//    workflowsPage.enterEndDate();
//    workflowsPage.enterAbsenceType();
//    workflowsPage.enterReasonForLeave();
//    workflowsPage.clickApplyButton();
//}
//@Test
//    public void verifyBusinessTrip(){
//    loginPage.login();
//    workflowsPage.navigateTo("More");
//    workflowsPage.navigateTo("Workflows");
//    workflowsPage.clickWorkflowsInActivityStreamButton();
//    workflowsPage.navigateToWorkflowsInActivityStreamModules("Business Trip");
//
//}
//}
