package retry;

import logging.LoggerManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private static final Logger logger =
            LoggerManager.getLogger(RetryAnalyzer.class);

    private int retryCount = 0;

    private static final int MAX_RETRY = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (retryCount < MAX_RETRY) {

            retryCount++;

            logger.warn(
                    "Reintentando test: {} - intento {}",
                    result.getName(),
                    retryCount);

            return true;
        }

        return false;
    }
}