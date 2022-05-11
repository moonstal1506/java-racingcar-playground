package racing.view;

import org.junit.jupiter.api.Test;
import racing.model.Car;
import racing.model.Name;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class inputViewTest {

    @Test
    void 자동차생성() {
        List<Car> cars = InputView.input("pobi,crong,honux");
        assertThat(cars.size()).isEqualTo(3);
    }
}