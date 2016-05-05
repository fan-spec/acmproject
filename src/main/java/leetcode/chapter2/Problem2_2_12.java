package leetcode.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_12 {

    public static void main(String[] args) {

    }

    public ListNode detectCycle_v2(ListNode head) {
        if(head==null)
            return null;

        ListNode fast=head,slow1=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow1=slow1.next;

            if(fast==slow1){
                ListNode slow2=head;
                while(slow1!=slow2){
                    slow1=slow1.next;
                    slow2=slow2.next;
                }
                return slow1;
            }

        }

        return null;
    }

    public ListNode detectCycle_v1(ListNode head) {
        Set<ListNode> set=new HashSet<ListNode>();

        while(head!=null){
            if(set.contains(head)){
                return head;
            }

            set.add(head);
            head=head.next;
        }

        return null;
    }

}
