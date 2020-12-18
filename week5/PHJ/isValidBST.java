public class Solution {
    private TreeNode prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return isMonotonicIncreasing(root);
    }

    private boolean isMonotonicIncreasing(TreeNode p) {
        if (p == null) {
            return true;
        }

        if (isMonotonicIncreasing(p.left)) {
            if (prev != null && p.val <= prev.val) {
                return false;
            }
            prev = p;
            return isMonotonicIncreasing(p.right);
        }

        return false;
    }
}
