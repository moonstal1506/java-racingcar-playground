package racing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private static final int MOVE_POSSIBLE_NUMBER = 4;
    private static final String ENTER = "\n";
    private static final String DELIMITER = ",";
    private final int RANDOM_BOUND = 10;
    private Random random = new Random();
    private int maxPosition = Integer.MIN_VALUE;
    private String  history ="";
    private List<Car> cars;
    private List<String> winners=new ArrayList<>();

    public Racing() {
    }

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void playGame(int times) {
        for (int i = 0; i < times; i++) {
            playGame();
        }
        pickWinner();
    }

    private void playGame() {
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, moveCar(car, randomNumber()));
            history+= car.status()+ ENTER;
        }
        history+=ENTER;
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

    public String getHistory(){
        return history;
    }

    private void pickWinner(){
        for(Car car : cars){
            isWinner(car);
        }
    }
    private void isWinner(Car car) {
        if(car.getPosition()==maxPosition){
            winners.add(car.getName());
        }
    }

    public String getWinnersName() {
        return String.join(DELIMITER, winners);
    }
}
