package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class P1486 {

    public int xorOperation(int n, int start) {
        int answer = start;
        for (int i = 1; i < n; i++) {
            answer ^= start + 2 * i;
        }
        return answer;
    }

    @Test
    @DisplayName("Test Examples")
    void testExamples() {
        assertAll(
            () -> assertThat(xorOperation(5, 0)).isEqualTo(8),
            () -> assertThat(xorOperation(4, 3)).isEqualTo(8),
            () -> assertThat(xorOperation(1, 7)).isEqualTo(7),
            () -> assertThat(xorOperation(10, 5)).isEqualTo(2)
        );
    }
}
