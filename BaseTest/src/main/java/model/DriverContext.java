package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DriverContext {

    private static WebDriver driver;

 /*   public static WebDriver getDriver() {
        return driver;
    }*/

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            DriverContext.setDriver(driver);
        }
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverContext.driver = driver;
    }
}
