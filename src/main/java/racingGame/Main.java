package racingGame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        Racing racing = new Racing();

        List<Car> cars = inputView.gameStart();
        int tryNumber = inputView.enterTryNumber();

        for(int i=0;i<tryNumber;i++){
            for(Car car:cars){
                racing.isMoveable(car,racing.makeRandomNumber());
                System.out.print(car.getName()+":");
                racing.printPosition(car);
            }
            System.out.println();
        }

        Result result= new Result();
        result.pickWinners(cars);
        result.printWinners();

    }
}
