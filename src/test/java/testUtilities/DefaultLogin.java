package testUtilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.*;
import utilities.DateUtilities;
import utilities.Utilities;

import java.util.concurrent.TimeUnit;

public class DefaultLogin {

    AndroidDriver driver;
    Utilities customUtils;
    CalendarWindow calendarWindow;

    public DefaultLogin(AndroidDriver driver) {
        this.driver = driver;
        customUtils = new Utilities(driver);
        calendarWindow = new CalendarWindow(driver);
    }

    public void defaultLoginToPage(String toPage) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailField.sendKeys(System.getenv("PS2ME_Parent_Username"));
        loginPage.passwordField.sendKeys(System.getenv("PS2ME_Parent_Password"));
        loginPage.loginButton.click();
        customUtils.waitTillTheClickableElement(calendarWindow.calendarIcon);
        openPage(toPage);
    }

    public void openPage(String toPage) {
        HamburgerMenu hamburgerMenu = new HamburgerMenu(driver);
        customUtils.waitTillTheClickableElement(hamburgerMenu.HamburgerMenu);
        hamburgerMenu.HamburgerMenu.click();
        //Sometimes the click on the menu will hit on a notification. A check is added to ensure that the menu is open.
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        while (driver.findElements(By.xpath("//android.widget.CheckedTextView[@text='Meal Calendar']")).size() < 1) {
            customUtils.removeNotification();
            hamburgerMenu.HamburgerMenu.click();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        int flag = 0;
       // customUtils.scrollToText(toPage);
        if (toPage.equalsIgnoreCase("Messages")) {
            hamburgerMenu.messages.click();
            MessagesPage messagesPage = new MessagesPage(driver);
            customUtils.waitTillTheClickableElement(messagesPage.messageBox);
        } else if (toPage.equalsIgnoreCase("Today's Updates")) {
            hamburgerMenu.todaysUpdates.click();
            TodaysUpdatesPage todaysUpdatesPage = new TodaysUpdatesPage(driver);
            customUtils.waitTillTheClickableElement(todaysUpdatesPage.yesRadioButton);
        } else if (toPage.equalsIgnoreCase("Activity Reports")) {
            hamburgerMenu.activityReports.click();
            flag = 1;
        } else if (toPage.equalsIgnoreCase("Announcements")) {
            hamburgerMenu.announcements.click();
            AnnouncementsPage announcementsPage = new AnnouncementsPage(driver);
            customUtils.waitTillTheVisibleElement(announcementsPage.pageView);
        } else if (toPage.equalsIgnoreCase("Videos")) {
            hamburgerMenu.videos.click();
            flag = 2;
        } else if (toPage.equalsIgnoreCase("Photos")) {
            hamburgerMenu.photos.click();
            flag = 2;
        } else if (toPage.equalsIgnoreCase("At Drop Off")) {
            hamburgerMenu.atDropOff.click();
            AtDropOffPage atDropOffPage = new AtDropOffPage(driver);
            customUtils.waitTillTheClickableElement(atDropOffPage.lastAteItem);
        } else if (toPage.equalsIgnoreCase("Meal Calendar")) {
            hamburgerMenu.mealCalendar.click();
            flag = 1;
        } else if (toPage.equalsIgnoreCase("Mark Absence")) {
            hamburgerMenu.markAbsence.click();
            MarkAbsencePage markAbsencePage = new MarkAbsencePage(driver);
            customUtils.waitTillTheClickableElement(markAbsencePage.donButton);
        } else if (toPage.equalsIgnoreCase("Settings")) {
            hamburgerMenu.settings.click();
            SettingsPage settingsPage = new SettingsPage(driver);
            customUtils.waitTillTheClickableElement(settingsPage.currentPasswordField);
        } else {
            hamburgerMenu.logOut.click();
            LoginPage loginPage = new LoginPage(driver);
            customUtils.waitTillTheClickableElement(loginPage.loginButton);
        }
        if (flag == 1) {
            customUtils.waitTillTheClickableElement(calendarWindow.calendarIcon);
        }
        if (flag == 2) {
            DateUtilities dateUtilities = new DateUtilities();
            WebElement month =
                    driver.findElement(By.xpath("//android.widget.TextView[@text='" + dateUtilities.getCurrentMonth() + "']"));
            customUtils.waitTillTheVisibleElement(month);
        }
    }

    public void loginToPage(String username, String password, String toPage) {
        LoginPage lp = new LoginPage(driver);
        lp.emailField.sendKeys(username);
        lp.passwordField.sendKeys(password);
        lp.loginButton.click();
        customUtils.waitTillTheClickableElement(calendarWindow.calendarIcon);
        openPage(toPage);
    }

    public void goToPage(String toPage) {
        openPage(toPage);
    }
}
