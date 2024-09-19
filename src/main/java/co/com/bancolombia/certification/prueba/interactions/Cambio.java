package co.com.bancolombia.certification.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class Cambio implements Interaction {

    private final int numeroDePestana;

    public Cambio(int numeroDePestana) {
        this.numeroDePestana = numeroDePestana;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Obtenemos todas las ventanas o pestañas abiertas
        Object[] ventanas = driver.getWindowHandles().toArray();

        // Cambiamos a la pestaña deseada
        driver.switchTo().window((String) ventanas[numeroDePestana - 1]);
    }

    public static Performable aLaPestana(int numeroDePestana) {
        return Tasks.instrumented(Cambio.class, numeroDePestana);
    }
}