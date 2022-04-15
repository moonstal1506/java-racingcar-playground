package racingGame;

import java.util.ArrayList;
import java.util.List;

public class Result {

    List<String> winners=new ArrayList<>();

    public void pickWinners(List<Car> cars) {
        for (Car car : cars) {
            if (Car.maxPosition==car.getPosition()){
                winners.add(car.getName());
            }
        }
    }

    public void printWinners(){
        System.out.println("우승자: "+winners);
    }
}
