package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    public WebElement emailField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter password']")
    public WebElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Remember me']")
    public WebElement rememberMeCheckBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forgot your password?']")
    public WebElement forgotYourPassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions']")
    public WebElement TermsAndConditions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy']")
    public WebElement Privacy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter your email']")
    public WebElement userNameErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter your password']")
    public WebElement passwordErrorMessage;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    public WebElement toastMessageLoginPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='You have entered incorrect email or password.']")
    public WebElement snackBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Version')]")
    public WebElement version;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Preschool2me')]")
    public WebElement preschool2meTextOnFooter;
}
