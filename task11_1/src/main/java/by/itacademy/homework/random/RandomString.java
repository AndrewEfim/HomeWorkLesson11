package by.itacademy.homework.random;

import java.util.Random;

public class RandomString {

    Random random = new Random( );
    String names[] = {"Metallica", "Pantera", "Deep Purple", "Alcatraz",
            "Accept", "Dio", "Black Sabbath",
            "Pink Floyd", "Rage", "Jorn", "Alter Bridge",
            "Fuel", "Scorpions", "Gamma Ray", "Machine Head",
            "Chelsea", "Man Utd", "Totenhem", "Arsenal",
            "BlackburnRovers", "Man City", "Liverpool",
            "Watford", "Burnly", "Lecister", "Everton",
            "Fulham", "Brighton", "West Ham", "Cardiff"};

    public String execute() {
        return randomString( );
    }

    private String randomString() {
        String result = "";
        int i = random.nextInt(names.length);
        result += String.valueOf(names[i]);
        return result;
    }
}
