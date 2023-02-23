package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TodaysUpdatesPage {

    public TodaysUpdatesPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Today's Updates']")
    public WebElement pageTitle;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='0']")
    public WebElement yesRadioButton;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='1']")
    public WebElement noRadioButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save']")
    public WebElement saveButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Updates above to receive updates from your " +
            "classroom teacher.')]")
    public WebElement messageOnCheckingNoButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text,'Update has been disabled from Classroom.')]")
    public WebElement messageOnDisablingTheFeature;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No Updates have been sent by classroom teacher yet.']")
    public WebElement messageForNoUpdates;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Naps']")
    public WebElement napsSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meals']")
    public WebElement mealsSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Diapering/Potty']")
    public WebElement diaperingSection;
}
