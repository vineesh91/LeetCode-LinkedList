public class BinaryTreePurning {
    public TreeNode pruneTree(TreeNode root) {
        return checkForOnes(root);
    }

    TreeNode checkForOnes(TreeNode node) {
        TreeNode ret;
        if(node.right != null) {
            node.right = checkForOnes(node.right);
        }
        if(node.left != null) {
            node.left = checkForOnes(node.left);
        }
        if(node.val == 0) {
            if(node.right == null && node.left == null) {
                ret = null;
            }
            else {
                ret = node;
            }
        }
        else {
            ret = node;
        }
        return ret;
    }
}
