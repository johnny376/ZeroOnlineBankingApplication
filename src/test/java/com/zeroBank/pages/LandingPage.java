package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{


    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement accountActivityTab;

    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement payBillsTab;




}
