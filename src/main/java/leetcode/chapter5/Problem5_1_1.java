package leetcode.chapter5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/10.
 */
public class Problem5_1_1 {

    public static void main(String[] args) {
        Problem5_1_1 p=new Problem5_1_1();
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(2);
        n1.left=n2;
        n1.right=n3;

        for (int i : p.preorderTraversal_iteratively(n1)) {
            System.out.print(i+"  ");
        }
        System.out.println();

    }

    public List<Integer> preorderTraversal_recursive(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        preorderTraversal_recursive_used(root,list);
        return list;
    }

    public void preorderTraversal_recursive_used(TreeNode node, List<Integer> list) {
        if(node==null)
            return;

        list.add(node.val);
        if(node.left!=null)
            preorderTraversal_recursive_used(node.left,list);
        if(node.right!=null)
            preorderTraversal_recursive_used(node.right,list);
    }

    public List<Integer> preorderTraversal_iteratively(TreeNode root) {

        List<Integer> list=new ArrayList<Integer>();
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();

        while (root != null || stack.size() > 0) {
            if (root == null) {
                root=stack.removeFirst();
                continue;
            }

            list.add(root.val);
            if (root.left != null&&root.right!=null) {
                stack.addFirst(root.right);
                root=root.left;
            } else if (root.left != null && root.right == null) {
                root=root.left;
            } else if (root.left == null && root.right != null) {
                root = root.right;
            } else {
                if (stack.size() > 0) {
                    root = stack.removeFirst();
                } else {
                    break;
                }
            }

        }


        return list;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}