package com.epam.conditions;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month <= 0 || month > 12) System.out.println("invalid date");
        else {
            YearMonth yearMonthObject = YearMonth.of(year, month);

            System.out.println(yearMonthObject.lengthOfMonth());
        }
    }

}
