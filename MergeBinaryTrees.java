
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MergeBinaryTrees {
    TreeNode res;
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        res = mergeNodes(t1,t2);
        return res;
    }

    TreeNode mergeNodes(TreeNode n1, TreeNode n2) {
        TreeNode resNode = null;
        if(n1 != null && n2 != null) {
            resNode = new TreeNode(n1.val+n2.val);
            resNode.right = mergeNodes(n1.right,n2.right);
            resNode.left = mergeNodes(n1.left,n2.left);
        }
        else if(n1 != null) {
            resNode = new TreeNode(n1.val);
            resNode.right = mergeNodes(n1.right,null);
            resNode.left = mergeNodes(n1.left,null);
        }
        else if(n2 != null) {
            resNode = new TreeNode(n2.val);
            resNode.right = mergeNodes(null,n2.right);
            resNode.left = mergeNodes(null,n2.left);
        }
        return resNode;
    }
}

