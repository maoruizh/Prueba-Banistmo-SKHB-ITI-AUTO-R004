package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.*;

public class ClickActualidadEconomicaTasks implements Task {

    public static ClickActualidadEconomicaTasks clickactualidadEconomicaTasks() {

        return Tasks.instrumented(ClickActualidadEconomicaTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACTUALIDAD_ECONOMICA).afterWaitingUntilEnabled()
        );
    }
}

