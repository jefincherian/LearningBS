package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordWindow {

    public ForgotPasswordWindow(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter email']")
    public WebElement emailField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public WebElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Close']")
    public WebElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forgot password']")
    public WebElement windowTitle;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public WebElement closeIcon;

    @AndroidFindBy(xpath =
            "//android.widget.TextView[@text='To retrieve your password, please enter your email here" + ".']")
    public WebElement emailFieldHeading;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    public WebElement toastMessageForgotPassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter your email']")
    public WebElement validationMessageForBlankUserName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a valid email address']")
    public WebElement validationMessageForInvalidEmail;
}
