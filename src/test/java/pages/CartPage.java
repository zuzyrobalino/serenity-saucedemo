package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPage extends PageObject {

    private By checkoutButton = By.id("checkout");

    public void clickCheckout() {
        $(checkoutButton).click();
    }
}
