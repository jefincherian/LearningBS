package parentapp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.GlobalProperties;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {

    public static AppiumDriverLocalService service;
    public static AndroidDriver androidDriver;
    public static DesiredCapabilities cap;
    public static boolean useCloud = false;
    public static String testClassName;
    public static boolean noResetValue = false;

    public static AndroidDriver capabilities(String appName) throws IOException, InterruptedException {
        GlobalProperties prop = new GlobalProperties();
        //Looking for the specified device
        String device = System.getProperty("device") != null ? System.getProperty("device") : prop.properties("device");
        System.out.println("Device used is " + device);
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 40);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability("autoGrantPermissions", true);
        System.out.println("Using local machine");
        File appDir = new File("src");
        File app = new File(appDir, prop.properties(appName));
        device = device.toLowerCase();
        if (device.contains("emulator")) {
            Emulators.startEmulator(device);
            System.out.println("Emulator started successfully on the machine");
        }
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        //cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return androidDriver;
    }
}
