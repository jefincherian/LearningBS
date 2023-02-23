package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityReportsPage {

    public ActivityReportsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Activity Reports']")
    public WebElement ActivityReportsHeading;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Report is not available for selected date.']")
    public WebElement messageForNoActivityReportsForASelectedDate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Report is not available.']")
    public WebElement messageForNoActivityReports;

    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    public List<WebElement> headerIcons;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    public List<WebElement> downloadButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Downloading')]")
    public WebElement downloadingIndicator;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Download successful!')]")
    public WebElement snackBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Diapering/Potty']")
    public WebElement diapering;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
    public WebElement diaperingSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='3']")
    public WebElement naps;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='4']")
    public WebElement napsSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='6']")
    public WebElement meals;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='7']")
    public WebElement mealsSection;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Afternoon Snack']")
    public WebElement afternoonSnack;
}
