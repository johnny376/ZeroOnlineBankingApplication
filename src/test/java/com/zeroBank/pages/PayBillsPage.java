package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{


    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayeeTab;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement alertMessage;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyTab;

    @FindBy (id = "pc_currency")
    public WebElement currencySelect;

    @FindBy (id = "pc_amount")
    public WebElement amountInput;

    @FindBy (id = "pc_calculate_costs")
    public WebElement calculateCostsButton;

    @FindBy (id = "pc_calculate_costs")
    public WebElement purchase_cashButton;













}
