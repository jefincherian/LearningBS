package testUtilities;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LoginPage;
import parentapp.Base;
import utilities.Utilities;

import java.io.IOException;

public class TestConfigurations extends Base {
    public AndroidDriver driver;

    @BeforeMethod
    public void setCapabilities() throws IOException, InterruptedException {
        driver = capabilities("ParentApp");
        LoginPage loginPage = new LoginPage(driver);
        Utilities customUtilities = new Utilities(driver);
        customUtilities.waitTillTheClickableElement(loginPage.emailField);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
