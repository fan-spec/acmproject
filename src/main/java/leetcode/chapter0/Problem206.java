package leetcode.chapter0;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem206 {

    public static void main(String[] args) {

    }


    public ListNode reverseList_iterator(ListNode head) {
        if(head==null||head.next==null)
            return head;

        ListNode pre=head;
        ListNode index=head.next;
        ListNode post=index.next;
        pre.next=null;

        while (post != null) {
            index.next=pre;

            pre=index;
            index=post;
            post=index.next;
        }

        index.next=pre;

        return index;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

