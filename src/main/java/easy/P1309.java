package easy;

import org.junit.jupiter.api.Test;

import static java.lang.Character.getNumericValue;
import static org.assertj.core.api.BDDAssertions.then;

// 1309. Decrypt String from Alphabet to Integer Mapping
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class P1309 {

    public String freqAlphabets(String s) {
        StringBuilder answer = new StringBuilder();
        int num;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                num = getNumericValue(s.charAt(i - 2)) * 10 + getNumericValue(s.charAt(i - 1));
                i -= 2;
            } else {
                num = getNumericValue(s.charAt(i));
            }
            answer.append((char) (num + '`'));
        }
        return answer.reverse().toString();
    }

    @Test
    public void test() {
        then(freqAlphabets("10#11#12")).isEqualTo("jkab");
        then(freqAlphabets("1326#")).isEqualTo("acz");
    }

}
