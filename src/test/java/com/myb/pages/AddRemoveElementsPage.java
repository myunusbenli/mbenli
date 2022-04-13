package com.myb.pages;

import com.myb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

    public AddRemoveElementsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    public WebElement deleteButton;
}
