package leetcode.Random;

import java.util.HashSet;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem160 {

    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set_nodes=new HashSet<>();
        while (headA != null) {
            set_nodes.add(headA);
            headA=headA.next;
        }

        while (headB != null) {
            if(!set_nodes.add(headB))
                return headB;

            headB=headB.next;
        }

        return null;
    }
}
