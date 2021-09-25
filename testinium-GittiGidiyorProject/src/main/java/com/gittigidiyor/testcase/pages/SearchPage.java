package com.gittigidiyor.testcase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public By randomSelectProductBy() {
        Random random = new Random();
        int rand = random.nextInt(48) + 1;
        return By.cssSelector(".products-container>li:nth-of-type(" + rand + ")");
    }

    public void secondPage(String pageNumber) {
        webDriver.get(webDriver.getCurrentUrl() + "&sf=" + pageNumber);
    }

    public ProductDetailsPage goToProductDetails(){
        click(randomSelectProductBy(),10);
        return new ProductDetailsPage(webDriver);
    }


}