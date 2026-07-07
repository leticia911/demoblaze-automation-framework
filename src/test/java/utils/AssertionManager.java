package utils;

import org.testng.Assert;
import reporting.ReportManager;

public final class AssertionManager {

    private AssertionManager() {
    }

    public static void assertTrue(boolean condition, String message) {

        if (condition) {

            ReportManager.pass(message);

        } else {

            ReportManager.fail(message);

        }

        Assert.assertTrue(condition, message);

    }

    public static void assertFalse(boolean condition, String message) {

        if (!condition) {

            ReportManager.pass(message);

        } else {

            ReportManager.fail(message);

        }

        Assert.assertFalse(condition, message);

    }

    public static void assertEquals(
            Object actual,
            Object expected,
            String message) {

        if (actual.equals(expected)) {

            ReportManager.pass(message);

        } else {

            ReportManager.fail(
                    message +
                            "\nEsperado: " + expected +
                            "\nActual: " + actual);

        }

        Assert.assertEquals(actual, expected, message);

    }

}