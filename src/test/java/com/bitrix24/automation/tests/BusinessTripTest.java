package com.bitrix24.automation.tests;

import com.bitrix24.automation.pages.LoginPage;
import com.bitrix24.automation.pages.more.workflows.BusinessTripPage;
import com.bitrix24.automation.pages.more.workflows.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BusinessTripTest extends TestBase{
    LoginPage loginPage=new LoginPage();
    WorkflowsPage workflowsPage =new WorkflowsPage();
    BusinessTripPage bTPage=new BusinessTripPage();
@Test
    public void verifyLBusinessTrip(){
    loginPage.login();
    workflowsPage.navigateTo("More");
    workflowsPage.navigateTo("Workflows");
    workflowsPage.clickWorkflowsInActivityStreamButton();
    workflowsPage.navigateToWorkflowsInActivityStreamModules("Business Trip");
    bTPage.clickAddButton();
    bTPage.enterTitle();
    bTPage.enterStartDate();
    bTPage.enterPlannedEndDate();
    bTPage.enterPurpose();
    bTPage.enterPlannedExpenses();
    bTPage.enterCurrency();
    bTPage.clickApplyButton();
    Assert.assertEquals(bTPage.getNotifyPage().getText(),"Notify administrator");
}

}
