package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String actual = "1,2";
        String[] split = actual.split(",");
        assertThat(split[0]).contains("1");
    }

    @Test
    void subString() {
        String actual = "(1,2)";
        String substring = actual.substring(actual.indexOf("(") + 1, actual.indexOf(")"));
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        String actual = "1,2,3";
        assertThatThrownBy(() -> {
            actual.charAt(actual.length() + 1);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
