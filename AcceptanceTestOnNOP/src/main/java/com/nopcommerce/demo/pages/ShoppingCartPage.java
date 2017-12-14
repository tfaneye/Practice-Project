package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Tunde on 17/10/2016.
 */
public class ShoppingCartPage extends BasePage {


    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateShopping(String message){
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }
}
