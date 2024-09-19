package co.com.bancolombia.certification.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

//public class ValidatePDFReport implements Question<Boolean> {
//
//    @Override
//    public Boolean answeredBy(Actor actor) {
//
//        return ICN_PDF.resolveFor(actor).isPresent();
//    }
//    public static ValidatePDFReport validatePDFReport() {
//        return new ValidatePDFReport();
//    }
//}

public class ValidatePDFReport implements Question<Boolean> {

    private final String expectedTitle;

    public ValidatePDFReport(String expectedTitle) {
        this.expectedTitle = expectedTitle;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
    //obtener el titulo de la pestaña actual
        String actualTitle= BrowseTheWeb.as(actor).getDriver().getTitle();

    //comparar el titulo actual con el esperado
        return actualTitle.equals(expectedTitle);
    }

    public static ValidatePDFReport validatePDFReport(String expectedTitle) {
        return new ValidatePDFReport(expectedTitle);
    }

}

