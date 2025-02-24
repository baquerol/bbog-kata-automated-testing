package com.orangehrmlive.opensourcedemo.tasks;
import com.orangehrmlive.opensourcedemo.interactions.EsperaImplicita;
import com.orangehrmlive.opensourcedemo.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.orangehrmlive.opensourcedemo.userInterface.PaginaPrincipalUI.*;

public class CreacionUsuarios implements Task {
    Excel excel =new Excel();
    @Override
    public <T extends Actor> void performAs(T actor){

        try{
            actor.attemptsTo(
                    Click.on(BTN_ADMIN),
                    Click.on(BTN_ADD),
                   //SelectFromOptions.byVisibleText(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,0)).from(LST_USERROLE),
                    //SelectFromOptions.byVisibleText(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,1)).from(LST_STATUS),
                    //SelectFromOptions.byVisibleText(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,0)).from(LST_USERROLE),
                  Click.on(BTN_SELEC),
                    EsperaImplicita.enSegundos(10),
                    SendKeys.of("Admin").into(By.tagName("body")),
                  //  Click.on(BTN_ELEC),
                 //   Click.on(Button.containingText("Admin")),
                   Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,0)).into(LST_USERROLE),
                    EsperaImplicita.enSegundos(20),
                   // Click.on(LST_STATUS),
                   // Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,1)).into(LST_STATUS),
                    Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,2)).into(TXT_EMPLOYEE),
                    EsperaImplicita.enSegundos(10),

                    Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,3)).into(TXT_USERNAME),
                    Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,4)).into(TXT_PASSWORD),
                    Enter.theValue(excel.leerDatosExcel("DatosExcel.xlsx","cuenta",1,5)).into(TXT_CONFIRMPASSWORD),
                    Click.on(BTN_SAVE)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static CreacionUsuarios iniciar(){
        return instrumented(CreacionUsuarios.class);
    }
}

