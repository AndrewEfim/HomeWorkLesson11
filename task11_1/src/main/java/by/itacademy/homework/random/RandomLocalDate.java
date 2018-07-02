package by.itacademy.homework.random;

import java.time.LocalDate;
import java.util.Random;

public class RandomLocalDate {

    Random random = new Random();

    public LocalDate execute() {
        return randomDate( );
    }

    private LocalDate randomDate() {
        int year = random.nextInt(40);
        int month = random.nextInt(11)+1;
        int day;
        if (year % 4 == 0 && month == 2)
            day = random.nextInt(28)+1;
        else if (month == 2)
            day = random.nextInt(27)+1;
        else if (month != 4 || month != 6 || month != 9 || month != 11)
            day = random.nextInt(30)+1;
        else
            day = random.nextInt(29)+1;
        return LocalDate.of(year+1900, month, day);
    }

}
