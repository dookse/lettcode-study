package easy;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static org.assertj.core.api.Assertions.assertThat;

// 1290. Convert Binary Number in a Linked List to Integer
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/
public class P1290 {

    private final StringBuilder sb = new StringBuilder();

    public int getDecimalValue(ListNode head) {
        helper(head);
        return Integer.parseInt(sb.toString(), 2);
    }

    private void helper(ListNode node) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        helper(node.next);
    }

    @Test
    public void test() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(0);
        assertThat(getDecimalValue(listNode)).isEqualTo(6);
    }

    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }
}
