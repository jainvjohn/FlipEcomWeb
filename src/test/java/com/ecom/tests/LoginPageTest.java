package com.ecom.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
       driver.get("https://www.flipkart.com/");
    }
    @Test
    public void getTitleTest()
    {
        String loginPageTitle=driver.getTitle();
        assert loginPageTitle != null;
        boolean flag=loginPageTitle.contains("Online Shopping");
        Assert.assertTrue(flag);
    }

//    @Test
//    public void getURL()
//    {
//        String loginPageTitle=driver.getTitle();
//        assert loginPageTitle != null;
//        boolean flag=loginPageTitle.contains("Online Shopping");
//        Assert.assertTrue(flag);
}
