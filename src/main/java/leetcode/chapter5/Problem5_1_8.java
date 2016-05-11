package leetcode.chapter5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/11.
 */
public class Problem5_1_8 {

    public static void main(String[] args) {
        Problem5_1_8 p=new Problem5_1_8();

        TreeNode p1=new TreeNode(0);
        TreeNode q1=new TreeNode(0);

        System.out.println("result is :"+p.isSameTree(p1,q1));


    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.val!=q.val)
            return false;

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public boolean isSameTree_iteratively(TreeNode p, TreeNode q) {
        LinkedList<TreeNode> queue_1=new LinkedList<TreeNode>();
        LinkedList<TreeNode> queue_2=new LinkedList<TreeNode>();
        List<Integer> list_temp_1=new ArrayList<Integer>();
        List<Integer> list_temp_2=new ArrayList<Integer>();

        if(p==null&&q==null)
            return true;
        else if(p==null&&q!=null)
            return false;
        else if (p!=null&&q==null)
            return false;

        queue_1.add(p);
        queue_2.add(q);
        int last=1;
        int cur=0;
        TreeNode node_temp_1,node_temp_2;

        while ((queue_1.size()==queue_2.size())&&(queue_1.size()>0)) {
            node_temp_1=queue_1.removeFirst();
            node_temp_2=queue_2.removeFirst();
            --last;


            if(node_temp_1.val!=node_temp_2.val)
                return false;


            if (node_temp_1.left != null) {
                if (node_temp_2.left == null)
                    return false;


                queue_1.addLast(node_temp_1.left);
                queue_2.addLast(node_temp_2.left);
                ++cur;
            } else {
                if (node_temp_2.left != null)
                    return false;
            }

            if (node_temp_1.right != null) {
                if (node_temp_2.right == null)
                    return false;


                queue_1.addLast(node_temp_1.right);
                queue_2.addLast(node_temp_2.right);
                ++cur;
            } else {
                if (node_temp_2.right != null)
                    return false;

            }

            if (last==0) {
                last=cur;
                cur=0;
            }

        }

        if(queue_1.size()>0||queue_2.size()>0)
            return false;

        return true;
    }

}
