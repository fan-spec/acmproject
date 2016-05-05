package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_1 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String numStr1="",numStr2="";

        numStr1=l1.val+"";
        l1=l1.next;
        while(l1!=null){
            numStr1=l1.val+numStr1;
            l1=l1.next;
        }

        numStr2=l2.val+"";
        l2=l2.next;
        while(l2!=null){
            numStr2=l2.val+numStr2;
            l2=l2.next;
        }

        Long num1=Long.parseLong(numStr1);
        Long num2=Long.parseLong(numStr2);

        String rslt=(num1+num2)+"";
        ListNode l_now=null;
        ListNode l_temp=null;

        ListNode l_rslt=new ListNode(Integer.parseInt(rslt.charAt(rslt.length()-1)+""));
        l_now=l_rslt;
        for(int i=rslt.length()-2;i>=0;--i){
            l_temp=new ListNode(Integer.parseInt(rslt.charAt(i)+""));
            l_now.next=l_temp;
            l_now=l_temp;
        }



        return l_rslt;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
