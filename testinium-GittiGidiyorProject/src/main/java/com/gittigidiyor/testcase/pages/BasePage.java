package com.gittigidiyor.testcase.pages;

import com.gittigidiyor.testcase.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper {
    By accountButton = By.cssSelector("div[data-cy='header-user-menu']");
    By loginButton = By.cssSelector("a[data-cy='header-login-button']");
    By searchBoxButton = By.className("sc-4995aq-0");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage getLoginPage(){
        moveToElement(accountButton);
        click(loginButton, 10);
        return new LoginPage(webDriver);
    }
    public String getAccountText(){
        return getText(accountButton);
    }

    public SearchPage search(String keyword) {
        webDriver.findElement(searchBoxButton).sendKeys(keyword + Keys.ENTER);
        return new SearchPage(webDriver);
    }


}
