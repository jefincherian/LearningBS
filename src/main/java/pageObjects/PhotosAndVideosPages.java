package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PhotosAndVideosPages {

    public PhotosAndVideosPages(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Photos']")
    public WebElement photosPageTitle;

    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    public List<WebElement> headerIcons;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    public List<WebElement> current;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    public List<WebElement> previous;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
    public List<WebElement> next;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement cancelButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    public List<WebElement> thumbnails;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    public WebElement closeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Automation Note')]")
    public WebElement requiredImageNote;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    public WebElement imagePreview;

    @AndroidFindBy(xpath = "//android.widget.TextView")
    public WebElement studentNameOnPreviewWindow;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Multiple P+ Note']")
    public WebElement imageNote;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Learning Domain:')]")
    public WebElement learningDomain;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='1']")
    public List<WebElement> individualDownloadButtons;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Downloading')]")
    public WebElement downloadingIndicator;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Your files are being zipped.')]")
    public WebElement zippingIndicator;

    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Download successful!')]")
    public WebElement snackBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Photos are not available for selected month.']")
    public WebElement messageForNoImages;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Videos']")
    public WebElement videosPageTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Video note!']")
    public WebElement videoNote;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='0']")
    public WebElement videoPreview;

    @AndroidFindBy(xpath = "//android.widget.SeekBar")
    public WebElement seekbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Videos are not available for selected month.']")
    public WebElement messageForNoVideos;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Automation Note')]")
    public WebElement requiredVideoNote;
}
