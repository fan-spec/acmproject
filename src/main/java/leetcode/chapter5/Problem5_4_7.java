package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_7 {

    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;

        List<Integer> list=new ArrayList<Integer>();
        helper(root,0,list);
        int sum=0;
        for (int i : list) {
            sum+=i;
        }
        return sum;
    }

    public void helper(TreeNode node, int num, List<Integer> list) {
        if(node==null)
            return;
        if ((node.left == null) && (node.right == null)) {
            list.add(num*10+node.val);
            return;
        }

        helper(node.left,num*10+node.val,list);
        helper(node.right,num*10+node.val,list);

        return;
    }

}
