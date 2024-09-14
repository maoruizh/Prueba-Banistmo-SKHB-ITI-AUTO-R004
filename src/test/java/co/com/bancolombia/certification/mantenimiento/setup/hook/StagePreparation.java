package co.com.bancolombia.certification.mantenimiento.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.bancolombia.certification.prueba.utils.Constants.ACTOR_PAGE;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class StagePreparation {

    @Before
    public void StagePreparation() {
        setTheStage(new OnlineCast());
        theActor(ACTOR_PAGE.getConstant());
    }
}
