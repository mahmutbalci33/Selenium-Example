package com.gittigidiyor.testcase;

import com.gittigidiyor.testcase.Users.User;
import com.gittigidiyor.testcase.pages.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TestCase extends BaseTest {
    @Test
    public void gittiGidiyorTest() throws InterruptedException {
        String title = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
        String email = "mahmutbalci3398@gmail.com";
        String password = "Mahmut.123";

        HomePage homePage = new HomePage(webDriver);
        String webDriverTitle = homePage.getHomePageTitle();

        Log4j.info("Title: " + webDriverTitle);
        assertEquals(webDriverTitle, title);

        Log4j.info("Login Page");
        LoginPage loginPage = homePage.getLoginPage();
        Log4j.info("email: " + email + ", password: " + password);
        User user = new User(email, password);
        loginPage.login(user);
        Log4j.info(" Home Page");
        String accountButtonText = homePage.getAccountText();
        Log4j.info("Login işlemi kontrolü " + accountButtonText);
        assertTrue(accountButtonText.contains("Hesabım"));

        Log4j.info("'bilgisayar kelimesinin aranması'");
        SearchPage searchPage = homePage.search("bilgisayar");
        searchPage.scrollToPage("7200");
        Log4j.info("Arama sonuçlarından 2. sayfanın seçilmesi");
        searchPage.secondPage("2");
        assertTrue(webDriver.getCurrentUrl().contains("2"));

        Log4j.info("Ürün detay sayfasına gitme");
        ProductDetailsPage productDetailsPage = searchPage.goToProductDetails();

        Log4j.info("Ürün fiyat bilgisinin seçilmesi");
        String productPrice = productDetailsPage.productPrice();
        productDetailsPage.scrollToPage("1000");
        Log4j.info("Ürünün sepete eklenmesi");
        productDetailsPage.addToBasket();

        Log4j.info("Sepete gitme");
        BasketPage basketPage = productDetailsPage.goToBasket();
        Log4j.info("Ürünün sayfadaki ve sepetteki fiyatını karşılaştırma");
        assertEquals(productPrice, basketPage.cartPrice());

        Log4j.info("Ürünün sayısını 2 yapma");
        basketPage.setNumberOfProducts();
        Thread.sleep(2000);
        assertTrue(basketPage.getTotalProduct().contains("2 tane bilgisayar "));
        Log4j.info("Ürünü sepetten silme");
        basketPage.deleteProduct();
        Thread.sleep(2000);
        String basketMessage = "Sepetiniz şuanda boştur!";
        Log4j.info("Sepet içeriğinin kontrolü");
        assertEquals(basketMessage, basketPage.isEmpty());

    }

}
