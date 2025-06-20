@ProductoInexistente
  Feature: Buscar un producto que no existe y validarlo

    @BuscarProductoInexistente @Happypath
      Scenario Outline: Buscar un producto que no existe y validarlo
        Given el usuario esta en la pagina de inicio
        And ingresa un producto "<nombreProducto>" a buscar
        When hace click en el boton search
        Then no se encuentran resultados para el producto buscado
      Examples:
      |nombreProducto|
      |perros  |