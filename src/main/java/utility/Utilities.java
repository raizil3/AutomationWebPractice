package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Utilities {
    public static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver getWebDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void type(By byLocator, String input, String FieldName) throws Exception{
        Actions a = new Actions(getWebDriver());
        a.sendKeys(input);
        a.perform();

    }
}
