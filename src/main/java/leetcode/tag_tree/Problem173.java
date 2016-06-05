package leetcode.Tag_Tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem173 {

    public static void main(String[] args) {
        TreeNode n1=new TreeNode(3);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(4);
        TreeNode n4=new TreeNode(1);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;

        BSTIterator i=new BSTIterator(n1);
        while (i.hasNext()) {
            System.out.print(i.next()+" , ");
        }
    }


}


class BSTIterator_v2 {
    LinkedList<TreeNode> stack;

    public BSTIterator_v2(TreeNode root) {
        stack=new LinkedList<TreeNode>();
        while (root != null) {
            stack.push(root);
            root=root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node=stack.pop();
        int val=node.val;
        if (node.right != null) {
            node=node.right;
            while (node != null) {
                stack.push(node);
                node=node.left;
            }
        }

        return val;
    }
}


class BSTIterator {
    TreeNode root;
    int index;
    ArrayList<Integer> list;

    public BSTIterator(TreeNode root) {
        this.root=root;
        this.index=0;
        list=new ArrayList<Integer>();

        if(root==null)
            return;

        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
        TreeNode temp=root;

        while (!stack.isEmpty()||temp!=null) {
            if (temp == null) {
                temp=stack.pop();
                temp.left=null;
            } else if (temp.left != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                list.add(temp.val);
                if (temp.right == null) {
                    if (stack.isEmpty())
                        break;

                    temp = stack.pop();
                    temp.left=null;
                } else {
                    temp=temp.right;
                }

            }

        }

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(index>=list.size());
    }

    /** @return the next smallest number */
    public int next() {
        if(hasNext())
            return list.get(index++);
        else
            return -1;
    }
}