package actions;

import logging.LogMessages;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.ReportManager;
import utils.WaitUtils;

/**
 * ===============================================================
 * Clase: UIActions
 *
 * Responsabilidad:
 * Centralizar todas las acciones que un usuario puede realizar
 * sobre la interfaz gráfica (UI).
 *
 * Objetivo:
 * Evitar que las Page Objects interactúen directamente con Selenium.
 *
 * Patrón utilizado:
 * Wrapper / Facade sobre Selenium WebDriver.
 *
 * Beneficios:
 * - Reutilización de código.
 * - Menor duplicación.
 * - Mejor mantenimiento.
 * - Logging centralizado.
 * - Reportes automáticos.
 * - Uso consistente de Explicit Wait.
 * ===============================================================
 */
public class UIActions {

    /**
     * Instancia del navegador utilizada durante la ejecución.
     */
    private final WebDriver driver;

    /**
     * Logger de Log4j.
     */
    private static final Logger logger =
            LoggerManager.getLogger(UIActions.class);

    /**
     * Constructor.
     *
     * @param driver navegador activo.
     */
    public UIActions(WebDriver driver) {

        this.driver = driver;

    }
    public boolean waitForUrlContains(String text) {

        return WaitUtils.waitForUrlContains(driver, text);

    }

    public void waitForElements(By locator) {

        WaitUtils.waitForElements(driver, locator);

    }

    /**
     * ===========================================================
     * Realiza un clic sobre un elemento.
     *
     * Antes del clic espera que el elemento sea clickeable,
     * evitando errores de sincronización.
     *
     * @param locator localizador Selenium.
     * ===========================================================
     */
    public void click(By locator) {

        logger.info(LogMessages.CLICK + locator);

        ReportManager.info(
                "Click sobre elemento: " + locator);

        WaitUtils
                .waitForClickable(driver, locator)
                .click();

    }

    /**
     * ===========================================================
     * Escribe un texto dentro de un campo.
     *
     * Flujo:
     * 1) Espera que el campo sea visible.
     * 2) Limpia el contenido existente.
     * 3) Escribe el nuevo valor.
     *
     * @param locator localizador Selenium.
     * @param text texto a ingresar.
     * ===========================================================
     */
    public void type(By locator, String text) {

        logger.info(LogMessages.TYPE + locator);

        ReportManager.info(
                "Escribiendo en: " + locator);

        WaitUtils
                .waitForVisibility(driver, locator)
                .clear();

        WaitUtils
                .waitForVisibility(driver, locator)
                .sendKeys(text);

    }

    /**
     * ===========================================================
     * Obtiene el texto visible de un elemento.
     *
     * Antes de leer el contenido espera que el elemento
     * sea visible.
     *
     * @param locator localizador Selenium.
     * @return texto del elemento.
     * ===========================================================
     */
    public String getText(By locator) {

        logger.info("Leyendo texto de: {}", locator);

        ReportManager.info(
                "Leyendo texto de: " + locator);

        return WaitUtils
                .waitForVisibility(driver, locator)
                .getText();

    }

    /**
     * ===========================================================
     * Verifica si un elemento se encuentra visible.
     *
     * Se utiliza para validaciones funcionales
     * dentro de las páginas del framework.
     *
     * @param locator localizador Selenium.
     * @return true si el elemento es visible.
     * ===========================================================
     */
    public boolean isDisplayed(By locator) {

        logger.info("Verificando visibilidad de: {}", locator);

        ReportManager.info(
                "Verificando visibilidad de: " + locator);

        return WaitUtils
                .waitForVisibility(driver, locator)
                .isDisplayed();

    }

    /**
     * ===========================================================
     * Verifica si un elemento está habilitado.
     *
     * Puede utilizarse para validar botones,
     * inputs o controles antes de interactuar.
     *
     * @param locator localizador Selenium.
     * @return true si el elemento está habilitado.
     * ===========================================================
     */
    public boolean isEnabled(By locator) {

        logger.info("Verificando elemento habilitado: {}", locator);

        ReportManager.info(
                "Verificando elemento habilitado: " + locator);

        return WaitUtils
                .waitForVisibility(driver, locator)
                .isEnabled();

    }

}