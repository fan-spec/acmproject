package leetcode.chapter5;

import java.util.LinkedList;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_1 {

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;

        return helper(root);
    }

    public int helper(TreeNode node) {
        if(node==null)
            return 0;

        int left_depth=helper(node.left);
        int right_depth=helper(node.right);

        if(left_depth==0||right_depth==0)
            return Math.max(left_depth,right_depth)+1;
        else
            return Math.min(left_depth,right_depth)+1;
    }

    public int minDepth_iterator(TreeNode root) {
        if(root==null)
            return 0;

        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.addLast(root);
        int last=1;
        int cur=0;
        int depth=1;

        while (queue.size()>0) {
            TreeNode node=queue.removeFirst();
            if((node.left==null)&&(node.right==null))
                return depth;

            --last;

            if (node.left != null) {
                queue.addLast(node.left);
                ++cur;
            }
            if (node.right != null) {
                queue.addLast(node.right);
                ++cur;
            }

            if (last == 0) {
                ++depth;
                last=cur;
                cur=0;
            }


        }

        return depth;
    }

}
