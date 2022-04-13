package com.myb.step_definitions;

import com.myb.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber not from junit
    @Before(value = "@login", order = 1)
    public void setupLoginScenario(){
        System.out.println("BEFORE---Setting up browser with further details...");
    }
    @Before
    public void setupScenario(){
        System.out.println("BEFORE---Setting up browser with further details...");
    }

    //import from io.cucumber not from junit
    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()){
            //taking screenshot of failed test
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("AFTER--Teardown steps are being applied...");
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("---setup applying for each step");

    }
    @AfterStep
    public void afterStep(){
        System.out.println("----teardown applying for each step");
    }

}
