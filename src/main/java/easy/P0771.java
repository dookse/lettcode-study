package easy;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

// 771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/
public class P0771 {

    public int numJewelsInStones(String j, String s) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        for (char c : j.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                answer++;
            }
        }
        return answer;
    }

    @Test
    @DisplayName("Test Examples")
    void testExamples() {
        assertAll(
            () -> assertThat(numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3),
            () -> assertThat(numJewelsInStones("z", "ZZ")).isEqualTo(0)
        );
    }

}