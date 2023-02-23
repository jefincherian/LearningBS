package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MealCalendarPage {

    public MealCalendarPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meal Calendar']")
    public WebElement pageTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Meal calendar is not available for selected week.']")
    public WebElement noMealCalendarMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Breakfast']")
    public WebElement meal1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Morning Snack']")
    public WebElement meal2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lunch']")
    public WebElement meal3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Afternoon Snack']")
    public WebElement meal4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test 1']")
    public WebElement testData1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test 2']")
    public WebElement testData2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test 3']")
    public WebElement testData3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test 4']")
    public WebElement testData4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test 39, Test 40']")
    public WebElement lastTextInThePage;
}
