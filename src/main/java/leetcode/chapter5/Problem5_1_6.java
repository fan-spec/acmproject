package leetcode.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/11.
 */
public class Problem5_1_6 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(root==null)
            return list_rslt;

        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> list_temp=new ArrayList<Integer>();
        queue.add(root);

        TreeNode node_temp;
        int cur=0;
        int last=1;
        boolean revers=false;

        while (queue.size() > 0) {
            node_temp=queue.removeFirst();
            list_temp.add(node_temp.val);
            --last;

            if (node_temp.left != null) {
                queue.addLast(node_temp.left);
                ++cur;
            }
            if (node_temp.right != null) {
                queue.addLast(node_temp.right);
                ++cur;
            }

            if (last == 0) {
                if (revers)
                    Collections.reverse(list_temp);

                revers=!revers;
                list_rslt.add(list_temp);
                list_temp=new ArrayList<Integer>();
                last=cur;
                cur=0;
            }

        }

        return list_rslt;
    }

}
