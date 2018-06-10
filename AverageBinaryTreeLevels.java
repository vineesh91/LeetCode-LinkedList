import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AverageBinaryTreeLevels {

    public List<Double> averageOfLevels2(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        List<Integer> levels = new ArrayList<>();
        List<TreeNode> que = new ArrayList<>();
        //HashMap<TreeNode,Integer> vals = new HashMap<>();
        //vals.put(root,0);
        int current_level = 1;
        double sum = 0;
        int count = 0;
        ret.add((double) root.val);
        que.add(root);
        levels.add(0);
        while(!que.isEmpty()) {
            root = que.get(0);
            if(levels.get(0) == current_level) {
                ret.add((double)sum/count);
                sum = 0;
                count = 0;
                current_level++;
            }
            if(root.left != null) {
                sum += root.left.val;
                count++;
                //vals.put(root.left,vals.get(root)+1);
                levels.add(levels.get(0)+1);
                que.add(root.left);

            }
            if(root.right != null) {
                sum += root.right.val;
                count++;
                //vals.put(root.right,vals.get(root)+1);
                levels.add(levels.get(0)+1);
                que.add(root.right);
            }
            que.remove(0);
            levels.remove(0);
        }
        return ret;

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        List<TreeNode> que = new ArrayList<>();
        que.add(root);
        ret.add((double) root.val);
        int count = 1;
        double sum = 0;
        while(count > 0) {
            if(root.left != null) {
                count++;
                sum += (double) root.left.val;
            }
            if(root.right != null) {
                count++;
                sum += (double) root.right.val;
            }
        }
        ret.add((double) root.val);
        ret.addAll(avg(root));
        return ret;

    }

    public HashMap<Integer,Double> levelVals (TreeNode node, int level) {
        HashMap<Integer,Double> ret = new HashMap<>();
        if(node.left != null || node.right != null) {
            ret.put(level,(((node.left == null ? 0 : (double) node.left.val) + (node.right == null ? 0 : (double) node.right.val))/2));
            if(node.left != null) {

            }
        }
        return ret;
    }

    public List<Double> avg(TreeNode node) {
        List<Double> ret = new ArrayList<>();
        if(node.left != null || node.right != null) {
            ret.add(((node.left == null ? 0 : (double) node.left.val) + (node.right == null ? 0 : (double) node.right.val))/2);
            if(node.left != null) {
                ret.addAll(avg(node.left));
            }
            if(node.right != null) {
                ret.addAll(avg(node.right));
            }
        }
        return ret;
    }
}
