package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CalendarWindow {

    public CalendarWindow(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='1']")
    public WebElement calendarIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    public WebElement yearDisplayed;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement cancelButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='1']")
    public WebElement previousMonth;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='2']")
    public WebElement nextMonth;

    @AndroidFindBy(xpath = "//android.view.View[@index='16']")
    public WebElement day;
}
