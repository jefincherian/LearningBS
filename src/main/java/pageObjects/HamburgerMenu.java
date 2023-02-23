package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HamburgerMenu {

    public HamburgerMenu(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    public WebElement HamburgerMenu;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
    public WebElement studentsDropdown;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout")
    public List<WebElement> studentsListInDropdown;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Messages']")
    public WebElement messages;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[starts-with(@text,'Today')]")
    public WebElement todaysUpdates;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Activity Reports']")
    public WebElement activityReports;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Announcements']")
    public WebElement announcements;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Videos']")
    public WebElement videos;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Photos']")
    public WebElement photos;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='At Drop Off']")
    public WebElement atDropOff;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Meal Calendar']")
    public WebElement mealCalendar;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Mark Absence']")
    public WebElement markAbsence;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Settings']")
    public WebElement settings;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Logout']")
    public WebElement logOut;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']")
    public WebElement header;

    @AndroidFindBy(xpath = "//android.widget.TextView")
    public List<WebElement> textListOnMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'2Automation')]")
    public WebElement noAnnouncementStudent;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'1Automation_Student')]")
    public WebElement defaultStudent;
}
