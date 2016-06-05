package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Test {

    public static void main(String[] args) {
        Test test=new Test();

        Math.max(1,2);

    }

    public boolean isPalindrome(int x) {
        if(x<0||(x!=0 && x%10==0))
            return false;

        int y=0;

        while(x>y){
            y=y*10+x%10;
            x=x/10;
        }

        return (x==y||x==y/10);
    }

    public void helper_bit_version(int n,int s) {
        for(int i=0;i<n;++i) {
            if((s&(1<<i))>0)
                System.out.printf("%d ",i);

        }

        System.out.println();
    }

    public void helper(int n,int[] B,int index) {
        if (index == n) {
            for(int i=0;i<n;++i) {
                if(B[i]==1)
                    System.out.print(i+" ");
            }
            System.out.println();

            return;
        }

        B[index]=1;
        helper(n,B,index+1);
        B[index]=0;
        helper(n,B,index+1);
    }



}
