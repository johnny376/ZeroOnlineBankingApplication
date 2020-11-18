package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage{


    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactionTab;

    @FindBy(id = "aa_accountId")
    public WebElement selectAccount;
















}
