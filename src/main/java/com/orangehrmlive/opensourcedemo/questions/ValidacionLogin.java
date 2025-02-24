package com.orangehrmlive.opensourcedemo.questions;
import com.orangehrmlive.opensourcedemo.userInterface.PaginaLoginUI;
import com.orangehrmlive.opensourcedemo.userInterface.PaginaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.questions.Text;
public class ValidacionLogin implements Question <String> {

    private final String mensajeEsperado;

    public ValidacionLogin (String mensajeEsperado){
        this.mensajeEsperado=mensajeEsperado;
    }
        @Override
        public String answeredBy (Actor actor){
            String mensajeObtenido="";
            if (mensajeEsperado.equals("Dashboard")) {
                if (actor.asksFor(Visibility.of(PaginaPrincipalUI.LLB_Dashboard))) {
                    mensajeObtenido = "Dashboard";
                }
            }  else if (mensajeEsperado.equals("Invalid credentials")) {
                if (actor.asksFor(Visibility.of(PaginaLoginUI.MSJ_CREDENCIALESINVALIDAS))) {
                    mensajeObtenido = "Invalid credentials";
                }
            }
                else if (mensajeEsperado.equals("RequiredUserName")) {
                if (actor.asksFor(Visibility.of(PaginaLoginUI.MSJ_REQUERIDOUSUARIO))) {
                    mensajeObtenido = "RequiredUserName";
                }
            }
                else if (mensajeEsperado.equals("RequiredPassword")) {
                if (actor.asksFor(Visibility.of(PaginaLoginUI.MSJ_REQUERIDOCLAVE))) {
                    mensajeObtenido = "RequiredPassword";
                }
            }
                else if (mensajeEsperado.equals("RequiredUserNamePassword")) {
                if (actor.asksFor(Visibility.of(PaginaLoginUI.MSJ_REQUERIDOUSUARIO)) && actor.asksFor(Visibility.of(PaginaLoginUI.MSJ_REQUERIDOCLAVE))) {
                    mensajeObtenido = "RequiredUserNamePassword";
                }
            }
            else {
                return "Mensaje no reconocido";
            }

     return mensajeObtenido.isEmpty() ? "Mensaje no encontrado" : mensajeObtenido;
}

        public static ValidacionLogin conMensajeEsperado(String mensajeEsperado){
            return new ValidacionLogin(mensajeEsperado);
        }

}

