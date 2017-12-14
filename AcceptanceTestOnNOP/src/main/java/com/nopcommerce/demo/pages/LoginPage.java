package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tunde on 14/10/2016.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "Email")
    private WebElement usernameField = null;
    @FindBy(id = "Password")
    private WebElement passwordField = null;
    @FindBy(className = "login-button")
    private WebElement loginButton = null;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MyNopPage loginWith(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        return PageFactory.initElements(driver, MyNopPage.class);
    }
}
