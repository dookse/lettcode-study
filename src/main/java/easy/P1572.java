package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 1572. Matrix Diagonal Sum
// https://leetcode.com/problems/matrix-diagonal-sum/
public class P1572 {

    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        for (int x = n - 1, y = 0; y < n; x--, y++) {
            sum += mat[y][x];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    @Test
    public void test() {
        int[][] mat = new int[][]{
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9}
        };
        assertThat(diagonalSum(mat)).isEqualTo(25);
    }

    @Test
    public void test2() {
        int[][] mat = new int[][]{
            new int[]{1, 1, 1, 1},
            new int[]{1, 1, 1, 1},
            new int[]{1, 1, 1, 1},
            new int[]{1, 1, 1, 1}
        };
        assertThat(diagonalSum(mat)).isEqualTo(8);
    }
}
