package com.ait.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "//button[contains(.,'Sign Out')]")
    WebElement signOutButton;
    public ProfilePage isSignOutButtonDisplayed() {
        isElementDisplayed(signOutButton);
        return this;
    }
@FindBy(css = "a:nth-child(5)")
WebElement addLink;
    public ProfilePage clickOnAddLink() {
        click(addLink);
        return  this;
    }
@FindBy(css="input:nth-child(1)")
WebElement nameEl;
    @FindBy(css="input:nth-child(2)")
WebElement lastNameEl;
    @FindBy(css="input:nth-child(3)")
WebElement phoneEl;
    @FindBy(css="input:nth-child(4)")
WebElement emailEl;
    @FindBy(css="input:nth-child(5)")
WebElement addressEl;
    @FindBy(css="input:nth-child(6)")
WebElement descEl;

    public ProfilePage addContact(Contact contact) {
        type(nameEl, contact.getName());
        type(lastNameEl, contact.getLastName());
        type(phoneEl, contact.getPhone());
        type(emailEl, contact.getEmail());
        type(addressEl, contact.getAddress());
        type(descEl, contact.getDescription());
        return this;
    }
@FindBy(css = ".add_form__2rsm2 button")
WebElement saveButton;
    public ProfilePage clickOnSaveButton() {
        click(saveButton);
        return this;
    }
}
