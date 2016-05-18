package leetcode.chapter6;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem6_4 {

    public static void main(String[] args) {
        ListNode n1=new ListNode(5);
        ListNode n2=new ListNode(4);
        ListNode n3=new ListNode(1);
        n1.next=n2;
        n2.next=n3;

        ListNode node=new Problem6_4().insertionSortList(n1);

        while (node != null) {
            System.out.println(node.val);
            node=node.next;
        }

    }

    public ListNode insertionSortList(ListNode head) {
        if(head==null)
            return null;

        ListNode index=head.next;
        head.next=null;
        ListNode last=head,temp;
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode pre_origin=pre;

        while (index != null) {
            if (index.val >= last.val) {
                last.next=index;
                last=last.next;
                index=index.next;
                last.next=null;
                continue;
            }

            pre=pre_origin;
            while((pre.next!=null)&&(pre.next.val<=index.val)){pre=pre.next;}

            if (pre.next == null) {
                if (pre.val > index.val) {
                    int val=pre.val;
                    pre.val=index.val;
                    index.val=val;
                    pre.next=index;
                    continue;
                }
            }

            temp=index.next;
            index.next=pre.next;
            pre.next=index;
            index=temp;
        }


        return pre_origin.next;
    }

}
