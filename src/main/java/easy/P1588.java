package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

// 1588. Sum of All Odd Length Subarrays
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class P1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        int[] accum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            accum[i] = accum[i - 1] + arr[i - 1];
        }
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j + i <= n; j++) {
                sum += accum[j + i] - accum[j];
            }
        }
        return sum;
    }

    @Test
    public void test() {
        assertThat(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3})).isEqualTo(58);
    }

}
