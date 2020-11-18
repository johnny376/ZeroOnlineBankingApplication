package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user_login")
    public WebElement loginInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertMessage;

    public String getAlertMessage(){
        return alertMessage.getText().trim();
    }

    public void login(){
        String loginValue = ConfigurationReader.getProperty("loginInput");
        String passwordValue = ConfigurationReader.getProperty("password");

        BrowserUtils.wait(1);
        loginInput.sendKeys(loginValue);
        BrowserUtils.wait(1);
        passwordInput.sendKeys(passwordValue);
        BrowserUtils.wait(1);
        signInButton.click();

    }

    public void login(String loginValue, String passwordValue){

        BrowserUtils.wait(1);
        loginInput.sendKeys(loginValue);
        BrowserUtils.wait(1);
        passwordInput.sendKeys(passwordValue);
        BrowserUtils.wait(1);
        signInButton.click();

    }




}
