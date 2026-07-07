package base;

import config.ConfigReader;
import driver.DriverManager;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reporting.ExtentReportListener;
import tests.listeners.TestListener;
import org.testng.annotations.Listeners;


@Listeners({
        TestListener.class,
        ExtentReportListener.class
})
public class BaseTest {


    protected WebDriver driver;

    // ← AQUÍ VA EL LOGGER
    private static final Logger logger =
            LoggerManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setup() {

        logger.info("========== Inicio del Test ==========");

        DriverManager.createDriver();

        driver = DriverManager.getDriver();

        driver.get(ConfigReader.getBaseUrl());

    }

    @AfterMethod
    public void tearDown() {

        DriverManager.quitDriver();

        logger.info("========== Fin del Test ==========");

    }

}