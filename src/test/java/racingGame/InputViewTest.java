package racingGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    InputView inputView = new InputView();

    @Test
    void 이름분리() {
        String[] names=inputView.splitCarNames("qwr,asf,zxv");
        assertThat(names).contains("qwr");
    }
}