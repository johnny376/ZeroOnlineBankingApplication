package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindTransactionsPage extends BasePage{

    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement datesFromInput;

    @FindBy(xpath = "//input[@id='aa_toDate']")
    public WebElement datesToInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;






}
