package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/
public class P1480 {

    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i] + answer[i - 1];
        }

        return answer;
    }

    @Test
    @DisplayName("Test Examples")
    void testExamples() {
        assertAll(
            test(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
            test(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
            test(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
        );
    }

    private Executable test(final int[] input, final int[] expected) {
        return () -> assertThat(runningSum(input)).isEqualTo(expected);
    }
}
