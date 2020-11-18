package com.zeroBank.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    //handled Thread:
    public static void wait(int sec){
        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception caught");
        }

    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }



}
