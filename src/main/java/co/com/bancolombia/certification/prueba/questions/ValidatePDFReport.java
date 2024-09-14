package co.com.bancolombia.certification.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.ICN_PDF;

public class ValidatePDFReport implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return ICN_PDF.resolveFor(actor).isPresent();
    }
    public static ValidatePDFReport validatePDFReport() {
        return new ValidatePDFReport();
    }
}
