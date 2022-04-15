package racingGame;

import StringAddCalculator.StringAddCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void 이름생성() throws Exception {
        Car car= new Car("a");
        assertThat(car).isEqualTo(new Car("a"));
    }

}