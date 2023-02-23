package utilities;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateUtilities {

    public String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }

    public String getDateWithHyphen() {
        String[] arr = getCurrentDate().split("/", 3);
        String dateInRequiredFormat = arr[0] + "-" + arr[1] + "-" + arr[2];
        return dateInRequiredFormat;
    }

    public String getDateToRecallReport() {
        String[] arr = getCurrentDate().split("/", 3);
        String dateInRequiredFormat = arr[2] + "-" + arr[0] + "-" + arr[1];
        return dateInRequiredFormat;
    }

    public String getCurrentDayNumber() {
        String[] arr = getCurrentDate().split("/", 3);
        return arr[1];
    }

    public String getCurrentMonthNumber() {
        String[] arr = getCurrentDate().split("/", 3);
        return arr[0];
    }

    public String getCurrentMonth() {
        int currentMonthNumber = Integer.parseInt(getCurrentMonthNumber());
        return getMonth(currentMonthNumber);
    }

    public String getCurrentYear() {
        String[] arr = getCurrentDate().split("/", 3);
        return arr[2];
    }

    public String getNextMonday() {
        LocalDate ld = LocalDate.of(Integer.parseInt(getCurrentYear()), Integer.parseInt(getCurrentMonthNumber()),
                Integer.parseInt(getCurrentDayNumber()));
        LocalDate nextMonday = ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        String FutureDate = nextMonday.toString();
        // Converting date to required format
        String[] arr = FutureDate.split("-", 3);
        String dateInRequiredFormat = arr[1] + "-" + arr[2] + "-" + arr[0];
        return dateInRequiredFormat;
    }

    public String getMonth(int monthNumber) {
        String month = Month.of(monthNumber).toString().toLowerCase();
        return month.substring(0, 1).toUpperCase() + month.substring(1);
    }

    public int getMonthNumber(String month) {
        int monthNumber = Month.valueOf(month.toUpperCase()).getValue();
        return monthNumber;
    }

    public int getWeekDayNumber() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
        String dayOfWeek = dateFormat.format(date);
        int weekDayNumber = 0;
        switch (dayOfWeek) {
            case "Monday":
                weekDayNumber = 1;
                break;
            case "Tuesday":
                weekDayNumber = 2;
                break;
            case "Wednesday":
                weekDayNumber = 3;
                break;
            case "Thursday":
                weekDayNumber = 4;
                break;
            case "Friday":
                weekDayNumber = 5;
                break;
            case "Saturday":
                weekDayNumber = 6;
                break;
            case "Sunday":
                weekDayNumber = 7;
                break;
        }
        return weekDayNumber;
    }
}
