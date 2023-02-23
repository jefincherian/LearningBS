package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MarkAbsencePage {

    public MarkAbsencePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Out Sick']")
    public WebElement outSickButton;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Planned Absence']")
    public WebElement plannedAbsenceButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public WebElement donButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    public WebElement yesOption;

    @AndroidFindBy(xpath = "//*[starts-with(@text,'Planned absence marked for child')]")
    public WebElement plannedAbsenceMessage;

    @AndroidFindBy(xpath = "//*[starts-with(@text,'Out sick marked for child')]")
    public WebElement outSickMessage;

    @AndroidFindBy(xpath = "//*[starts-with(@text,'Sorry. You cannot mark absence for old dates')]")
    public WebElement errorSnackbar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No history found.']")
    public WebElement messageForNoHistory;
}
