package co.com.bancolombia.certification.mantenimiento.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import co.com.bancolombia.certification.prueba.interactions.Cambio;
import static co.com.bancolombia.certification.prueba.questions.ValidatePDFReport.validatePDFReport;
import static co.com.bancolombia.certification.prueba.tasks.ClickImagen.clickImagen;
import static co.com.bancolombia.certification.prueba.tasks.ClickReporteOPEPTasks.clickReporteOPEPTasks;
import static co.com.bancolombia.certification.prueba.tasks.ClickActualidadEconomicaTasks.clickactualidadEconomicaTasks;
import static co.com.bancolombia.certification.prueba.tasks.ClickCapitalInteligenteTasks.clickCapitalInteligenteTasks;
import static co.com.bancolombia.certification.prueba.tasks.ClickCorporativosTasks.clickCorporativosTasks;
import static co.com.bancolombia.certification.prueba.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BancolombiaStepDefinitions {

    @Given("I Select go to Bancolombia")
    public void ISelectGoToBancolombiaBancolombia() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL.getConstant()));
    }

    @And("I Select button Corporativos")
    public void SelectCorporativosButton() {
        theActorInTheSpotlight().attemptsTo(clickCorporativosTasks());
    }

    @And("I Select button Capital Inteligente")
    public void SelectCapitalInteligenteButton() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(clickCapitalInteligenteTasks());
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(2));
    }

    @And("I Select button Actualidad Economica")
    public void SelectActualidadEconomicaButton() {
        theActorInTheSpotlight().attemptsTo(clickactualidadEconomicaTasks());
    }

    @And("I Select report OPEP")
    public void SelectreportOPEP() {
        theActorInTheSpotlight().attemptsTo(clickReporteOPEPTasks());
    }

    @When("I Select image to download report")
    public void ISelectImageToDownloadReport() throws InterruptedException{
        theActorInTheSpotlight().attemptsTo(clickImagen());
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(3));
    }

    @Then("I Validate that the PDF report is correct")
    public void  IValidateThatTheReportIsCorrect() {
        theActorInTheSpotlight().should(seeThat(validatePDFReport()));
    }
}
