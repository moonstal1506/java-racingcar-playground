package StringAddCalculator;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        int result=0;
        if (text == null||text.isEmpty()) {
            return 0;
        }
        result = Integer.parseInt(text);
        return result;
    }
}
