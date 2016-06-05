package leetcode.Random;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem237 {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        if(node==null||node.next==null)
            return;

        while (node.next.next != null) {
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;

    }

}
