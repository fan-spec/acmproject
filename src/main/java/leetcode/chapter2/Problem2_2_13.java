package leetcode.chapter2;

import java.util.LinkedList;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_13 {

    public static void main(String[] args) {
        Problem2_2_13 p=new Problem2_2_13();
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        ListNode n8=new ListNode(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;

        ListNode n=p.reorderList(n1);
        while(n!=null){
            System.out.println(n.val);
            n=n.next;
        }

    }

    public ListNode reorderList(ListNode head) {

        //find the middle poing
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the second part
        ListNode p1=head,p2=slow.next;
        slow.next=null;
        ListNode index=p2.next,r;
        r=index.next;
        while(index!=null){
            index.next=p2;
            p2.next=null;

            p2=index;
            index=r;
            r=r.next;
        }


        return null;
    }

}
