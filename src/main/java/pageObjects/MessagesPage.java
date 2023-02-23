package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagesPage {

    public MessagesPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[starts-with(@text,'Type a message')]")
    public WebElement messageBox;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND']")
    public WebElement sendButton;

    @AndroidFindBy(xpath = "//android.widget.TextView")
    public List<WebElement> allMessages;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public List<WebElement> allStatusimages;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    public WebElement deleteConfirmationYes;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter your message']")
    public WebElement snackBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='- There are no messages in this conversation -']")
    public WebElement noMessageText;
}
