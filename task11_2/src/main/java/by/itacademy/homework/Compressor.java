package by.itacademy.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compressor {
    public String compressor(String input) {
        String result = "";
        Pattern pattern = Pattern.compile("(.)\\1{0,}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find( )) {
            result += matcher.group(1);
            int length = matcher.group( ).length( );
            if (length > 1)
                result += length;
        }
        return result;
    }
}


