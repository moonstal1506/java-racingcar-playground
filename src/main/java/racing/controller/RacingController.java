package racing.controller;

import racing.model.Car;
import racing.model.Racing;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.List;

public class RacingController {
    public void run() {
        List<Car> cars = InputView.inputCarsName();
        int times = InputView.inputTimes();

        Racing racing=new Racing(cars);
        racing.playGame(times);

        ResultView.showHistory(racing);
        ResultView.showWinner(racing);
    }
}
