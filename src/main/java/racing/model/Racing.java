package racing.model;

import java.util.List;
import java.util.Random;

public class Racing {

    private static final int MOVE_POSSIBLE_NUMBER = 4;
    private final int RANDOM_BOUND = 10;
    private Random random = new Random();
    private int maxPosition = Integer.MIN_VALUE;

    public void playGame(List<Car> cars, int times) {
        for (int i = 0; i < times; i++) {
            playGame(cars);
        }
    }

    public void playGame(List<Car> cars) {
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, moveCar(car, randomNumber()));
        }
    }

    private int randomNumber() {
        return random.nextInt(RANDOM_BOUND);
    }

    public int moveCar(Car car, int number) {
        int position = 0;
        if (isMovable(number)) {
            position = car.move();
        }
        return position;
    }

    private boolean isMovable(int number) {
        return number >= MOVE_POSSIBLE_NUMBER;
    }


}
