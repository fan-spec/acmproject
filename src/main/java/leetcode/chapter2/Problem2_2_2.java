package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_2 {

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode head3=new ListNode(3);
        ListNode head4=new ListNode(4);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;

        ListNode node=new Problem2_2_2().reverseBetween(head1,1,4);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)
            return head;

        ListNode p=head;
        ListNode s1=null,s2=null;

        while(m<n){
            p=head;
            for(int i=1;i<=n;++i){
                if(i==m){
                    s1=p;
                }else if(i==n){
                    s2=p;
                    break;
                }

                p=p.next;
            }

            int temp=s1.val;
            s1.val=s2.val;
            s2.val=temp;

//            s1.val=s1.val+s2.val;
//            s2.val=s1.val-s2.val;
//            s1.val=s1.val-s2.val;

            ++m;
            --n;
        }


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
