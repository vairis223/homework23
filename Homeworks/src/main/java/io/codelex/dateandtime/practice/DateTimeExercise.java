package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        LocalDate nextFriday13th = from.plusMonths(1).withDayOfMonth(13);
        while (nextFriday13th.getDayOfWeek() != DayOfWeek.FRIDAY) {
            nextFriday13th = nextFriday13th.plusMonths(1);
        }
        return nextFriday13th;
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextFriday13th = DateTimeExercise.findNextFriday13th(today);

        System.out.println("Next Friday the 13th " + nextFriday13th);
    }
}

