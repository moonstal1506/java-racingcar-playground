package StringAddCalculator;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        int result=0;
        if (text == null||text.isEmpty()) {
            return 0;
        }
        if(text.length()==1){
            result = Integer.parseInt(text);
        }

        String[] numbers = text.split(",");
        for(String number:numbers){
            result+=Integer.parseInt(number);
        }
        return result;
    }
}
