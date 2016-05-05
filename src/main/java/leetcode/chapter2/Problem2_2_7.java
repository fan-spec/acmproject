package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_7 {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempHead=head;

        int len=0;
        while(tempHead!=null){
            ++len;
            tempHead=tempHead.next;
        }

        if(len==0)
            return null;

        tempHead=head;
        int num=len-n;
        if(num==0){
            return tempHead.next;
        }




        int i=0;
        while(tempHead!=null){
            ++i;
            if(i==num){
                if(tempHead.next==null){
                    tempHead.next=null;
                }else{
                    tempHead.next=tempHead.next.next;
                }
                break;
            }

            tempHead=tempHead.next;
        }

        return head;
    }

}
