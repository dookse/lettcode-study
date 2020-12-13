package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1351. Count Negative Numbers in a Sorted Matrix
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class P1351 {

    public int countNegatives(int[][] grid) {
        int answer = 0;
        for (int[] rows : grid) {
            for (int i = 0; i < rows.length; i++) {
                if (rows[i] < 0) {
                    answer += rows.length - i;
                    break;
                }
            }
        }
        return answer;
    }

    @Test
    public void test() {
        int[][] grid = new int[][]{
            new int[]{4, 3, 2, -1},
            new int[]{3, 2, 1, -1},
            new int[]{1, 1, -1, -2},
            new int[]{-1, -1, -2, -3},
        };
        then(countNegatives(grid)).isEqualTo(8);
    }

    @Test
    public void test2() {
        int[][] grid = new int[][]{
            new int[]{3, 2},
            new int[]{1, 0},
        };
        then(countNegatives(grid)).isEqualTo(0);
    }

    @Test
    public void test3() {
        int[][] grid = new int[][]{
            new int[]{1, -1},
            new int[]{-1, -1},
        };
        then(countNegatives(grid)).isEqualTo(3);
    }
}
