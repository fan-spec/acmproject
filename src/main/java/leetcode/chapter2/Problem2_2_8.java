package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_8 {

    public static void main(String[] args) {


    }

    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;

        ListNode helper=new ListNode(-1);
        helper.next=head;

        ListNode pre=helper,post=head;
        ListNode temp;

        while(post!=null&&post.next!=null){
            temp=post.next.next;
            post.next.next=pre.next;
            pre.next=pre.next.next;
            post.next=temp;


            pre=post;
            post=temp;
        }

        return helper.next;
    }

}
