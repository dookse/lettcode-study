package easy;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static org.assertj.core.api.Assertions.assertThat;

// 938. Range Sum of BST
// https://leetcode.com/problems/range-sum-of-bst/
public class P0938 {

    public int rangeSumBST(TreeNode root, int l, int r) {
        if (root == null) {
            return 0;
        }
        if (root.val < l) {
            return rangeSumBST(root.right, l, r);
        } else if (r < root.val) {
            return rangeSumBST(root.left, l, r);
        }
        return root.val + rangeSumBST(root.left, l, r) + rangeSumBST(root.right, l, r);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5, new TreeNode(3), new TreeNode(7));
        root.right = new TreeNode(15, null, new TreeNode(18));

        assertThat(rangeSumBST(root, 7, 15)).isEqualTo(32);
    }

    @NoArgsConstructor
    @AllArgsConstructor
    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}
