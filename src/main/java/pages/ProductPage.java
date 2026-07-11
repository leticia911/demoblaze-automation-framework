package pages;

import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.ReportManager;
import utils.WaitUtils;

/**
 * ===============================================================
 * Clase: ProductPage
 *
 * Representa la página de detalle de un producto.
 *
 * Responsabilidades:
 * - Verificar que el detalle del producto se encuentre cargado.
 * - Permitir regresar al Home utilizando el menú superior.
 *
 * Patrón utilizado:
 * Page Object Model (POM).
 *
 * Cada método representa una acción que un usuario puede realizar
 * sobre esta pantalla.
 * ===============================================================
 */
public class ProductPage extends BasePage {

    /**
     * Logger utilizado durante la ejecución.
     */
    private static final Logger logger =
            LoggerManager.getLogger(ProductPage.class);

    /**
     * Nombre del producto.
     *
     * Si este elemento es visible significa que la página
     * del producto terminó de cargar correctamente.
     */
    private final By productName =
            By.cssSelector(".name");

    /**
     * Enlace Home del menú superior.
     *
     * Se utiliza el atributo href en lugar de linkText()
     * porque DemoBlaze incorpora un <span class="sr-only">
     * con el texto "(current)", lo que provoca que
     * Selenium no encuentre el enlace mediante
     * By.linkText("Home").
     *
     * Este locator es más robusto y menos sensible a
     * cambios visuales o de idioma.
     */
    private final By homeLink =
            By.cssSelector("a[href='index.html']");

    /**
     * Constructor.
     *
     * @param driver navegador activo.
     */
    public ProductPage(WebDriver driver) {

        super(driver);

    }

    /**
     * ===========================================================
     * Verifica que el detalle del producto haya cargado.
     *
     * Se considera correctamente cargado cuando el nombre
     * del producto es visible.
     *
     * @return true si el nombre del producto es visible.
     * ===========================================================
     */
    public boolean isLoaded() {

        logger.info(
                "Verificando carga de la página del producto.");

        ReportManager.info(
                "Verificando que el detalle del producto se encuentre visible.");

        return isDisplayed(productName);

    }

    /**
     * ===========================================================
     * Hace clic sobre el enlace Home del menú superior.
     *
     * Flujo:
     * 1. Hace clic sobre el enlace Home.
     * 2. Espera hasta que la URL vuelva a la página principal.
     *
     * La espera evita problemas de sincronización durante
     * la navegación.
     * ===========================================================
     */
    public void clickHome() {

        logger.info(
                "Regresando al Home desde ProductPage.");

        ReportManager.info(
                "Click sobre el enlace Home.");

        click(homeLink);

        WaitUtils.waitForUrlContains(
                driver,
                "index.html");

    }

}