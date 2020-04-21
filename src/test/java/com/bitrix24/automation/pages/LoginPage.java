package com.bitrix24.automation.pages;

import com.bitrix24.automation.utilities.BrowserUtils;
import com.bitrix24.automation.utilities.ConfigurationReader;
import com.bitrix24.automation.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath="//input[@name='USER_LOGIN']")
    private WebElement username;
    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    private WebElement password;
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
        BrowserUtils.wait(3);
    }
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("hr55"));
        password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);
        BrowserUtils.wait(3);
    }

}
