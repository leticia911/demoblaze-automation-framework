package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    private static ExtentReports extent;

    private ExtentManager() {
    }

    public static ExtentReports getInstance() {

        if (extent == null) {

            String timestamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss")
                            .format(new Date());

            String reportPath =
                    "reports/ExtentReport_" + timestamp + ".html";

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(reportPath);

            spark.config().setDocumentTitle("DemoBlaze Automation");

            spark.config().setReportName("Regression Suite");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Framework", "Selenium + TestNG");

            extent.setSystemInfo("Browser", "Chrome");

            extent.setSystemInfo("Environment", "QA");

        }

        return extent;
    }

}