package com.bitrix24.automation.pages.more.workflows;

import com.bitrix24.automation.pages.PageBase;
import com.bitrix24.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BusinessTripPage extends PageBase {
    @FindBy(xpath="//a//span[text()='Add']")
    private WebElement addButton;
    @FindBy(xpath="//input[@name='NAME']")
    private WebElement title;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_70')]")
    private WebElement destination;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_71')]")
    private WebElement startDate;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_72')]")
    private WebElement plannedEndDate;
    @FindBy(xpath="//input[contains(@name,'PREVIEW_TEXT')]")
    private WebElement purpose;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_73')]")
    private WebElement plannedExpenses;
    @FindBy(xpath="//select[contains(@name,'PROPERTY_74')]")
    private WebElement currency;
    @FindBy(xpath="//input[contains(@name,'PROPERTY_78')]")
    private WebElement chooseFile;
    @FindBy(xpath="//input[@name='apply']")
    private WebElement applyButton;
    public void clickAddButton(){
        BrowserUtils.wait(2);
        addButton.click();
    }
    public void enterTitle(){
        title.sendKeys("mk");
    }
    public void enterDestination(){
        destination.sendKeys("Texas");
    }
    public void enterStartDate(){
        startDate.sendKeys("04/19/2020");
    }
    public void enterPlannedEndDate(){
        plannedEndDate.sendKeys("04/20/2020");
    }
    public void enterPurpose(){
        destination.sendKeys("meeting");
    }
    public void enterPlannedExpenses(){
        destination.sendKeys("100");
    }
    public void enterCurrency(){
Select selectcurrency=new Select(currency);
selectcurrency.selectByVisibleText("USD");
    }
    public void attachChooseFile(){

    }
    public void clickApplyButton(){
        applyButton.click();
    }
    @FindBy(xpath="//span[@class='popup-window-titlebar-text']")
    private  WebElement notifyPage;
    public WebElement getNotifyPage(){
        BrowserUtils.wait(3);
        return notifyPage;
    }

}
