package com.orangehrmlive.opensourcedemo.stepDefinitions;

import com.orangehrmlive.opensourcedemo.questions.ValidacionLogin;
import com.orangehrmlive.opensourcedemo.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinition {

    @Managed(driver = "edge")
    private WebDriver navegador;
    private Actor luis = Actor.named("luis");




    @Before
    public void configuracion() {
        luis.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario se encuentra en la pagina del login")
    public void queElUsuarioSeEncuentraEnLaPaginaDelLogin() {
        luis.wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }
    @Cuando("ingrese las credenciales {string} con la clave {string}")
    public void ingreseLasCredenciales(String usuario,String clave) {

        luis.attemptsTo(Login.login(usuario, clave));
    }

    @Entonces("se visualiza en pantalla {string}")
    public void seVisualizaEnPantalla(String mensajeEsperado) {
        luis.should(seeThat("el mensaje o label mostrado es el correcto", ValidacionLogin.conMensajeEsperado(mensajeEsperado), equalTo(mensajeEsperado)));
    }


}
