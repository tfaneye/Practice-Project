package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Tunde on 14/10/2016.
 */
public class MyNopPage extends BasePage {


    private boolean res;
    private boolean result;

    public MyNopPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateLogin(String message){
        result = driver.getPageSource().toLowerCase().contains(message.toLowerCase());
        return result;
    }

    public boolean validateRegister(String message){
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }
}
