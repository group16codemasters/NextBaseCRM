package com.bitrix24.automation.tests;

import com.bitrix24.automation.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
    @Test
    public void demo1() throws InterruptedException {
        System.out.println("asdasd");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(100);

        Driver.getDriver().get("https://google.com");
    }

}
