package racing.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void 자동차전진() {
        Position position= new Position();
        assertThat(position.move()).isEqualTo(1);
    }
}