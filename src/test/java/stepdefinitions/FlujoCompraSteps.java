package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import org.junit.Assert;

public class FlujoCompraSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductPage productPage;

    @Steps
    CartPage cartPage;

    @Steps
    CheckoutPage checkoutPage;

    @Steps
    ConfirmationPage confirmationPage;

    @Given("Me autentico con el usuario {string} y password {string}")
    public void me_autentico_con_el_usuario_y_password(String username, String password) {
        loginPage.open(); // Abre la página de login
        loginPage.enterUsername(username); // Ingreso el usuario
        loginPage.enterPassword(password); // Ingreso el password
        loginPage.clickLoginButton(); // Hace clic en el botón de login
    }

    @When("Agrego dos productos a carrito")
    public void agrego_dos_productos_a_carrito() {
        productPage.addFirstProductToCart(); // Agrega el primer producto al carrito
        productPage.addSecondProductToCart(); // Agrega el segundo producto al carrito
    }

    @When("Visualizo el carrito")
    public void visualizo_el_carrito() {
        productPage.goToCart(); // Navega al carrito desde la página de productos
    }

    @When("Completo el formulario de compra")
    public void completo_el_formulario_de_compra() {
        cartPage.clickCheckout(); // Hace clic en "Checkout" en el carrito
        checkoutPage.enterFirstName("Paquito"); // Ingresa el nombre
        checkoutPage.enterLastName("Perez"); // Ingresa el apellido
        checkoutPage.enterPostalCode("171530"); // Ingresa el código postal
        checkoutPage.clickContinue(); // Continúa al siguiente paso
        checkoutPage.finishCheckout(); // Finaliza la compra
    }

    @Then("Deberia ver la confirmacion {string}")
    public void deberia_ver_la_confirmacion(String expectedMessage) {
        confirmationPage.waitForPageToLoad(); // Espera a que la página de confirmación se cargue completamente
        String actualMessage = confirmationPage.getConfirmationMessage(); // Obtiene el mensaje de confirmación
        Assert.assertFalse("El mensaje de confirmación está vacío", actualMessage.isEmpty()); // Verifica que el mensaje de confirmación no esté vacío
        // Verifica que el mensaje de confirmación coincida con el esperado
        Assert.assertTrue("El mensaje de confirmación no coincide", actualMessage.trim().equalsIgnoreCase(expectedMessage.trim()));
        System.out.println("Mensaje esperado: " + expectedMessage);
        System.out.println("Mensaje actual: " + actualMessage);
        Assert.assertTrue("El ícono de confirmación no está presente", confirmationPage.isConfirmationIconDisplayed()); // Verifica que se muestre el ícono de confirmación
        Assert.assertTrue("El número de orden no está presente", confirmationPage.isOrderNumberDisplayed());// Verifica que se muestre el número de orden
        Assert.assertTrue("El botón 'Back Home' no está presente o habilitado", confirmationPage.isBackHomeButtonEnabled()); // Verifica que el botón "Back Home" esté presente y habilitado
    }

}

