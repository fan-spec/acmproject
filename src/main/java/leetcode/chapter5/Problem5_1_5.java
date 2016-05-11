package leetcode.chapter5;

import java.util.*;

/**
 * Created by yuhaozhe on 2016/5/11.
 */
public class Problem5_1_5 {

    public static void main(String[] args) {

    }

    // Same with the version1 except Collections.reverse() function used
    public List<List<Integer>> levelOrderBottom_v2(TreeNode root) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        ArrayList<Integer> list_temp=new ArrayList<Integer>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);

        if(root==null)
            return list_rslt;

        int cur=0;
        int last=1;
        TreeNode node_temp;

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
                list_rslt.add(list_temp);
                list_temp=new ArrayList<Integer>();
                last=cur;
                cur=0;
            }

        }

        Collections.reverse(list_rslt);
        return list_rslt;
    }



    public List<List<Integer>> levelOrderBottom_v1(TreeNode root) {
        LinkedList<ArrayList<Integer>> list_rslt=new LinkedList<ArrayList<Integer>>();
        ArrayList<Integer> list_temp=new ArrayList<Integer>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);

        if(root==null)
            return new ArrayList<List<Integer>>(list_rslt);

        int cur=0;
        int last=1;
        TreeNode node_temp;

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
                list_rslt.addFirst(list_temp);
                list_temp=new ArrayList<Integer>();
                last=cur;
                cur=0;
            }

        }

        return new ArrayList<List<Integer>>(list_rslt);
    }

}
