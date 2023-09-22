package io.cucumber;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver;


    @Given("^I am on the ML Shop Website$")
    public void visit_curva_link(){
        Login.openWebsite();
    }

}
