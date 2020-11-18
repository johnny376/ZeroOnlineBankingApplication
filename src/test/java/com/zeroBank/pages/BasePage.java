package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    /*
    @FindBy (xpath = "//a[@class='brand']")
    protected WebElement pageSubTittle;

    public String setPageSubTittle(){
        return pageSubTittle.getText();
    }

     */


}
