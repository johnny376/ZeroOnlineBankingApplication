package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//h2[.='Cash Accounts']")
    public WebElement cashAccount;

    @FindBy(xpath = "//h2[.='Investment Accounts']")
    public WebElement investmentAccount;

    @FindBy(xpath = "//h2[.='Credit Accounts']")
    public WebElement creditAccount;

    @FindBy(xpath = "//h2[.='Loan Accounts']")
    public WebElement loanAccount;

    //  //td[.='Susan McLaren']/following-sibling::td[3]

    @FindBy(xpath = "//th[.='Credit Card']/ preceding-sibling::th[1]")
    public WebElement account;

    @FindBy(xpath = "//th[.='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//th[.='Credit Card']/ following-sibling::th[1]")
    public WebElement balance;

    @FindBy(xpath = "//a[.='Savings']")
    public WebElement savingsLink;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checkingLink;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[.='Loan']")
    public WebElement loanLink;




    public boolean accountDisplayed(){
        if(cashAccount.isDisplayed() && investmentAccount.isDisplayed()&& creditAccount.isDisplayed() && loanAccount.isDisplayed()){
            return true;
        }else{
             return false;
        }
    }

    public boolean columnsDisplayed(){
        if(account.isDisplayed() && creditCard.isDisplayed() && balance.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }




}
