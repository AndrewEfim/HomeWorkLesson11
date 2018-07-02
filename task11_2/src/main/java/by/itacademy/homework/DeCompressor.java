package by.itacademy.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeCompressor {

    public String deCompressor(String input){
        Pattern pattern = Pattern.compile("([a-z])(\\d)");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            String group = matcher.group();
            String count = Character.toString(group.charAt(0));
            int value = Integer.parseInt(group.substring(1));
            String duplicat = "";
            for (int i = 0; i<value -1; i++){
                duplicat+=count;
            }
            input = input.replaceFirst(group,group.substring(0,1)+duplicat);
        }
        return input;
    }
}
