package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Problem5_3_5 {

    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return new TreeNode(head.val);

        return helper(head);
    }

    public TreeNode helper(ListNode node) {
        if(node==null)
            return null;

        ListNode slow=node;
        ListNode fast=node;

        while (fast.next!=null&&fast.next.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        TreeNode treeNode=new TreeNode(slow.val);
        treeNode.left=helper(node);
        treeNode.right=helper(slow.next);

        slow.next=null;
        return treeNode;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}