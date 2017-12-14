package com.nopcommerce.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tunde on 17/10/2016.
 */
public class FullItemPage extends BasePage {

    @FindBy(id = "addtocart_4_EnteredQuantity")
    private WebElement itemQuantity = null;
    @FindBy(id = "add-to-cart-button-4")
    private WebElement addToCartButton = null;
    @FindBy(linkText = "Shopping cart")
    private WebElement shoppingBasket = null;


    public FullItemPage(WebDriver driver) {
        super(driver);
    }

    public FullItemPage addItemToCart(String searchedItem){
    //    itemQuantity.clear();
    //    itemQuantity.sendKeys("1");

        addToCartButton.click();

        return PageFactory.initElements(driver, FullItemPage.class);
    }

    public ShoppingCartPage viewSoppingBasket(){
        shoppingBasket.click();

        return PageFactory.initElements(driver, ShoppingCartPage.class);

    }
}
