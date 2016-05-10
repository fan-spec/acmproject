package leetcode.chapter5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/10.
 */
public class Problem5_1_3 {

    public static void main(String[] args) {
        Problem5_1_3 p=new Problem5_1_3();
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(2);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);
        n1.left=n2;
        n2.left=n3;
//        n3.left=n4;
//        n4.left=n5;

        long start=System.currentTimeMillis();
        List<Integer> list=p.postorderTraversal_iteratively_v2(n1);
        long end=System.currentTimeMillis();

        System.out.println("Time: "+(end-start)+"  "+list.size());

        for (int i : list) {
            System.out.print(i+"  ");
        }
        System.out.println();


    }

    public List<Integer> postorderTraversal_recursive(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        postorderTraversal_recursive_used(root,list);
        return list;
    }

    public void postorderTraversal_recursive_used(TreeNode root,List<Integer> list) {
        if(root==null)
            return;

        if (root.left != null) {
            postorderTraversal_recursive_used(root.left,list);
        }
        if (root.right != null) {
            postorderTraversal_recursive_used(root.right,list);
        }
        list.add(root.val);

    }


    public List<Integer> postorderTraversal_iteratively_v2(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();

        if(root==null)
            return list;

        stack.addFirst(root);
        TreeNode pre=null,cur;

        while (!stack.isEmpty()) {
            cur=stack.getFirst();

            if ((cur.left == null && cur.right == null) || (pre!=null&&(pre == cur.left || pre == cur.right))) {
                list.add(cur.val);
                stack.removeFirst();
                pre=cur;
            } else {
                if(cur.right!=null)
                    stack.addFirst(cur.right);
                if(cur.left!=null)
                    stack.addFirst(cur.left);

            }

        }

        return list;
    }

    //Time Limit Exceeded
    public List<Integer> postorderTraversal_iteratively_v1(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();

        while (root != null || stack.size() > 0) {
            if (root == null) {
                root=stack.removeFirst();
                continue;
            }

            if (root.left == null && root.right == null) {
                list.add(root.val);

                if(stack.size()==0)
                    break;

                root = stack.removeFirst();
            } else {

                if (root.left != null && root.right != null) {
                    stack.addFirst(root);
                    stack.addFirst(root.right);
                    root=root.left;
                    stack.getFirst().left=null;
                    stack.getFirst().right=null;
                } else if (root.left != null && root.right == null) {
                    stack.addFirst(root);
                    root=root.left;
                    stack.getFirst().left=null;
                } else if (root.left == null && root.right != null) {
                    stack.addFirst(root);
                    root=root.right;
                    stack.getFirst().right=null;
                }

            }

        }

        return list;
    }

}
