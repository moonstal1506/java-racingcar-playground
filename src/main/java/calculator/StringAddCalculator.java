package calculator;

public class StringAddCalculator {
    public static int splitAndSum(String number) {
        if(isNullOrEmpty(number)){
            return 0;
        }
        return 0;
    }

    private static boolean isNullOrEmpty(String number){
        return number==null||number.isEmpty();
    }

}
