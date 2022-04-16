package com.myb.step_definitions;

import com.myb.pages.AddRemoveElementsPage;
import com.myb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class addRemoveElement {

    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();

    @Given("user is on the Add\\/Remove Elements Page")
    public void user_is_on_the_add_remove_elements_page() {

        Driver.getDriver().get("http://practice.cybertekschool.com/add_remove_elements/");

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Add/Remove Elements";

        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @Then("user should click the Add Element button")
    public void user_should_click_the_add_element_button() {


        addRemoveElementsPage.addElementButton.click();

    }
    @When("Delete button should display whenever user click to the button")
    public void delete_button_should_display_whenever_user_click_to_the_button() {

        Assert.assertTrue(addRemoveElementsPage.deleteButton.isDisplayed());
    }

    @Given("user should see the delete button")
    public void user_should_see_the_delete_button() {

        Assert.assertTrue(addRemoveElementsPage.deleteButton.isDisplayed());

    }
    @Then("user should click to the delete button")
    public void user_should_click_to_the_delete_button() {

        addRemoveElementsPage.deleteButton.click();

    }
    @When("delete should disappear after the click")
    public void delete_should_disappear_after_the_click() {

        String actualDeleteText = addRemoveElementsPage.deleteButton.getText();
        String expectedDeleteText = "Delete";

        //this needs to be fixed
        Assert.assertEquals(actualDeleteText, expectedDeleteText);

    }
}
