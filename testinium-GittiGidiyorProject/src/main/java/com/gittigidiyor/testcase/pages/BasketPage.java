package com.gittigidiyor.testcase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    private By basketPrice = By.className("total-price");
    private By countProduct = By.cssSelector("option[value='2']");
    private By baskettotalproduct = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-of-type(1)");
    private By deleteProduct = By.cssSelector("a[title='Sil']");
    private By emptyBasket = By.cssSelector(".gg-w-22.gg-d-22.gg-t-21.gg-m-18>:nth-child(1)");

    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String cartPrice(){
       return webDriver.findElement(basketPrice).getText();
    }

    public void setNumberOfProducts(){
        click(countProduct,10);
    }

    public String getTotalProduct(){
        return webDriver.findElement(baskettotalproduct).getText();
    }

    public void deleteProduct(){
        click(deleteProduct,10);
    }

    public String isEmpty(){
        return webDriver.findElement(emptyBasket).getText();
    }
}
