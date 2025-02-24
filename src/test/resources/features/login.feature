# language:es
# encoding :UTF-8

@Login
Característica: Como usuario de la pagina OrangeHRMlive quiero validar el funcionamiento del login.

   Esquema del escenario: Validación del Login en la pagina de orangehrmlive
    Dado que el usuario se encuentra en la pagina del login
    Cuando ingrese las credenciales "<Usuario>" con la clave "<Clave>"
    Entonces se visualiza en pantalla "<Mensaje>"

     Ejemplos:
       |Usuario  |Clave   |Mensaje   |
       |Admin    |admin123|Dashboard   |
       |Luis     |1234Ab  |Invalid credentials|
       |         |        |RequiredUserNamePassword   |
       |Admin    |        |RequiredPassword   |
       |         |1234Ab  |RequiredUserName   |
