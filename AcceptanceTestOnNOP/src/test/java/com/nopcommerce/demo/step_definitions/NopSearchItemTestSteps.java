package com.nopcommerce.demo.step_definitions;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.SearchedItemPage;
import com.nopcommerce.demo.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Tunde on 16/10/2016.
 */
public class NopSearchItemTestSteps {

    private final WorldHelper helper;
    private HomePage homePage;
    private SearchedItemPage searchedItemPage;

    public NopSearchItemTestSteps(WorldHelper helper){
        this.helper = helper;
    }


    @When("^I search for an \"([^\"]*)\"$")
    public void iSearchForAn(String item) throws Throwable {
        searchedItemPage = helper
                .getHomePage()
                .searchForItem(item);
    }

    @Then("^I should see the following: \"([^\"]*)\" & \"([^\"]*)\"$")
    public void iShouldSeeTheFollowing(String itemDescription, String itemPrice) throws Throwable {
        Assert.assertTrue("There is no such item: " + itemDescription, searchedItemPage.validateSearchItem(itemDescription));
        Assert.assertTrue("There is no such item: " + itemPrice, searchedItemPage.validateSearchItem(itemPrice));

    }
}
