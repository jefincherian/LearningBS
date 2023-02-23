package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AnnouncementsPage {

    public AnnouncementsPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Announcements']")
    public WebElement pageTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='445yjfguf678865hfggfhfdyydt543597700312dggfhihguyidxg']")
    public WebElement expectedAnnouncementTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jul 23, 2022 02:35 PM']")
    public WebElement expectedAnnouncementTime;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='gjhvggxsrdrawqwr65644524gchcvjbkhjljijbj67354242jgvhffyf"
            + "']")
    public WebElement expectedAnnouncementContent;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Announcement is not available.']")
    public WebElement messageForNoAnnouncement;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='1']")
    public WebElement pageView;
}
