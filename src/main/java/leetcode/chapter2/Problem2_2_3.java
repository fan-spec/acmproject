package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_2_3 {
    public static void main(String[] args) {
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2);
        ListNode h3=new ListNode(3);
        h1.next=h2;
        h2.next=h3;

        ListNode node=new Problem2_2_3().partition(h1,0);
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }

    }

    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;


        ListNode smallHead=null,smallIndex=null,bigHead=null,bigIndex=null;
        ListNode index=head;

        while(index!=null){
            if(index.val<x){
                if(smallHead==null){
                    smallHead=index;
                    smallIndex=index;
                }else{
                    smallIndex.next=index;
                    smallIndex=index;
                }

            }else{
                if(bigHead==null){
                    bigHead=index;
                    bigIndex=index;
                }else{
                    bigIndex.next=index;
                    bigIndex=index;
                }

            }

            index=index.next;
        }

        if(smallHead==null)
            return bigHead;
        else if(bigHead==null)
            return smallHead;


        smallIndex.next=bigHead;
        bigIndex.next=null;

        return smallHead;
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
