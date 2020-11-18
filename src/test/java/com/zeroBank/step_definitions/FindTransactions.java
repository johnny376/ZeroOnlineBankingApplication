package com.zeroBank.step_definitions;

import com.zeroBank.pages.AccountActivityPage;
import com.zeroBank.pages.FindTransactionsPage;
import com.zeroBank.pages.LandingPage;
import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.*;

public class FindTransactions {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }

    @Given("I am on the Account Activity page")
    public void i_am_on_the_account_activity_page() {
        landingPage.accountActivityTab.click();
    }


    @When("the user enters date range	from {string} to {string}")
    public void the_user_enters_date_range_from_to(String datesFrom, String datesTo) {
        accountActivityPage.findTransactionTab.click();
        findTransactionsPage.datesFromInput.sendKeys(datesFrom);
        BrowserUtils.wait(1);
        findTransactionsPage.datesToInput.sendKeys(datesTo);

    }

    @Then("results table should only show	transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String datesFrom, String datesTo) {

    }

    @Then("the	results	should	be	sorted	by	most recent	date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show	transactions dates between \"{int}-{int}-{int}\"	to \"{int}-{int}-{int}\"")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the	results	table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show	descriptions containing	\"ONLINE\"")
    public void results_table_should_only_show_descriptions_containing_online() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show	descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results	table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show at least	one	result under Deposit")
    public void results_table_should_show_at_least_one_result_under_deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show at least	one	result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_withdrawal1() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results	table should show no result	under Deposit")
    public void results_table_should_show_no_result_under_deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
