package com.nopcommerce.demo.step_definitions;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.MyNopPage;
import com.nopcommerce.demo.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by Tunde on 21/07/2016.
 */
public class NopLoginTestSteps {

    private final WorldHelper helper;
    private MyNopPage myNopPage;
    private HomePage homePage;


    public NopLoginTestSteps(WorldHelper helper){
        this.helper = helper;
    }

    @Given("^I am on the home page of the application$")
    public void iAmOnTheHomePageOfTheApplication() throws Throwable {
        homePage = helper
                .getBasePage()
                .loadDefaultPage();
    }

    @When("^I logon with valid username \"([^\"]*)\" and valid password \"([^\"]*)\"$")
    public void iLogonWithValidUsernameAndValidPassword(String username, String password) throws Throwable {
        myNopPage =  homePage
                .goToLoginPage()
                .loginWith(username, password);
    }

    @Then("^I should see my email address \"([^\"]*)\" displayed$")
    public void iShouldSeeMyEmailAddressDisplayed(String message) throws Throwable {
        Assert.assertTrue("The page does not contain the email address: " +message, myNopPage.validateLogin(message));
    }

}
