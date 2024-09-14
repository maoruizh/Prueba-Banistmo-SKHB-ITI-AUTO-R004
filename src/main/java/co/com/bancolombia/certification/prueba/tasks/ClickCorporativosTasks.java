package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_CORPORATIVOS;

 public class ClickCorporativosTasks implements Task {

    public static ClickCorporativosTasks clickCorporativosTasks() {
        return Tasks.instrumented(ClickCorporativosTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CORPORATIVOS).afterWaitingUntilEnabled()
        );
    }
}