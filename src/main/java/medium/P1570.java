package medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1570. Dot Product of Two Sparse Vectors
// https://leetcode.com/problems/dot-product-of-two-sparse-vectors/
public class P1570 {

    static class SparseVector {

        public int[] nums;

        public int dotProduct(SparseVector vec) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i] * vec.nums[i];
            }
            return sum;
        }

        public SparseVector(int[] nums) {
            this.nums = nums;
        }
    }

    @Test
    public void test() {
        SparseVector v1 = new SparseVector(new int[]{1, 0, 0, 2, 3});
        SparseVector v2 = new SparseVector(new int[]{0, 3, 0, 4, 0});

        then(v1.dotProduct(v2)).isEqualTo(8);
    }

}
