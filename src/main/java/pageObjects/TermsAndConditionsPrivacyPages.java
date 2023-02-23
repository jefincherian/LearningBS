package pageObjects;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TermsAndConditionsPrivacyPages {

    public TermsAndConditionsPrivacyPages(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions']")
    public WebElement termsAndConditionsWindowTitle;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public WebElement closeIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy']")
    public WebElement privacyWindowTitle;
}
