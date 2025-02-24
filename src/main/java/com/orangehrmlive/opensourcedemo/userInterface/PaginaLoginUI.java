package com.orangehrmlive.opensourcedemo.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class PaginaLoginUI {
    public static final Target TXT_USUARIO= Target.the("usuario").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target TXT_CLAVE= Target.the("clave").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_LOGIN= Target.the("boton login").located(By.xpath("//button[@type='submit']"));
    public static final Target MSJ_CREDENCIALESINVALIDAS= Target.the("Mensaje de credenciales invalidas").located(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
    public static final Target MSJ_REQUERIDOUSUARIO= Target.the("Mensaje de campo requerido para usuario").located(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]"));
    public static final Target MSJ_REQUERIDOCLAVE= Target.the("Mensaje de campo requerido para Clave").located(By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]"));
}
