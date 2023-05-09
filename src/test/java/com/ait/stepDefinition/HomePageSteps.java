package com.ait.stepDefinition;

import com.ait.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ait.pages.BasePage.driver;

public class HomePageSteps {


    @Given("User launches Chrome Browser")
    public void UserLaunchesChromeBrowser(){
        new HomePage(driver).launchBrowser();

    }
    @When("User opens PhoneBook Home Page")
    public void  open_HomePage(){
        new HomePage(driver).openURL();
    }
    @Then("User verifies Home Component Form is displayed")
    public void verify_HomeComponentForm_displayed(){
        new HomePage(driver).isHomeComponentPresent();
    }
    @And("User quites browser")
    public void quit_browser(){
        new HomePage(driver).tearDown();
    }
    @And("User clicks on LOGIN link")
    public void clicks_LOGIN_link(){
        new HomePage(driver).clickOnLoginLink();
    }
}
