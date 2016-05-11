package leetcode.chapter5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/10.
 */
public class Problem5_1_4 {

    public static void main(String[] args) {

    }

    // Level Order Traversal
    public List<List<Integer>> levelOrder_v2(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        List<Integer> list_temp=new ArrayList<Integer>();

        if(root==null)
            return list_rslt;

        queue.add(root);
        int last=1;
        int cur=0;
        TreeNode node_temp;

        while (queue.size() > 0) {
            node_temp=queue.removeFirst();
            list_temp.add(node_temp.val);
            --last;


            if(node_temp.left!=null){
                queue.addLast(node_temp.left);
                ++cur;
            }
            if(node_temp.right!=null){
                queue.addLast(node_temp.right);
                ++cur;
            }

            if (last==0) {
                last=cur;
                cur=0;
                list_rslt.add(list_temp);
                list_temp = new ArrayList<Integer>();
            }


        }


        return list_rslt;
    }

    public List<List<Integer>> levelOrder_v1(TreeNode root) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        ArrayList<Integer> list_temp=new ArrayList<Integer>();
        List<TreeNode> list_node=new ArrayList<TreeNode>();
        List<TreeNode> list_node_temp=new ArrayList<TreeNode>();

        if(root==null)
            return list_rslt;

        list_node.add(root);

        while (list_node.size() > 0) {
            list_temp=new ArrayList<Integer>();

            for (TreeNode node : list_node) {
                list_temp.add(node.val);

                if(node.left!=null)
                    list_node_temp.add(node.left);
                if(node.right!=null)
                    list_node_temp.add(node.right);
            }
            list_rslt.add(list_temp);

            list_node=list_node_temp;
            list_node_temp=new ArrayList<TreeNode>();
        }

        return list_rslt;
    }

}
