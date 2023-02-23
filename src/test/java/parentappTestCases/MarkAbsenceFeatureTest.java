package parentappTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.CalendarWindow;
import pageObjects.MarkAbsencePage;
import testUtilities.DefaultLogin;
import testUtilities.TestConfigurations_ClassLevel;
import utilities.Utilities;

public class MarkAbsenceFeatureTest extends TestConfigurations_ClassLevel {

    DefaultLogin login;
    MarkAbsencePage markAbsencePage;
    CalendarWindow calendarWindow;
    Utilities customUtilities;

    @BeforeClass
    public void beforeClass(){
        login = new DefaultLogin(driver);
        markAbsencePage = new MarkAbsencePage(driver);
        calendarWindow = new CalendarWindow(driver);
        customUtilities = new Utilities(driver);
        login.defaultLoginToPage("Mark Absence");
    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() throws InterruptedException {
        login.goToPage("Mark Absence");
    }

//    @Test(priority = -1)
//    public void verifyPageUIWhenNoAbsenceHistoryPresent() throws InterruptedException {
//        login.goToPage("Mark Absence");
//        Assert.assertTrue(markAbsencePage.messageForNoHistory.isDisplayed());
//    }
//
//    @Test(groups = {"smoke"})
//    public void markingPlannedAbsence() throws IOException {
//        markAbsencePage.plannedAbsenceButton.click();
//        markAbsencePage.donButton.click();
//        markAbsencePage.yesOption.click();
//        Assert.assertTrue(markAbsencePage.plannedAbsenceMessage.isDisplayed());
//        teacherApp.deleteAbsence(dateUtilities.getCurrentDate());
//    }
//
//    @Test(groups = {"smoke"})
//    public void markingOutSick() throws IOException {
//        markAbsencePage.outSickButton.click();
//        markAbsencePage.donButton.click();
//        markAbsencePage.yesOption.click();
//        Assert.assertTrue(markAbsencePage.outSickMessage.isDisplayed());
//        teacherApp.deleteAbsence(dateUtilities.getCurrentDate());
//    }
//
//    @Test
//    public void markingAbsenceForAFutureDate() throws IOException {
//        String nextMonday = dateUtilities.getNextMonday();
//        String[] arr = nextMonday.split("-", 3);
//        calendar.goToDate(Integer.parseInt(arr[1]), Integer.parseInt(arr[0]), Integer.parseInt(arr[2]));
//        String futureDate = arr[0] + "/" + arr[1] + "/" + arr[2];
//        markAbsencePage.donButton.click();
//        markAbsencePage.yesOption.click();
//        teacherApp.deleteAbsence(futureDate); // Deleting the entry
//        Assert.assertTrue(markAbsencePage.plannedAbsenceMessage.isDisplayed());
//    }

    @Test
    public void markingAbsenceForAPreviousDate() {
        calendarWindow.calendarIcon.click();
        calendarWindow.previousMonth.click();
        calendarWindow.day.click();
        calendarWindow.okButton.click();
        markAbsencePage.donButton.click();
        markAbsencePage.yesOption.click();
        customUtilities.waitTillTheVisibleElement(markAbsencePage.errorSnackbar);
        Assert.assertTrue(markAbsencePage.errorSnackbar.isDisplayed());
    }
}
