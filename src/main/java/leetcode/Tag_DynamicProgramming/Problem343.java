package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem343 {

    public static void main(String[] args) {

        System.out.println(new Problem343().integerBreak(36));

    }

    public int integerBreak(int n) {
        if(n<=3)
            return n-1;

        int[] d=new int[n+1];
        d[1]=0;
        d[2]=2;
        d[3]=3;

        for(int i=4;i<=n;++i) {
            d[i]=(3*d[i-3])>(2*d[i-2])?(3*d[i-3]):(2*d[i-2]);
        }

        return d[n];
    }
}
