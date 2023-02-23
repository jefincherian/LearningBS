package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities {

    AndroidDriver driver;

    public Utilities(AndroidDriver driver) {
        this.driver = driver;
    }

//    public void scrollToText(String text) {
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text +
//                "\"));");
//    }

    public void scrollUpToText(String text) {
        Dimension size = driver.manage().window().getSize();
        int endY = (int) (size.height * 0.6);
        int startY = (int) (size.height * 0.40);
        int startX = (size.width / 2);
        int n = 0;
        while (n == 0) {
            new TouchAction(driver).press(PointOption.point(startX, startY))
                                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                                   .moveTo(PointOption.point(startX, endY)).release().perform();
            n = driver.findElements(By.xpath("//android.widget.TextView[@text='" + text + "']")).size();
        }
    }

    public void scrollDownToText(String text) {
        Dimension size = driver.manage().window().getSize();
        int endY = (int) (size.height * 0.4);
        int startY = (int) (size.height * 0.6);
        int startX = (size.width / 2);
        int n = 0;
        while (n == 0) {
            new TouchAction(driver).press(PointOption.point(startX, startY))
                                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                                   .moveTo(PointOption.point(startX, endY)).release().perform();
            n = driver.findElements(By.xpath("//android.widget.TextView[@text='" + text + "']")).size();
        }
    }

    public void removeNotification() {
        Dimension size = driver.manage().window().getSize();
        int endX = (int) (size.width * 0.9);
        int startY = (int) (size.height * 0.05);
        int startX = (int) (size.width * .3);
        new TouchAction(driver).press(PointOption.point(startX, startY))
                               .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                               .moveTo(PointOption.point(endX, startY)).release().perform();
    }

    public void waitTillTheClickableElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitTillTheVisibleElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitTillTheInvisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
