package com.bitrix24.automation.tests;

import com.bitrix24.automation.utilities.BrowserUtils;
import com.bitrix24.automation.utilities.ConfigurationReader;
import com.bitrix24.automation.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriverWait wait;
    protected Actions actions;
    @BeforeMethod
    public void setup() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 15);
        actions = new Actions(Driver.getDriver());
    }
    @AfterMethod
    public void teardown()  {
        BrowserUtils.wait(5);
        Driver.closeDriver();
    }

}
