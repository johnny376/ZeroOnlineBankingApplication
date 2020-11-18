package com.zeroBank.step_definitions;

import com.zeroBank.pages.AccountSummaryPage;
import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    LoginPage loginPage = new LoginPage();

    @Given("user in account summary page")
    public void user_in_account_summary_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }


    @Then("account summary page tittle should be {string}")
    public void account_summary_page_tittle_should_be(String string) {
        BrowserUtils.wait(1);
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = Driver.getDriver().getTitle().trim();

        Assert.assertEquals("different, verification failed!",expectedTitle,actualTitle);
    }
    @Then("account summary page should have {string}")
    public void account_summary_page_should_have(String string) {
        accountSummaryPage.accountDisplayed();
    }
    @Then("in Credit Accounts' table should have {string}")
    public void in_credit_accounts_table_should_have(String string) {
       accountSummaryPage.columnsDisplayed();
    }
}
