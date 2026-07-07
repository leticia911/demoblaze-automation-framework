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

public class WaitUtils {

    private static final Logger logger =
            LoggerManager.getLogger(WaitUtils.class);

    private WaitUtils() {
    }

    /**
     * Espera hasta que exista al menos un elemento.
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
     * Espera hasta que el elemento sea visible.
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
     * Espera hasta que el elemento sea clickeable.
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
     * Espera hasta que la URL contenga un texto determinado.
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

}