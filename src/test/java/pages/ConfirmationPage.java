package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.WhenPageOpens;

public class ConfirmationPage extends PageObject {

    @FindBy(css = ".complete-header")
    private WebElement confirmationMessage;

    @FindBy(css = ".pony_express")
    private WebElement confirmationIcon;

    @FindBy(css = ".complete-text")
    private WebElement orderNumberText;

    @FindBy(css = "#back-to-products")
    private WebElement backHomeButton;

    @WhenPageOpens
    public void waitUntilPageLoaded() {
        element(confirmationMessage).waitUntilVisible();
    }

    public void waitForPageToLoad() {
        waitUntilPageLoaded();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText().trim();
    }

    public boolean isConfirmationIconDisplayed() {
        return confirmationIcon.isDisplayed();
    }

    public boolean isOrderNumberDisplayed() {
        return !orderNumberText.getText().isEmpty();
    }

    public boolean isBackHomeButtonEnabled() {
        return backHomeButton.isEnabled();
    }
}

