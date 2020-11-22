package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

// 1323. Maximum 69 Number
// https://leetcode.com/problems/maximum-69-number/
public class P1323 {

    public int maximum69Number(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }

    @Test
    public void test() {
        assertThat(maximum69Number(9669)).isEqualTo(9969);
    }
}
