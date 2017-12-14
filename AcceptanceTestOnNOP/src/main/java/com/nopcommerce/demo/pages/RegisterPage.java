package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Tunde on 16/10/2016.
 */
public class RegisterPage extends BasePage {
    @FindBy(id = "gender-male")
    private WebElement genderButton = null;
    @FindBy(id = "FirstName")
    private WebElement firstNameField = null;
    @FindBy(id = "LastName")
    private WebElement lastNameField = null;

    @FindBy(name = "DateOfBirthDay")
    private WebElement dateOfBirthDay = null;
    @FindBy(name = "DateOfBirthMonth")
    private WebElement dateOfBirthMonth = null;
    @FindBy(name = "DateOfBirthYear")
    private WebElement dateOfBirthYear = null;


    @FindBy(id = "Email")
    private WebElement emailField = null;
    @FindBy(id = "Company")
    private WebElement companyNameField = null;
    @FindBy(id = "Password")
    private WebElement passwordField = null;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordField = null;
    @FindBy(id = "register-button")
    private WebElement registerButton = null;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public MyNopPage registerWith(String firstName, String lastName, String dayOfBirth, String monthOfBirth, String yearOfBirth,
                                  String email, String companyName, String password, String confirmPassword){
        genderButton.click();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);

        Select selectDay = new Select(dateOfBirthDay);
        selectDay.selectByVisibleText(dayOfBirth);
        Select selectMonth = new Select(dateOfBirthMonth);
        selectMonth.selectByVisibleText(monthOfBirth);
        Select selectYear = new Select(dateOfBirthYear);
        selectYear.selectByVisibleText(yearOfBirth);

        emailField.sendKeys(email);
        companyNameField.sendKeys(companyName);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);
        registerButton.click();

        return PageFactory.initElements(driver, MyNopPage.class);

    }


}
