package co.com.bancolombia.certification.prueba.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@AllArgsConstructor
public class Wait implements Interaction {
    private int seconds;

    public static Wait seconds(int seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos((long) seconds * 20));
    }
}
