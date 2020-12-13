package easy;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1464. Maximum Product of Two Elements in an Array
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class P1464 {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }

    @Test
    public void test() {
        then(maxProduct(new int[]{3, 4, 5, 2})).isEqualTo(12);
        then(maxProduct(new int[]{1, 5, 4, 5})).isEqualTo(16);
        then(maxProduct(new int[]{3, 7})).isEqualTo(12);
    }


}
