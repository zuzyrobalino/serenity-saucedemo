package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPage extends PageObject {

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");

    public void enterFirstName(String firstName) {
        $(firstNameField).type(firstName);
    }

    public void enterLastName(String lastName) {
        $(lastNameField).type(lastName);
    }

    public void enterPostalCode(String postalCode) {
        $(postalCodeField).type(postalCode);
    }

    public void clickContinue() {
        $(continueButton).click();
    }

    public void finishCheckout() {
        $(finishButton).click();
    }
}
