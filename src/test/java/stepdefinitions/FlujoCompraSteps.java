package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;

public class FlujoCompraSteps {

    //    @Given("Me autentico con el usuario {string} y password {string}")
//    public void meAutenticoConElUsuarioYPassword(String usuario, String password) {
//        // Implementación del inicio de sesión
//        System.out.println("Autenticando con usuario: " + usuario + " y password: " + password);
//        // Aquí llamada a la página de inicio de sesión    todo
//    }
//
//    @When("Agrego dos productos a carrito")
//    public void agregoDosProductosACarrito() {
//        // Implementación para agregar productos al carrito
//        System.out.println("Agregando dos productos al carrito");
//    }
//
//    @And("Visualizo el carrito")
//    public void visualizoElCarrito() {
//        // Implementación para visualizar el carrito
//        System.out.println("Visualizando el carrito");
//    }
//
//    @And("Completo el formulario de compra")
//    public void completoElFormularioDeCompra() {
//        // Implementación para completar el formulario de compra
//        System.out.println("Completando el formulario de compra");
//    }
//
//    @Then("Debería ver la confirmación {string}")
//    public void deberiaVerLaConfirmacion(String mensaje) {
//        // Implementación para verificar el mensaje de confirmación
//        System.out.println("Verificando mensaje de confirmación: " + mensaje);
//        assertEquals("THANK YOU FOR YOUR ORDER", mensaje);
//    }
    @Given("Me autentico con el usuario {string} y password {string}")
    public void me_autentico_con_el_usuario_y_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Agrego dos productos a carrito")
    public void agrego_dos_productos_a_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Visualizo el carrito")
    public void visualizo_el_carrito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Completo el formulario de compra")
    public void completo_el_formulario_de_compra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Debería ver la confirmación {string}")
    public void debería_ver_la_confirmación(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
