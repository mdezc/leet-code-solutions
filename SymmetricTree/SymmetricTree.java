package SymmetricTree;

class SymmetricTree {

    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, node2, node2);

        isSymmetric(node1);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return nodesAreSymmetric(root.left, root.right);
    }

    private static boolean nodesAreSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.val == right.val) {
            return nodesAreSymmetric(left.left, right.right) &&
                    nodesAreSymmetric(left.right, right.left);
        }
        return false;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int value, TreeNode rightNode, TreeNode leftNode) {
            val = value;
            right = rightNode;
            left = leftNode;
        }
    }
}
