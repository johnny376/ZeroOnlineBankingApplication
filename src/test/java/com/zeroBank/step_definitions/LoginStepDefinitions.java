package com.zeroBank.step_definitions;

import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.SplittableRandom;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user in login page")
    public void user_in_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }



    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        loginPage.login();
        BrowserUtils.wait(2);
    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        String expectedTitle = "Zero - Account Summary";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actual);
        Driver.closeDriver();
    }



   @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        loginPage.login(string,string2);
    }

    @When("user tries to login with invalid information")
    public void user_tries_to_login_with_invalid_information() {
        loginPage.login("something", "wrong");
    }
    @When("user with blank username or password")
    public void user_with_blank_username_or_password() {
        loginPage.login("", "");
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String string) {
        String expectedMessage = "Login and/or password are wrong.";
        String actualMessage = loginPage.getAlertMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
        Driver.closeDriver();
    }

}
