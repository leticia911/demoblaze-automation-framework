package tests.listeners;

import driver.DriverManager;
import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    private static final Logger logger =
            LoggerManager.getLogger(TestListener.class);

    @Override
    public void onTestFailure(ITestResult result) {

        logger.error(
                "TEST FALLÓ: {}",
                result.getName());

        String path =
                ScreenshotUtils.capture(
                        DriverManager.getDriver(),
                        result.getName());

        logger.error(
                "Screenshot guardado en: {}",
                path);
    }
}