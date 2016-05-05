package leetcode.chapter2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_11 {

    public static void main(String[] args) {

    }

    public boolean hasCycle_v2(ListNode head) {
        if(head==null)
            return false;

        ListNode p1=head,p2=p1.next;
        while(p2!=null&&p2.next!=null){
            if(p1==p2)
                return true;

            p1=p1.next;
            p2=p2.next.next;
        }

        return false;
    }

    public boolean hasCycle_v1(ListNode head) {
        Set<ListNode> set=new HashSet<ListNode>();

        while(head!=null){
            if(set.contains(head))
                return true;

            set.add(head);
            head=head.next;
        }

        return false;
    }

}
