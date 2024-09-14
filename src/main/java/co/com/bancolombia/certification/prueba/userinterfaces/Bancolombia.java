package co.com.bancolombia.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Bancolombia {

    public static final Target BTN_CORPORATIVOS = Target.the("Boton Corporativos").located(By.id("header-empresas"));
    public static final Target CAPITAL_INTELIGENTE = Target.the("Boton Capital Inteligente").located(By.xpath("//*[@id=\"headerMain\"]/div[2]/div[1]/nav/ul/li[5]"));
    public static final Target BTN_ACTUALIDAD_ECONOMICA = Target.the("Boton Actualidad Economica").located(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));
    public static final Target BTN_MAS_PUBLICACIONES = Target.the("Boton Mas publicaciones").located(By.id("verMas"));
    public static final Target BTN_REPORTE_OPEP = Target.the("Boton Reporte OPEP").located(By.xpath("//*[@id=\"capital_inteligente\"]/div[1]/div[120]/div[1]/div/a/img"));
    public static final Target BTN_IMAGEN_INFORME = Target.the("Boton Imagen Descargar Informe").located(By.xpath("//*[@id=\"main-content\"]/div[2]/div[1]/div/div[1]/p[15]/a"));
    public static final Target ICN_PDF = Target.the("Imagen portada PDF").located(By.id("pagediv_0"));
    //*[@id="pagediv_0"]
}