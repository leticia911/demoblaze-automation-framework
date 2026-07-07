package driver;

import logging.LogMessages;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final Logger logger =
            LoggerManager.getLogger(DriverManager.class);

    private static final ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    private DriverManager() {
    }

    public static void createDriver() {

        logger.info(LogMessages.DRIVER_CREATED);

        driver.set(
                DriverFactory.getDriver(
                        BrowserManager.getBrowser()));

    }

    public static WebDriver getDriver() {

        return driver.get();

    }

    public static void quitDriver() {

        if (driver.get() != null) {

            logger.info(LogMessages.DRIVER_CLOSED);

            driver.get().quit();

            driver.remove();

        }

    }

}