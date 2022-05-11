package racing.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


class NameTest {

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