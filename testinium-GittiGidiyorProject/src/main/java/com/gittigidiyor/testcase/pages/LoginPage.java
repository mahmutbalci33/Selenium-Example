package com.gittigidiyor.testcase.pages;

import com.gittigidiyor.testcase.Users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By username = By.id("L-UserNameField");
    By password = By.id("L-PasswordField");
    By loginButtonLP = By.id("gg-login-enter");
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(User user) {
        sendKeys(username, user.getEmail());
        sendKeys(password, user.getPassword());
        click(loginButtonLP, 5);

        HomePage homePage = new HomePage(webDriver);
        homePage.waitForLoad();
        return homePage;
    }

}
