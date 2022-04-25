package calculator;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if(isNullOrEmpty(text)){
            return 0;
        }

        return add(toInts(splitString(text)));

    }

    private static boolean isNullOrEmpty(String text){
        return text==null||text.isEmpty();
    }

    private static String[] splitString(String text){
        return text.split(",");
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
