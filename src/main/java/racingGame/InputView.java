package racingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public List<Car> gameStart() {
        return createCars(splitCarNames(enterName()));
    }

    public String enterName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.next();
        return carNames;
    }

    public String[] splitCarNames(String carNames) {
        return carNames.split(",");
    }

    public List<Car> createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
        return cars;
    }

    public int enterTryNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
