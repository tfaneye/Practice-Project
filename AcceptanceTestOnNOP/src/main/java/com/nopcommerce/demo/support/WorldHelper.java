package com.nopcommerce.demo.support;

import com.nopcommerce.demo.pages.BasePage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.test_browsers.SharedBrowsers;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tunde on 14/10/2016.
 */
public class WorldHelper extends SharedBrowsers {

    private BasePage basePage;
    private HomePage homePage;

    public BasePage getBasePage(){
        if(basePage == null){
            basePage = PageFactory.initElements(driver, BasePage.class);
        }
        return basePage;
    }

    public HomePage getHomePage(){
        if(homePage == null){
            homePage = PageFactory.initElements(driver, HomePage.class);
        }
        return homePage;
    }
}
