package testReporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utilities.GlobalProperties;

import java.io.IOException;

public class ExtentReporterNG {

    static ExtentReports extent;

    public static ExtentReports generateReport() {
        String path = System.getProperty("user.dir") + "\\Reports\\PS2ME_ParentPro.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        GlobalProperties prop = new GlobalProperties();
        try {
            reporter.config()
                    .setReportName("Automation Test Results - PS2ME_ParentPro Vesrion " + prop.properties("version"));
        } catch (IOException e) {
        }
        reporter.config().setDocumentTitle("PS2ME_ParentPro - Test Results");
        // reporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        //extent.setSystemInfo("Tester", "Tester name");
        return extent;
    }
}