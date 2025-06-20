@EditarUsuarios

  Feature: Iniciar sesion y editar usuario

    @EditarUsuario @Happypath
      Scenario Outline: Iniciar sesion y editar el nombre del usuario
        Given el usuario inicia sesion con sus credenciales email "<email>" y contrasenia "<contrasenia>"
        And se dirige a la opcion mi cuenta
        And selecciona editar cuenta
        And ingresa su nuevo nombre "<nombre>"
        When de clic en el boton guardar
        Then se realiza la actualizacion de manera exitosa
        Examples:
        |email                        |contrasenia      | nombre    |
        |speaker_115@outlook.com      | Password123&    | Alejandro editado |