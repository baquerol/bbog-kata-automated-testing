package com.orangehrmlive.opensourcedemo.tasks;


import com.orangehrmlive.opensourcedemo.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.orangehrmlive.opensourcedemo.userInterface.PaginaLoginUI.*;


public class Login implements Task{
    private final String usuario;
    private final String clave;


    public Login (String usuario, String clave){
        this.usuario=usuario;
        this.clave=clave;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_LOGIN)


        );
    }
    public static Login login(String usuario, String clave) {
        return new Login(usuario, clave);
    }
}
