package StringAddCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    
    public static int splitAndSum(String text) {
        int result=0;
        if (text == null||text.isEmpty()) {
            return 0;
        }
        if(text.length()==1){
            return Integer.parseInt(text);
        }

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] numbers= m.group(2).split(customDelimiter);
            return add(numbers);
        }

        String[] numbers = text.split(",|:");
        return add(numbers);
    }

    private static int add(String[] tokens){
        int result = 0;
        for(String token:tokens){
            result+= Integer.parseInt(token);
        }
        return result;
    }
}
