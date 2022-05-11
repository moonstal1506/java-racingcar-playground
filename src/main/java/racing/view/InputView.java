package racing.view;

import racing.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String CAR_DELIMITER = ",";
    private static final String ENTER_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    static Scanner scanner =new Scanner(System.in);

    public static List<Car> input(){
        System.out.println(ENTER_CAR_NAME);
        return input(scanner.nextLine());
    }

    public static List<Car> input(String input){
        return generateCars(input);
    }

    private static List<Car> generateCars(String input) {
        String[] inputCars = input.split(CAR_DELIMITER);
        return Arrays.stream(inputCars).map(Car::new).collect(Collectors.toList());
    }
}
