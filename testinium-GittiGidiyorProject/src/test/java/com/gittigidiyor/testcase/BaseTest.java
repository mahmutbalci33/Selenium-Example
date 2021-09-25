package com.gittigidiyor.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Mahmut\\Desktop\\testiniumProject\\src\\main\\resources\\chromedriver.exe");

        String baseUrl ="https://www.gittigidiyor.com/";
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log4j.info("Test is starting...");
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        Log4j.info("Opening Page " + baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
        Log4j.info("Test is ending.");
    }
}
