@ComprarProductos
  Feature: Iniciar sesion y comprar productos
    Scenario Outline: Iniciar sesion y elegir un producto a comprar
      Given El usuario inicia sesion con sus credenciales de email "<email>" y contrasenia "<contrasenia>"
      And se dirige a la opcion Men del menu horizontal para dirigirse a la opcion Tops del sub menu
      And hace clic en la opcion Jackets
      And se dirige a un producto para seleccionar la talla "<talla>" y color "<color>"
      And agrega al carrito de compras
      And da clic en el carrito de compras, para proceder con la compra
      And completa el formulario de compra con la compania "<compania>" direccion "<direccion>" ciudad "<ciudad>" codigo postal "<codigo_postal>" selecciona el pais para indicar la provincia "<provincia>" y ecribe su numero telefono "<numero_telefono>"
      And da clic en el boton siguiente
      When da clic en el boton realizar pedido
      Then validamos la compra que sea exitosa
      Examples:
      |email                  |contrasenia  |talla  |color      |
      |speaker_115@outlook.com|Password123& | L     | Gray      |