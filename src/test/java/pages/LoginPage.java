package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@DefaultUrl("/")
public class LoginPage extends PageObject {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void enterUsername(String username) {
        $(usernameField).type(username);
    }

    public void enterPassword(String password) {
        $(passwordField).type(password);
    }

    public void clickLoginButton() {
        $(loginButton).click();
    }
}
