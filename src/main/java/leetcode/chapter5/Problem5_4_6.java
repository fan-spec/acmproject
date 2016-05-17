package leetcode.chapter5;

import java.util.LinkedList;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_6 {

    public static void main(String[] args) {

    }

    public void connect(TreeLinkNode root) {
        if(root==null)
            return;

        if (root.left != null) {
            root.left.next=root.right;
        }

        if ((root.right!=null)&&(root.next != null)) {
            root.right.next=root.next.left;
        }

        connect(root.left);
        connect(root.right);
    }

    public void connect_iterator(TreeLinkNode root) {
        if(root==null)
            return;

        LinkedList<TreeLinkNode> queue=new LinkedList<TreeLinkNode>();
        queue.addLast(root);
        int last=1;
        int cur=0;

        while (queue.size() > 0) {
            TreeLinkNode node=queue.removeFirst();
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
                last=cur;
                cur=0;
                node.next=null;
                continue;
            }

            node.next=queue.getFirst();

        }

        return;
    }

}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}