package easy;

import org.junit.jupiter.api.Test;

import static java.lang.Math.floor;
import static java.lang.Math.log10;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class P1295 {

    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            double digits = 1 + floor(log10(num));
            if (digits % 2 == 0) {
                answer++;
            }
        }
        return answer;
    }

    @Test
    public void test() {
        assertAll(
            () -> assertThat(findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2),
            () -> assertThat(findNumbers(new int[]{100000})).isEqualTo(1)
        );
    }
}
