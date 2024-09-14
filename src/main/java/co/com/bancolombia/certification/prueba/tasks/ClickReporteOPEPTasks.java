package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_MAS_PUBLICACIONES;
import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_REPORTE_OPEP;

public class ClickReporteOPEPTasks implements Task {
    public static ClickReporteOPEPTasks clickReporteOPEPTasks() {
        return Tasks.instrumented(ClickReporteOPEPTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),
                Scroll.to(BTN_MAS_PUBLICACIONES),
                Click.on(BTN_MAS_PUBLICACIONES).afterWaitingUntilEnabled(),

                Click.on(BTN_REPORTE_OPEP).afterWaitingUntilEnabled()
        );
    }
}

