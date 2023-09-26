package io.cucumber;

import Page.MLShopePages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

import static utility.Utilities.type;


public class Login extends BaseClass {

    private static final Logger logger = LogManager.getLogger(Login.class);
    public static void openWebsite() {
        driver.manage().window().maximize();
        driver.get(testdata.getproperty("website.url"));
    }
    public static void clickIfNotLogIn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webelements.getproperty("userProfileInfo"))));
        driver.findElement(By.xpath(webelements.getproperty("userProfileInfo"))).click();
    }

    public static void enterMobileNumber(){
        driver.findElement(By.xpath(webelements.getproperty("mobileNumberInputField"))).sendKeys(testdata.getproperty("mobile.number"));
    }
    public static void clickLoginButton(){
        driver.findElement(By.xpath(webelements.getproperty("logInButton"))).click();
    }

    public static void checkOneTimeModalIfVisible(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webelements.getproperty("oneTimePinText"))));
            WebElement enterOneTimePinTextElement = driver.findElement(By.xpath(webelements.getproperty("oneTimePinText")));

            if (enterOneTimePinTextElement.isDisplayed()) {
                System.out.println("The ' Enter One Time Pin ' text is visible.");
            }
        } catch (Exception e) {
            System.out.println("The  ' Enter One Time Pin ' text is not visible.");
        }
    }

    public static void enterOneTimePassword() throws Exception {
        type(MLShopePages.oTPInputField, testdata.getproperty("validateOTP"), "One Time Pin Input field");
    }


}
