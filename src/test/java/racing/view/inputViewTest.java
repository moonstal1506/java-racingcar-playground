package racing.view;

import org.junit.jupiter.api.Test;
import racing.model.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class inputViewTest {

    @Test
    void 자동차생성() {
        List<Car> cars = InputView.inputCarsName("pobi,crong,honux");
        assertThat(cars.size()).isEqualTo(3);
    }
}