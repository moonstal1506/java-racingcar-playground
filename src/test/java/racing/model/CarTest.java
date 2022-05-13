package racing.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차전진상태출력() {
        Car car = new Car("car");
        car.move();
        assertThat(car.status()).isEqualTo("car : -");
    }
}