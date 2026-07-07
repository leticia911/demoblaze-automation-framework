package actions;

import logging.LogMessages;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.ReportManager;
import utils.WaitUtils;

public class UIActions {

    private final WebDriver driver;

    private static final Logger logger =
            LoggerManager.getLogger(UIActions.class);

    public UIActions(WebDriver driver) {

        this.driver = driver;

    }

    public void click(By locator) {

        logger.info(LogMessages.CLICK + locator);

        ReportManager.info(
                "Click sobre elemento: " + locator);

        WaitUtils
                .waitForClickable(driver, locator)
                .click();

    }

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

    public String getText(By locator) {

        logger.info("Leyendo texto de: " + locator);

        ReportManager.info(
                "Leyendo texto de: " + locator);

        return WaitUtils
                .waitForVisibility(driver, locator)
                .getText();

    }

    public boolean isDisplayed(By locator) {

        logger.info("Verificando visibilidad de: " + locator);

        ReportManager.info(
                "Verificando visibilidad de: " + locator);

        return WaitUtils
                .waitForVisibility(driver, locator)
                .isDisplayed();

    }

}