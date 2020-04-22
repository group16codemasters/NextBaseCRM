package com.bitrix24.automation.pages.more.workflows;

import com.bitrix24.automation.pages.PageBase;
import com.bitrix24.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GeneralRequestPage extends PageBase {
    @FindBy(xpath="//a//span[text()='Add']")
    private WebElement addButton;
    @FindBy(xpath="//input[@name='NAME']")
    private WebElement title;
    @FindBy(xpath="//textarea[contains(@name,'PREVIEW_TEXT')]")
    private WebElement description;
    @FindBy(xpath="//select[contains(@name,'PROPERTY_84')]")
    private WebElement priorityLevel;
    @FindBy(xpath="//a[text()='Select']")
    private WebElement sendRequestTo;
    @FindBy(xpath="//span[contains(@id,'Single_')]//span[text()='Recent']")
    private WebElement recent;
    @FindBy(xpath="//input[@name='apply']")
    private WebElement applyButton;
    public void clickAddButton(){
        BrowserUtils.wait(2);
        addButton.click();
    }
    public void enterTitle(){
        title.sendKeys("general");
    }
    public void enterdesciption(){
      description.sendKeys("sos");
    }
    public void enterPriorityLevel(){
Select selectPriorityLevel=new Select(priorityLevel);
selectPriorityLevel.selectByVisibleText("Medium");
    }
    public void selectSendRequestTo(){
sendRequestTo.click();
recent.click();
requestBox.sendKeys("urgent");
    }
    public void clickApplyButton(){
        applyButton.click();
    }
    @FindBy(xpath="//table//tbody//tr//td//div[@class='finder-box-search']//input[contains(@name,'Single')]")
    private WebElement requestBox;
    @FindBy(xpath="//span[@class='popup-window-titlebar-text']")
    private  WebElement notifyPage;
    public WebElement getNotifyPage(){
        BrowserUtils.wait(3);
        return notifyPage;
    }

}
