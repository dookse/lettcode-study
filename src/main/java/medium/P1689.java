package medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
public class P1689 {

    public int minPartitions(String n) {
        int answer = 0;
        for (char c : n.toCharArray()) {
            answer = Integer.max(c - '0', answer);
        }
        return answer;
    }

    @Test
    public void test() {
        then(minPartitions("32")).isEqualTo(3);
        then(minPartitions("82734")).isEqualTo(8);
        then(minPartitions("27346209830709182346")).isEqualTo(9);
    }


}
