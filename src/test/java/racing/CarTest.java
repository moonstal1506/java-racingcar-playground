package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차위치(){
        Car car = new Car("car");
        car.move();
        assertThat(car.StringPosition()).isEqualTo("car: -");
    }
}