package test.com.javaSE1.fourthUnit;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
//        LocalDate date = LocalDate.of(2022,2,1);
        int month = date.getMonthValue();
        System.out.println("month = " + month);
        int today = date.getDayOfMonth();
        System.out.println("today = " + today);

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println("weekday = " + weekday);
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();

        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }


}
