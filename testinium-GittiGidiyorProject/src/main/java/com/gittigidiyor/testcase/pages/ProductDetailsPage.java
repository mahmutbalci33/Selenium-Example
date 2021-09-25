package com.gittigidiyor.testcase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage{
    private By lowPrice = By.id("sp-price-lowPrice");
    private By highPrice = By.id("sp-price-highPrice");
    private By addToCart = By.id("add-to-basket");
    private By goToBasket = By.className("robot-header-iconContainer-cart");
    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }


    public String productPrice(){
        String productPrice = webDriver.findElement(lowPrice).getText();
        if (productPrice.isEmpty()) {
            return getText(highPrice);
        }
        return getText(lowPrice);
    }

    public void addToBasket(){
        click(addToCart,30);
    }
    public BasketPage goToBasket(){
        click(goToBasket,10);
        return new BasketPage(webDriver);
    }
}
