package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import parentapp.Base;

import java.io.File;
import java.util.Base64;

public class CaptureScreenshot extends Base {

    public static String getBase64Image(String testcase) throws Exception { // The mechanism to take screenshot
        File scrFile = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.FILE);
        String fileDestination = System.getProperty("user.dir") + "\\TestFailure_Screens\\" + testcase + ".png";
        FileUtils.copyFile(scrFile, new File(fileDestination));
        // Resizing the captured image
        ResizeImage image = new ResizeImage();
        image.resizeImage(fileDestination);
        // Converting resized image to Base64
        byte[] fileContent = FileUtils.readFileToByteArray(new File(fileDestination));
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public static String getScreenshotPath(String testcase) throws Exception { // The mechanism to take screenshot
        File scrFile = ((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.FILE);
        String fileDestination = System.getProperty("user.dir") + "\\TestFailure_Screens\\" + testcase + ".png";
        FileUtils.copyFile(scrFile, new File(fileDestination));
        // Resizing the captured image
        ResizeImage image = new ResizeImage();
        image.resizeImage(fileDestination);
        return fileDestination;
    }
}
