package reporting;

import com.aventstack.extentreports.Status;

public class ReportManager {

    private ReportManager() {
    }

    public static void info(String message) {
        System.out.println("REPORT INFO: " + message);
        ExtentTestManager
                .getTest()
                .log(Status.INFO, message);

    }

    public static void pass(String message) {
        System.out.println("REPORT PASS: " + message);
        ExtentTestManager
                .getTest()
                .log(Status.PASS, message);

    }

    public static void fail(String message) {

        ExtentTestManager
                .getTest()
                .log(Status.FAIL, message);

    }

    public static void warning(String message) {

        ExtentTestManager
                .getTest()
                .log(Status.WARNING, message);

    }


}