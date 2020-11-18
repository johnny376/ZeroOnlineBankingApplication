package com.zeroBank.step_definitions;


import com.zeroBank.pages.AccountActivityPage;
import com.zeroBank.pages.AccountSummaryPage;
import com.zeroBank.pages.LandingPage;
import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityStepDefinition {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    Select select;


    @When("the user clicks on Saving link on the Account Summary page")
    public void the_user_clicks_on_saving_link_on_the_account_summary_page() {
        accountSummaryPage.savingsLink.click();
    }

    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        String expectedTab = "Account Activity";
        String actualTab = landingPage.accountActivityTab.getText();

        Assert.assertEquals("actual text is not as expected", expectedTab,actualTab);

    }
    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_savings_selected() {
        select = new Select(accountActivityPage.selectAccount);
        select.selectByVisibleText("Savings");

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());


    }


    @When("the user clicks on\tBrokerage link on the Account Summary page")
    public void the_user_clicks_on_brokerage_link_on_the_account_summary_page() {
        accountSummaryPage.brokerageLink.click();
    }


    @Then("Account	drop down should have Brokerage selected")
    public void account_drop_down_should_have_brokerage_selected() {
        select = new Select(accountActivityPage.selectAccount);
        BrowserUtils.wait(1);
        select.selectByVisibleText("Brokerage");

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }


    @When("the user clicks on	Checking link on the Account Summary	page")
    public void the_user_clicks_on_checking_link_on_the_account_summary_page() {
        accountSummaryPage.checkingLink.click();
    }


    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_checking_selected() {
        select = new Select(accountActivityPage.selectAccount);
        BrowserUtils.wait(1);
        select.selectByVisibleText("Checking");

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }



    @When("the user clicks on	Credit	card link on the Account Summary page")
    public void the_user_clicks_on_credit_card_link_on_the_account_summary_page() {
        accountSummaryPage.creditCardLink.click();
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_credit_card_selected() {
        select = new Select(accountActivityPage.selectAccount);
        BrowserUtils.wait(1);
        select.selectByVisibleText("Credit Card");

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }


    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_loan_link_on_the_account_summary_page() {
       accountSummaryPage.loanLink.click();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_loan_selected() {
        select = new Select(accountActivityPage.selectAccount);
        BrowserUtils.wait(1);

        select.selectByVisibleText("Loan");

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }






}
