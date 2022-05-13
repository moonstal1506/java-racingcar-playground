package racing.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingTest {

    @Test
    void 자동차4이상전진() {
        Racing racing = new Racing();
        int position=racing.moveCar(new Car("car"),4);
        assertThat(position).isEqualTo(1);
    }

    @Test
    void 자동차3전진안함() {
        Racing racing = new Racing();
        int position=racing.moveCar(new Car("car"),3);
        assertThat(position).isEqualTo(0);
    }

}