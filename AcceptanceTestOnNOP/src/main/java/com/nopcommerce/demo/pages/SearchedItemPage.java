package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tunde on 16/10/2016.
 */
public class SearchedItemPage extends BasePage {

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    private WebElement fullItemName = null;


    public SearchedItemPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateSearchItem(String message){
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());

    }

    public FullItemPage goToFullItemPage(){
        fullItemName.click();

        return PageFactory.initElements(driver, FullItemPage.class);

    }
}
