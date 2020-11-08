package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

// 1266. Minimum Time Visiting All Points
// https://leetcode.com/problems/minimum-time-visiting-all-points/
public class P1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int times = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int xMove = Math.abs(points[i][0] - points[i + 1][0]);
            int yMove = Math.abs(points[i][1] - points[i + 1][1]);
            times += Integer.max(xMove, yMove);
        }
        return times;
    }

    @Test
    public void test() {
        int[][] points = {
            new int[]{1, 1},
            new int[]{3, 4},
            new int[]{-1, 0}
        };
        assertThat(minTimeToVisitAllPoints(points)).isEqualTo(7);
    }
}
