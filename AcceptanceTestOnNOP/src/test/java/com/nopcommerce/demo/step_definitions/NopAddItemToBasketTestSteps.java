package com.nopcommerce.demo.step_definitions;

import com.nopcommerce.demo.pages.FullItemPage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.support.WorldHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by Tunde on 17/10/2016.
 */
public class NopAddItemToBasketTestSteps {

    private final WorldHelper helper;
    private FullItemPage fullItemPage;
    private ShoppingCartPage shoppingCartPage;

    public NopAddItemToBasketTestSteps(WorldHelper helper){
        this.helper = helper;
    }


    @Given("^I have searched for an item:$")
    public void iHaveSearchedForAnItem(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<List<String>> productInfo = table.raw();
        String searchedItem = productInfo.get(1).get(0);
      //  String itemPrice = productInfo.get(1).get(1);

        fullItemPage = helper
                .getBasePage()
                .loadDefaultPage()
                .searchForItem(searchedItem)
                .goToFullItemPage();

    }

    @When("^I add an \"([^\"]*)\" item to the shopping basket$")
    public void iAddAnItemToTheShoppingBasket(String searchedItem) throws Throwable {

        shoppingCartPage = fullItemPage
                .addItemToCart(searchedItem)
                .viewSoppingBasket();
    }

    @Then("^I should see \"([^\"]*)\" message displays$")
    public void iShouldSeeMessageDisplays(String message) throws Throwable {
        Assert.assertTrue(shoppingCartPage.validateShopping(message));
    }
}
