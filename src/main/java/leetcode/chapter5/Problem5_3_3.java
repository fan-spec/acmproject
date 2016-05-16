package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Problem5_3_3 {
    private List<Integer> list=new ArrayList<>();
    private boolean isValid=true;

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return isValid;
    }

    public void helper(TreeNode node) {
        if(node==null)
            return;

        helper(node.left);
        if ((list.size()>0)&&(list.get(list.size() - 1) >= node.val)) {
            isValid = false;
            return;
        } else {
            list.add(node.val);
        }
        helper(node.right);

    }

}
