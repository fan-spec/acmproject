package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_5 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;

        ListNode helper=new ListNode(-1);
        helper.next=head;
        ListNode index=head,pre=helper;

        while(index!=null){
            while(index.next!=null&&pre.next.val==index.next.val){
                index=index.next;
            }

            if(pre.next==index)
                pre=pre.next;
            else
                pre.next=index.next;

            index=index.next;
        }

        return helper.next;
    }

//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }

}
