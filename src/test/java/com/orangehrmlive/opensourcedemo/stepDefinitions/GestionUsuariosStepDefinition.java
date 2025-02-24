package com.orangehrmlive.opensourcedemo.stepDefinitions;
import com.orangehrmlive.opensourcedemo.questions.ValidacionLogin;
import com.orangehrmlive.opensourcedemo.tasks.CreacionUsuarios;
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
public class GestionUsuariosStepDefinition {

    @Managed(driver = "edge")
    private WebDriver navegador;
    private Actor luis = Actor.named("luis");




    @Before
    public void configuracion() {
        luis.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario se encuentra logueado en la pagina orangehrmlive")
    public void queElUsuarioSeEncuentraLogueadoEnLaPaginaOrangehrmlive() {
        String usuario="Admin";
        String clave="admin123";
        luis.wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
        luis.wasAbleTo(Login.login(usuario, clave));
    }
    @Cuando("ingrese los datos para el registro de usuarios")
    public void ingreseLosDatosParaElRegistroDeUsuarios() {
      luis.attemptsTo(CreacionUsuarios.iniciar());
    }
    @Entonces("se visualiza el mensaje de exitoso")
    public void seVisualizaElMensajeDeExitoso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
