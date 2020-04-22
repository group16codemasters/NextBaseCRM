package com.bitrix24.automation.pages.more.workflows;

import com.bitrix24.automation.pages.PageBase;
import com.bitrix24.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkflowsPage extends PageBase {
    @FindBy(xpath="//../span[contains(@class,'main-')] [contains(text(),'Workflows')]")
    private WebElement workflowsInActivityStreamButton;
    public void navigateToWorkflowsInActivityStreamModules(String activityStreamModule){
        WebElement workflowsInActivityStreamModule=driver.findElement(By.xpath("//../span[contains(@class,'bp-bx')] //a[contains(text(),'"+activityStreamModule+"')]"));
        BrowserUtils.wait(3);
        workflowsInActivityStreamModule.click();
    }

    public void clickWorkflowsInActivityStreamButton(){
       workflowsInActivityStreamButton.click();
    }

}
