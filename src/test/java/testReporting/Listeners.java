package testReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.CaptureScreenshot;

public class Listeners extends CaptureScreenshot implements ITestListener {

    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.generateReport();

    @Override
    public void onTestStart(ITestResult result) {
        String testcaseName = (result.getName()).substring(0, 1).toUpperCase() + (result.getName()).substring(1);
        test = extent.createTest(testcaseName); //Assign device here
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String details = "Test Passed! ";
        test.log(Status.PASS, details);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

            test.skip(result.getThrowable());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testcaseName = (result.getName()).substring(0, 1).toUpperCase() + (result.getName()).substring(1);
        try {
            // test.addScreenCaptureFromPath(getScreenshotPath(testcaseName), testcaseName +" - Failure Screen");
            test.addScreenCaptureFromBase64String(getBase64Image(testcaseName), testcaseName + " - Failure Screen");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

            test.fail(result.getThrowable()); // Print the error on the report

    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
