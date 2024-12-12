package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage extends PageObject {

    private By firstProductAddButton = By.cssSelector(".inventory_item:nth-of-type(1) .btn_inventory");
    private By secondProductAddButton = By.cssSelector(".inventory_item:nth-of-type(2) .btn_inventory");
    private By cartButton = By.className("shopping_cart_link");

    public void addFirstProductToCart() {
        $(firstProductAddButton).click();
    }

    public void addSecondProductToCart() {
        $(secondProductAddButton).click();
    }

    public void goToCart() {
        $(cartButton).click();
    }
}
