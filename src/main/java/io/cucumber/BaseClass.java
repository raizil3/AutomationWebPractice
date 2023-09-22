package io.cucumber;

import org.openqa.selenium.WebDriver;
import propertiesfilereader.PropertyFileReader;

import java.util.Properties;

public abstract class  BaseClass {

    private Properties properties;

    public static PropertyFileReader testdata = new PropertyFileReader(".\\properties\\testdata.properties");


}
