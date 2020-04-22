package com.bitrix24.automation.pages;

import com.bitrix24.automation.utilities.BrowserUtils;
import com.bitrix24.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
    protected Actions actions;
    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,15);
    public PageBase() {
        PageFactory.initElements(driver, this);

    }
    public void navigateTo(String moduleName){

        WebElement module=driver.findElement(By.xpath("//../span[contains(@class,'menu-')][contains(text(),'"+moduleName+"')]"));
       BrowserUtils.wait(3);

        module.click();
    }
}
