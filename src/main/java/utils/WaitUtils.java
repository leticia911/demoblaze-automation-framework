package utils;

import config.ConfigReader;
import logging.LogMessages;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * ===============================================================
 * Clase: WaitUtils
 *
 * Responsabilidad:
 * Centralizar todas las esperas explícitas del framework.
 *
 * Objetivo:
 * Evitar el uso de Thread.sleep() y mejorar la estabilidad
 * de la automatización mediante Explicit Wait.
 *
 * Patrón utilizado:
 * Utility Class.
 *
 * Todas las funciones son estáticas porque no es necesario
 * instanciar la clase para utilizarlas.
 * ===============================================================
 */
public final class WaitUtils {

    /**
     * Logger utilizado para registrar cada espera
     * realizada por el framework.
     */
    private static final Logger logger =
            LoggerManager.getLogger(WaitUtils.class);

    /**
     * Constructor privado.
     *
     * Evita que la clase pueda instanciarse.
     */
    private WaitUtils() {
    }

    /**
     * ===========================================================
     * Espera hasta que exista al menos un elemento.
     *
     * Se utiliza cuando se necesita validar que una lista
     * de elementos ya fue cargada por la página.
     *
     * Ejemplo:
     * Lista de productos.
     * Lista de categorías.
     * Tabla de resultados.
     * ===========================================================
     *
     * @param driver navegador activo
     * @param locator localizador Selenium
     */
    public static void waitForElements(
            WebDriver driver,
            By locator) {

        logger.info("Esperando lista de elementos: {}", locator);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                ConfigReader.getExplicitWait()));

        wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                        locator,
                        0));

    }

    /**
     * ===========================================================
     * Espera hasta que un elemento sea visible.
     *
     * Se utiliza antes de leer información o validar
     * la presencia de un elemento en pantalla.
     * ===========================================================
     *
     * @param driver navegador activo
     * @param locator localizador Selenium
     * @return elemento visible
     */
    public static WebElement waitForVisibility(
            WebDriver driver,
            By locator) {

        logger.info(LogMessages.WAITING + locator);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                ConfigReader.getExplicitWait()));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

    }

    /**
     * ===========================================================
     * Espera hasta que un elemento sea clickeable.
     *
     * Se utiliza antes de realizar cualquier click.
     *
     * Esto evita errores como:
     *
     * - ElementNotInteractableException
     * - ElementClickInterceptedException
     * - TimeoutException
     * ===========================================================
     *
     * @param driver navegador activo
     * @param locator localizador Selenium
     * @return elemento listo para recibir click
     */
    public static WebElement waitForClickable(
            WebDriver driver,
            By locator) {

        logger.info(LogMessages.WAITING + locator);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                ConfigReader.getExplicitWait()));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));

    }

    /**
     * ===========================================================
     * Espera hasta que la URL contenga un texto determinado.
     *
     * Muy útil para verificar cambios de navegación.
     * ===========================================================
     *
     * @param driver navegador activo
     * @param text texto esperado en la URL
     * @return true cuando la condición se cumple
     */
    public static boolean waitForUrlContains(
            WebDriver driver,
            String text) {

        logger.info("Esperando URL que contenga: {}", text);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                ConfigReader.getExplicitWait()));

        return wait.until(
                ExpectedConditions.urlContains(text));

    }

    /**
     * ===========================================================
     * Espera hasta que el título de la página
     * contenga un texto determinado.
     *
     * Puede utilizarse para validar cambios
     * de pantalla durante la navegación.
     * ===========================================================
     *
     * @param driver navegador activo
     * @param text texto esperado
     * @return true cuando el título contiene el texto indicado
     */
    public static boolean waitForTitleContains(
            WebDriver driver,
            String text) {

        logger.info("Esperando título que contenga: {}", text);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(
                                ConfigReader.getExplicitWait()));

        return wait.until(
                ExpectedConditions.titleContains(text));

    }

}