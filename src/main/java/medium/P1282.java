package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

// 1282. Group the People Given the Group Size They Belong To
// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
public class P1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> members = map.getOrDefault(groupSizes[i], new ArrayList<>());
            members.add(i);
            if (members.size() == groupSize) {
                answer.add(members);
                members = new ArrayList<>();
            }
            map.put(groupSizes[i], members);
        }
        return answer;
    }

    @Test
    public void test1() {
        List<List<Integer>> expected = List.of(
            List.of(1),
            List.of(2, 3, 4),
            List.of(0, 5)
        );
        then(groupThePeople(new int[]{2, 1, 3, 3, 3, 2})).isEqualTo(expected);
    }

    @Test
    public void test2() {
        List<List<Integer>> expected = List.of(
            List.of(0, 1, 2),
            List.of(5),
            List.of(3, 4, 6)
        );
        then(groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3})).isEqualTo(expected);
    }
}
