package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 1436. Destination City
// https://leetcode.com/problems/destination-city/
public class P1436 {

    public String destCity(List<List<String>> paths) {
        Map<String, String> path = new HashMap<>();
        for (List<String> pathList : paths) {
            path.put(pathList.get(0), pathList.get(1));
        }
        String dest = paths.get(0).get(0);
        while (path.containsKey(dest)) {
            dest = path.get(dest);
        }
        return dest;
    }

    @Test
    public void test1() {
        List<List<String>> input = List.of(
            List.of("London", "New York"),
            List.of("New York", "Lima"),
            List.of("Lima", "Sao Paulo")
        );
        assertThat(destCity(input)).isEqualTo("Sao Paulo");
    }

    @Test
    public void test2() {
        List<List<String>> input = List.of(
            List.of("B", "C"),
            List.of("D", "B"),
            List.of("C", "A")
        );
        assertThat(destCity(input)).isEqualTo("A");
    }
}
