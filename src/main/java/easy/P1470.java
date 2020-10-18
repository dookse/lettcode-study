package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
public class P1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            answer[idx++] = nums[i];
            answer[idx++] = nums[i + n];
        }
        return answer;
    }

    @Test
    @DisplayName("Test Examples")
    void testExamples() {
        assertAll(
            test(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7}),
            test(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4, new int[]{1, 4, 2, 3, 3, 2, 4, 1}),
            test(new int[]{1, 1, 2, 2}, 2, new int[]{1, 2, 1, 2})
        );
    }

    private Executable test(int[] input1, int input2, int[] expected) {
        return () -> assertThat(shuffle(input1, input2)).isEqualTo(expected);
    }

}
