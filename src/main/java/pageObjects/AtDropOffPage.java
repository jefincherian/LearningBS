package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AtDropOffPage {

    public AtDropOffPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='At Drop Off']")
    public WebElement PageTitle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
    public WebElement lastAteItem;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
    public WebElement lastAteTime;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='6']")
    public WebElement lastDiaperChangeTime;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='7']")
    public WebElement toggleSwitch1;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='2']")
    public WebElement toggleSwitch2;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='4']")
    public WebElement toggleSwitch3;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='6']")
    public WebElement toggleSwitch4;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='8']")
    public WebElement toggleSwitch5;

    @AndroidFindBy(xpath = "//android.widget.Switch[@index='10']")
    public WebElement toggleSwitch6;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Last Night']")
    public WebElement lastNightSection;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public WebElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='AM']")
    public WebElement amButtonOnClock;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement okButtonOnClock;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement cancelButtonOnClock;

    @AndroidFindBy(xpath = "//*[@content-desc='6']")
    public WebElement setHourSix;

    @AndroidFindBy(xpath = "//*[@content-desc='10']")
    public WebElement setMinuteTen;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement confirmationWindowYes;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'This will save')]")
    public WebElement confirmationWindowText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='At drop off saved successfully.']")
    public WebElement successSnackbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Child check-in is already marked')]")
    public WebElement errorSnackbarForCheckIn;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'An absence is already marked')]")
    public WebElement errorSnackbarForAbsence;
}
