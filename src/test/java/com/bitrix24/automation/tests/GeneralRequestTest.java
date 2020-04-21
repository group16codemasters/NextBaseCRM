package com.bitrix24.automation.tests;

import com.bitrix24.automation.pages.LoginPage;
import com.bitrix24.automation.pages.more.workflows.GeneralRequestPage;
import com.bitrix24.automation.pages.more.workflows.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GeneralRequestTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    WorkflowsPage workflowsPage = new WorkflowsPage();
    GeneralRequestPage grPage = new GeneralRequestPage();

    @Test
    public void verifyGeneralRequest() {
        loginPage.login();
        workflowsPage.navigateTo("More");
        workflowsPage.navigateTo("Workflows");
        workflowsPage.clickWorkflowsInActivityStreamButton();
        workflowsPage.navigateToWorkflowsInActivityStreamModules("General Request");
        grPage.clickAddButton();
        grPage.enterTitle();
        grPage.enterdesciption();
        grPage.enterPriorityLevel();
        grPage.selectSendRequestTo();
        grPage.clickApplyButton();
        Assert.assertEquals(grPage.getNotifyPage().getText(),"Notify administrator");
    }
}