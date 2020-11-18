package com.zeroBank.step_definitions;

import com.zeroBank.pages.PayBillsPage;
import com.zeroBank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static com.zeroBank.utilities.Driver.getDriver;

public class ForeignCurrencyStepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();
    Select select;

    @Given("the user accesses the Purchase Foreign Currency tab")
    public void the_user_accesses_the_purchase_foreign_currency_tab() {
        payBillsPage.purchaseForeignCurrencyTab.click();
    }


    @Then("following <currencies> should be available")
    public void following_currencies_should_be_available(List<String> currency) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        select = new Select(payBillsPage.currencySelect);

        List<WebElement> allCurrency = select.getOptions();

        for(WebElement each : allCurrency){
            
           System.out.println(each.getText());

        }



    }


    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        select = new Select(payBillsPage.currencySelect);
        select.selectByVisibleText("Select One");
        payBillsPage.amountInput.sendKeys("100");
        BrowserUtils.wait(1);
        payBillsPage.calculateCostsButton.click();

    }
    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Alert alert = getDriver().switchTo().alert();
        BrowserUtils.wait(2);
        //2- use alert instance to accept the javascript alert(popop)
        alert.accept();


    }


    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        payBillsPage.amountInput.clear();
        payBillsPage.calculateCostsButton.click();

    }



}
