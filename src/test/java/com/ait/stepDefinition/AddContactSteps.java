package com.ait.stepDefinition;

import com.ait.pages.Contact;
import com.ait.pages.LoginPage;
import com.ait.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.A;

import static com.ait.pages.BasePage.driver;

public class AddContactSteps {

    @And("User click on add link")
    public void click_add_link(){
        new ProfilePage(driver).clickOnAddLink();
    }
    @And("enters valid data")
    public void enters_valid_data(){
        new ProfilePage(driver).addContact(new Contact()
                .setName("Karl")
                .setLastName("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Koblenz")
                .setDescription("torwart"));
    }
    @And("click on save button")
    public void click_save_button(){
        new ProfilePage(driver).clickOnSaveButton();
    }
}
