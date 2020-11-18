package com.zeroBank.step_definitions;

import com.zeroBank.pages.LandingPage;
import com.zeroBank.pages.PayBillsPage;
import com.zeroBank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class PayeeStepDefinition {

    LandingPage landingPage = new LandingPage();
    PayBillsPage payBillsPage = new PayBillsPage();


    @Given("I am on the Pay Bills page")
    public void i_am_on_the_pay_bills_page() {
        landingPage.payBillsTab.click();
    }


    @Given("the user accesses the Add New Payee tab")
    public void the_user_accesses_the_add_new_payee_tab() {
        payBillsPage.addNewPayeeTab.click();
    }
    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        payBillsPage.payeeName.sendKeys(table.get("Payee Name"));
        payBillsPage.payeeAddress.sendKeys(table.get("Payee Address"));
        payBillsPage.payeeAccount.sendKeys(table.get("Account"));
        payBillsPage.payeeDetails.sendKeys(table.get("Payee details"));

        payBillsPage.addButton.click();


    }

    @Then("message The new payee The Law Offices of Hyde, Price &	Scharks	was successfully created. should be	displayed")
    public void message_the_new_payee_the_law_offices_of_hyde_price_scharks_was_successfully_created_should_be_displayed() {
        String expectedMessage ="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        BrowserUtils.wait(1);
        String actualMessage = payBillsPage.alertMessage.getText();
        BrowserUtils.wait(3);
        Assert.assertEquals("actual message is not as expected!",expectedMessage,actualMessage);



    }


}
