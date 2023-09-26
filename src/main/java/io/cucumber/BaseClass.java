package io.cucumber;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import propertiesfilereader.PropertyFileReader;

import java.time.Duration;
import java.util.Properties;

public abstract class  BaseClass {
    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static PropertyFileReader testdata = new PropertyFileReader(".\\properties\\testdata.properties");
    public static PropertyFileReader webelements = new PropertyFileReader(".\\properties\\webelements.properties");

    private Properties properties;



}
