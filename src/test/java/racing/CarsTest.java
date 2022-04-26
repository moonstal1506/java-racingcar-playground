package racing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    void 자동차이름쉼표구분(){
        Cars cars = new Cars("a,b,c");
        assertThat(cars.getCars().size()).isEqualTo(3);
    }

    @Test
    void 자동차위치(){
        Car car = new Car("car");
        car.move();
        assertThat(car.StringPosition()).isEqualTo("car: -");
    }
}