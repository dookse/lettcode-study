package easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1640. Check Array Formation Through Concatenation
// https://leetcode.com/problems/check-array-formation-through-concatenation/
public class P1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }
        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            for (int num : map.get(arr[i])) {
                if (arr[i++] != num) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test() {
        then(canFormArray(new int[]{85},
            new int[][]{new int[]{85}})).isTrue();

        then(canFormArray(new int[]{15, 88},
            new int[][]{new int[]{88}, new int[]{15}})).isTrue();

        then(canFormArray(new int[]{49, 18, 16},
            new int[][]{new int[]{16, 18, 49}, new int[]{15}})).isFalse();

        then(canFormArray(new int[]{91, 4, 64, 78},
            new int[][]{new int[]{78}, new int[]{4, 64}, new int[]{91}})).isTrue();

        then(canFormArray(new int[]{1, 3, 5, 7},
            new int[][]{new int[]{2, 4, 6, 8}})).isFalse();
    }
}
