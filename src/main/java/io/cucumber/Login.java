package io.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertiesfilereader.PropertyFileReader;



public class Login extends BaseClass {
    static WebDriver driver = new ChromeDriver();
    public static PropertyFileReader testdata = new PropertyFileReader(".\\properties\\testdata.properties");

    public static void openWebsite() {
        driver.get(testdata.getproperty("website.url"));
    }
}
