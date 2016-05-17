package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_4 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(root==null)
            return list_rslt;

        List<Integer> list=new ArrayList<Integer>();
        helper(root,sum,list,list_rslt);

        return list_rslt;
    }

    public void helper(TreeNode node, int sum, List<Integer> list, List<List<Integer>> list_rslt) {
        if(node==null)
            return;

        if ((node.left == null) && (node.right == null)) {
            int num=0;
            for (int i : list) {
                num+=i;
            }
            if ((num + node.val) == sum) {
                list.add(node.val);
                list_rslt.add(list);
            }
            return;
        }

        list.add(node.val);
        helper(node.left,sum,new ArrayList<Integer>(list),list_rslt);
        helper(node.right,sum,new ArrayList<Integer>(list),list_rslt);

    }

}
