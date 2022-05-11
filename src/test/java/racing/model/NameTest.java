package racing.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class NameTest {

    @Test
    void 이름생성() {
        Name name = new Name("car");
        assertThat(name.getName()).isEqualTo("car");
    }

    @Test
    void 이름공백예외() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Name("");
        });
    }

    @Test
    void 이름null예외() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Name(null);
        });
    }

    @Test
    void 이름5자이상예외() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Name("123456");
        });
    }
}