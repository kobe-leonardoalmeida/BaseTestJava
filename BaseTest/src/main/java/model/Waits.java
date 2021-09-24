package model;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {

    private static PageObject DriverNew;

   public static void waitForPageLoadComplete() {
        WebDriverWait wait = new WebDriverWait(DriverNew.getDriver(), 30);
        wait.until(driver1 -> String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState"))
                .equals("complete"));
    }



}
