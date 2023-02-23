package pageObjects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

    public SettingsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public WebElement pageTitle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter your current password']")
    public WebElement currentPasswordField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter your new password']")
    public WebElement newPasswordField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Confirm your new password']")
    public WebElement confirmNewPasswordField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public WebElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Password has been')]")
    public WebElement successSnackbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'You have provided')]")
    public WebElement errorSnackbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter at least 6 characters']")
    public WebElement sixDigitValidation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This field is required']")
    public WebElement fieldRequiredValidation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Passwords do not match']")
    public WebElement passwordMismatchValidation;
}
