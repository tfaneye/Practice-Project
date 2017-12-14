package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tunde on 14/10/2016.
 */
public class HomePage extends BasePage {


    @FindBy(className = "ico-register")
    private WebElement openRegister = null;
    @FindBy(linkText = "Log in")
    private WebElement openLogin = null;
    @FindBy(id = "small-searchterms")
    private WebElement searchField = null;
    @FindBy(className = "search-box-button")
    private WebElement searchButton = null;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage goToRegisterPage(){
        openRegister.click();
        return PageFactory.initElements(driver, RegisterPage.class);

    }

    public LoginPage goToLoginPage(){
        openLogin.click();
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public SearchedItemPage searchForItem(String item){
        searchField.sendKeys(item);
        searchButton.click();
        return PageFactory.initElements(driver, SearchedItemPage.class);
    }


}
