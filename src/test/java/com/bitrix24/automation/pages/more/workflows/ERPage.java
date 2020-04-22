package com.bitrix24.automation.pages.more.workflows;

import com.bitrix24.automation.pages.PageBase;
import com.bitrix24.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ERPage extends PageBase {
    @FindBy(xpath="//../span[contains(@class,'main-')] [contains(text(),'Workflows')]")
    private WebElement workflowsInActivityStreamButton;
    @FindBy(xpath="//a//span[text()='Add']")
    private WebElement addButton;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_86')]")
    private WebElement startDate;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_87')]")
    private WebElement endDate;
    @FindBy(xpath="//select[contains(@name,'PROPERTY_88')]")
    private WebElement absenceType;
    @FindBy(xpath="//textarea[contains(@name,'PREVIEW_T')]")
    private WebElement reasonForLeave;
    @FindBy(xpath="//input[@name='apply']")
    private WebElement applyButton;
    public void navigateToWorkflowsInActivityStreamModules(String activityStreamModule){
        WebElement workflowsInActivityStreamModule=driver.findElement(By.xpath("//../span[contains(@class,'bp-bx')] //a[contains(text(),'"+activityStreamModule+"')]"));
        BrowserUtils.wait(3);
        workflowsInActivityStreamModule.click();
    }

    public void clickWorkflowsInActivityStreamButton(){
       workflowsInActivityStreamButton.click();
    }
    public void clickAddButton(){
        BrowserUtils.wait(2);
        addButton.click();
    }
    public void enterStartDate(){
        startDate.sendKeys("04/19/2020");
    }
    public void enterEndDate(){
        endDate.sendKeys("04/20/2020");
    }
    public void enterAbsenceType(){
Select selectAbsenceType=new Select(absenceType);
selectAbsenceType.selectByVisibleText("Sick leave");
    }
    public void enterReasonForLeave(){
        reasonForLeave.sendKeys("surgery");
    }
    public void clickApplyButton(){
        applyButton.click();
    }

}
