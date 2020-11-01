package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 1603. Design Parking System
// https://leetcode.com/problems/design-parking-system/
public class P1603 {

    class ParkingSystem {

        private final static int BIG = 1, MEDIUM = 2, SMALL = 3;

        private int[] parkingSpace = new int[4];

        public ParkingSystem(int big, int medium, int small) {
            parkingSpace[BIG] = big;
            parkingSpace[MEDIUM] = medium;
            parkingSpace[SMALL] = small;
        }

        public boolean addCar(int carType) {
            int space = parkingSpace[carType];
            parkingSpace[carType]--;
            return space > 0;
        }
    }

    @Test
    public void test() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        assertThat(parkingSystem.addCar(1)).isTrue();
        assertThat(parkingSystem.addCar(2)).isTrue();
        assertThat(parkingSystem.addCar(3)).isFalse();
        assertThat(parkingSystem.addCar(1)).isFalse();
    }
}
