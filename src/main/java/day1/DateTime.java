package day1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int second = now.get(ChronoField.SECOND_OF_DAY);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        if (hour > 12) {
            System.out.println("Доброе утро!");
        } else if (hour < 17) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }

        System.out.print("Время "
                + hour + ":"
                + minute + ":"
                + second + " ");
        System.out.print(" " + month + " ");
        switch (month) {
            case 1:
                System.out.print("JANUARY ");
                break;
            case 2:
                System.out.print("FEBRUARY ");
                break;
            case 3:
                System.out.print("MARCH ");
                break;
            case 4:
                System.out.print("APRIL ");
                break;
            case 5:
                System.out.print("MAY ");
                break;
            case 6:
                System.out.print("JUNE ");
                break;
            case 7:
                System.out.print("JULY ");
                break;
            case 8:
                System.out.print("AUGUST ");
                break;
            case 9:
                System.out.print("SEPTEMBER ");
                break;
            case 10:
                System.out.print("OCTOBER ");
                break;
            case 11:
                System.out.print("NOVEMBER ");
                break;
            case 12:
                System.out.print("DECEMBER ");
                break;
        }
        System.out.print(year);
        //System.out.println((hour != 1 && hour != 21) ? " часа(часов)" : " час");

    }
}
