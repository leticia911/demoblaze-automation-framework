package reporting;

import com.aventstack.extentreports.Status;
import driver.DriverManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class ExtentReportListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentManager.getInstance();

    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTestManager.setTest(

                ExtentManager.getInstance()
                        .createTest(result.getMethod().getMethodName())

        );

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager.getTest()
                .log(Status.PASS, "Test ejecutado correctamente.");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        String screenshot = ScreenshotUtils.capture(
                DriverManager.getDriver(),
                result.getName());

        ExtentTestManager.getTest()
                .log(Status.FAIL, result.getThrowable());

        if (screenshot != null) {

            ExtentTestManager.getTest()
                    .addScreenCaptureFromPath(screenshot);

        }

    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager.getInstance().flush();

        ExtentTestManager.unload();

    }

}