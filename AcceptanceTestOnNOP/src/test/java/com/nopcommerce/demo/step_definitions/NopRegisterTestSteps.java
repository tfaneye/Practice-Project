package com.nopcommerce.demo.step_definitions;

import com.nopcommerce.demo.pages.MyNopPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.support.WorldHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Tunde on 16/10/2016.
 */
public class NopRegisterTestSteps {

    private final WorldHelper helper;
    private RegisterPage registerPage;
    private MyNopPage myNopPage;

    public NopRegisterTestSteps(WorldHelper helper){
        this.helper = helper;
    }


    @When("^I register with the following personal details: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", & \"([^\"]*)\"$")
    public void iRegisterWithTheFollowingPersonalDetails(String firstName, String lastName, String dayOfBirth,
                                                         String monthOfBirth, String yearOfBirth, String email, String companyName,
                                                         String password, String confirmPassword) throws Throwable {
        myNopPage = helper
                .getHomePage()
                .goToRegisterPage()
                .registerWith(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth, email, companyName, password, confirmPassword);
    }

    @Then("^I should see the \"([^\"]*)\" displayed in the register page$")
    public void i_should_see_the_displayed_in_the_register_page(String message) throws Throwable {
        Assert.assertTrue("The page does not contain " + message, myNopPage.validateRegister(message));
    }

}
