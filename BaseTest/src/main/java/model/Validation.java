package model;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public interface Validation {
    PageObject DriverNew = null;

   default Boolean elementsExist (By elemento) {
        try {

            DriverNew.getDriver().findElement(elemento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
