package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.CAPITAL_INTELIGENTE;

public class ClickCapitalInteligenteTasks implements Task {

    public static ClickCapitalInteligenteTasks clickCapitalInteligenteTasks() {
        return Tasks.instrumented(ClickCapitalInteligenteTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAPITAL_INTELIGENTE).afterWaitingUntilEnabled()
        );
    }
}