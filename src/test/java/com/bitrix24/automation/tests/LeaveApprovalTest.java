package com.bitrix24.automation.tests;

import com.bitrix24.automation.pages.LoginPage;
import com.bitrix24.automation.pages.more.workflows.LeaveApprovalPage;
import com.bitrix24.automation.pages.more.workflows.WorkflowsPage;
import com.bitrix24.automation.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LeaveApprovalTest extends TestBase{
    LoginPage loginPage=new LoginPage();
    WorkflowsPage workflowsPage =new WorkflowsPage();
    LeaveApprovalPage laPage=new LeaveApprovalPage();
@Test
public void verifyLeaveApproval(){
    loginPage.login();
    workflowsPage.navigateTo("More");
    workflowsPage.navigateTo("Workflows");
    workflowsPage.clickWorkflowsInActivityStreamButton();
    workflowsPage.navigateToWorkflowsInActivityStreamModules("Leave Approval");
    laPage.clickAddButton();
    laPage.enterStartDate();
    laPage.enterEndDate();
    laPage.enterAbsenceType();
    laPage.enterReasonForLeave();
    laPage.clickApplyButton();
    BrowserUtils.wait(3);
    Assert.assertEquals(laPage.getNotifyPage().getText(),"Notify administrator");
}



}
