package tricks.java.good.practices.parameters.checker;

import java.util.Objects;

public class Date {
    int day;
    int month;
    int year;

    Weekday weekday;

    public Date(int day, int month, int year, Weekday weekday) {
        this.day = day;
        this.month = day;
        this.year = year;
        this.weekday = Objects.requireNonNull(weekday, "day of the week cannot be null");
    }

    /**
     * Set the day of the month
     * @param day is the day of the month. This must be between 1 and 31
     * @throws IllegalArgumentException if day is less than 1 or greater than 31
     */
    public void setDay(int day) {
        if (day <1 || day > 31){
            throw new IllegalArgumentException("Day: " + day + " The day must be between 1 and 31");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDiaDeLaSemana(Weekday weekday) {
        this.weekday = weekday;
    }
}
