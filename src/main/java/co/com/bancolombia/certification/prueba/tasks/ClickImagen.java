package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.*;

public class ClickImagen implements Task {

    public static ClickImagen clickImagen() {
        return Tasks.instrumented(ClickImagen.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_IMAGEN_INFORME).afterWaitingUntilEnabled()
                );
    }
}

