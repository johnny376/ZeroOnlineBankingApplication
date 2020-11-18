package com.zeroBank.step_definitions;

import com.zeroBank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.util.concurrent.TimeUnit;

public class Hooks {

    //    hook before = @BeforeMethod in TestNG
//    hook after = @AfterMethod in TestNG
//    it's not a good idea to mix implicit and explicit waits. It can lead to unexpectedly long waits.
//    usually, we just use explicit and fluent waits.

    @Before
    public void setup() {
        System.out.println("::: Starting Automation:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //    this hook will run only before scenarios with a tag @db

    /**
     * @db
     * Scenario: I don't know but here I'm connecting to DB
     * Given user runs following query "SELECT * ...."
     */
    @Before("@db")
    public void dbSetup(){
        System.out.println("::: Connecting to the database:::");
    }

    @After("@db")
    public void dbTearDown(){
        System.out.println("::: Disconnecting from the database:::");
    }


    @After
    public void tearDown() {
        //close browser, close DB connection, close tunnel,capture screenshot of the error, etc..
        //this is a hook after
        //runs automatically after every test
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }

//    @BeforeStep
//    public void setUpStep(){
//        System.out.println("******>BEFORESTEP: TAKING SCREENSHOT<******");
//    }
//
//    @AfterStep
//    public void tearDownStep(){
//        System.out.println("******>AFTERSTEP: TAKING SCREENSHOT<******");
//    }



}
