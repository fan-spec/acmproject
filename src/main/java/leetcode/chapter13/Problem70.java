package leetcode.chapter13;

/**
 * Created by Y on 2016-05-30.
 */
public class Problem70 {

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        if(n<1)
            return 1;
        if(n==1)
            return 1;

        int a=1,b=1,temp=0;
        for(int i=2;i<=n;++i) {
            temp=a+b;
            a=b;
            b=temp;
        }

        return temp;
    }

}
