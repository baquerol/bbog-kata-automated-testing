# language:es
# encoding :UTF-8


Característica: Como usuario de la pagina OrangeHRMlive quiero validar la creacion, actualizacion, eliminacion de cuentas de usuario.

  @CrearUsuario
  Escenario: Creación de usuario en la pagina
    Dado que el usuario se encuentra logueado en la pagina orangehrmlive
    Cuando ingrese los datos para el registro de usuarios
    Entonces se visualiza el mensaje de exitoso

  @ModificarUsuario
  Escenario: Modificacion de usuario en la pagina
    Dado que el usuario a modificar se encuentra creado
    Cuando modifique los datos del usuario
    Entonces se visualiza el mensaje de modificacion exitosa

  @EliminarUsuario
  Escenario: Eliminar usuario en la pagina
    Dado que el usuario a eliminar se encuentra creado
    Cuando seleccione el usuario a eliminar
    Entonces se visualiza el mensaje de eliminación exitosa