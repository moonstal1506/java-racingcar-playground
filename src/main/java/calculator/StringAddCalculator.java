package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if(isNullOrEmpty(text)){
            return 0;
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String[] texts= matcher.group(2).split(customDelimiter);
            return add(toInts((texts)));
        }

        return add(toInts(splitString(text)));

    }

    private static boolean isNullOrEmpty(String text){
        return text==null||text.isEmpty();
    }

    private static String[] splitString(String text){
        return text.split(",|:");
    }

    private static int[] toInts(String[] texts){
        int[] numbers=new int[texts.length];
        for(int i=0;i<texts.length;i++){
           numbers[i]= Integer.parseInt(texts[i]);
        }
        return numbers;
    }

    private static int add(int[] numbers){
        int result=0;
        for(int number: numbers ){
            result+=number;
        }
        return result;
    }

}
