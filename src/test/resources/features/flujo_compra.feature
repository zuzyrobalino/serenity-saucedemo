Feature: Flujo de compra
  Scenario: Completar la compra
    Given Me autentico con el usuario "standard_user" y password "secret_sauce"
    When Agrego dos productos a carrito
    And Visualizo el carrito
    And Completo el formulario de compra
    Then Debería ver la confirmación "THANK YOU FOR YOUR ORDER"

  #EJERCICIO:
  #Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
  #https://www.saucedemo.com/ que incluya:
  #• Autenticarse con el usuario: standard_user y password: secret_sauce
  #• Agregar dos productos al carrito
  #• Visualizar el carrito
  #• Completar el formulario de compra
  #• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”