package leetcode.chapter6;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem6_2 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode head, temp;
        if (l1.val <= l2.val) {
            head = l1;
            temp = l1;
            l1 = l1.next;
        } else {
            head = l2;
            temp = l2;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
                temp.next = null;
            } else {
                temp.next = l2;
                temp=temp.next;
                l2=l2.next;
                temp.next=null;
            }
        }

        if(l1!=null)
            temp.next=l1;
        if(l2!=null)
            temp.next=l2;

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}