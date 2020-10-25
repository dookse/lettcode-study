package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

// 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class P1512 {

    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    @Test
    @DisplayName("Test Examples")
    void testExamples() {
        assertAll(
            test(new int[]{1, 2, 3, 1, 1, 3}, 4),
            test(new int[]{1, 1, 1, 1}, 6),
            test(new int[]{1, 2, 3}, 0)
        );
    }

    private Executable test(int[] input, int expected) {
        return () -> assertThat(numIdenticalPairs(input)).isEqualTo(expected);
    }
}
