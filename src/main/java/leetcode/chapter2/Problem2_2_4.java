package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_4 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;

        ListNode p=head,index=head.next;
        int value=p.val;

        while(index!=null){
            if(index.val>value){
                p.next=index;
                p=index;
                value=p.val;
            }


            index=index.next;
        }
        p.next=null;

        return head;
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
