package com.myb.step_definitions;

import com.myb.pages.GoogleSearchPage;
import com.myb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Given("user is on google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }
    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actual = Driver.getDriver().getTitle();
        String expected = "apple";

        Assert.assertTrue(actual.contains(expected));

    }


    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {

        //with this, it automatically pass whatever we have in feature file.
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("arg0" + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {

        String actual = Driver.getDriver().getTitle();
        String expected = expectedTitle;

        Assert.assertTrue(actual.contains(expected));
    }
}
