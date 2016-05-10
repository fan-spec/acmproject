package leetcode.chapter5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/10.
 */
public class Problem5_1_2 {

    public static void main(String[] args) {
        Problem5_1_2 p=new Problem5_1_2();
        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        n1.left=n2;

        for (int i : p.inorderTraversal_iteratively(n1)) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public List<Integer> inorderTraversal_recursive(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        inorderTraversal_recursive_used(root,list);
        return list;
    }

    public void inorderTraversal_recursive_used(TreeNode node,List<Integer> list) {
        if(node==null)
            return;

        if(node.left!=null)
            inorderTraversal_recursive_used(node.left,list);

        list.add(node.val);

        if(node.right!=null)
            inorderTraversal_recursive_used(node.right,list);

    }

    public List<Integer> inorderTraversal_iteratively(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();

        while (root != null || stack.size() > 0) {
            if(root==null){
                root=stack.removeFirst();
                root.left=null;
                continue;
            }

            if (root.left != null) {
                stack.addFirst(root);
                root = root.left;
            } else {
                list.add(root.val);
                if (root.right == null) {
                    if(stack.size()==0)
                        break;

                    root=stack.removeFirst();
                    root.left=null;
                } else {
                    root=root.right;
                }
            }

        }

        return list;
    }

}
