package easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

// 1221. Split a String in Balanced Strings
// https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class P1221 {

    public int balancedStringSplit(String s) {
        int leftCount = 0, rightCount = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                leftCount++;
            } else {
                rightCount++;
            }
            if (leftCount == rightCount) {
                answer++;
            }
        }
        return answer;
    }

    @Test
    public void test() {
        assertAll(
            () -> assertThat(balancedStringSplit("RLRRLLRLRL")).isEqualTo(4),
            () -> assertThat(balancedStringSplit("RLLLLRRRLR")).isEqualTo(3),
            () -> assertThat(balancedStringSplit("LLLLRRRR")).isEqualTo(1),
            () -> assertThat(balancedStringSplit("RLRRRLLRLL")).isEqualTo(2)
        );

    }
}
