package io.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver;


    @Given("^I am on the ML Shop Website$")
    public void visit_curva_link(){
        Login.openWebsite();
    }
    @When("^I click user profile info$")
    public void clickUserProfile(){
        Login.clickIfNotLogIn();
    }
    @When("^Enter my working credential$")
    public void enterMobileNumber(){
        Login.enterMobileNumber();
    }

    @And("I click Log in button")
    public void iClickLogInButton() {
        Login.clickLoginButton();
    }

    @Then("One Time Pin pop should be visible")
    public void oneTimePinPopShouldBeVisible() {
        Login.checkOneTimeModalIfVisible();
    }

    @Given("I am on the One Time Pin Pop up modal")
    public void iAmOnTheOneTimePinPopUpModal() {
        Login.checkOneTimeModalIfVisible();
    }

    @And("I enter the One Time Password")
    public void iEnterTheOneTimePassword() throws Exception {
        Login.enterOneTimePassword();

    }
}
