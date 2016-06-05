package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-03.
 */
public class Problem279 {
    private int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(new Problem279().numSquares_DP2(12));
        long end = System.currentTimeMillis();

        System.out.println("time : " + (end - start));
    }

    //DP2
    public int numSquares_DP2(int n) {
        if(n<1)
            return 0;

        boolean[] flag=new boolean[n+1];
        for(int i=0;i<n+1;++i) flag[i]=false;
        for(int i=1;i*i<n+1;++i) flag[i*i]=true;

        int[] d=new int[n+1];
        d[1]=1;

        for(int i=1;i<n+1;++i) {
            if (flag[i]) {
                d[i]=1;
                continue;
            }

            d[i]=i;
            for(int j=1;j*j<=i;++j) {
                d[i]=d[i]<d[i-j*j]?d[i]:d[i-j*j];
            }

            ++d[i];
        }


        return d[n];
    }

    //DP1
    public int numSquares_DP1(int n) {
        if (n < 1)
            return 0;

        int[] d=new int[n+1];
        for(int i=0;i<n+1;++i) d[i]=Integer.MAX_VALUE;
        d[0]=0;

        for(int i=0;i<=n;++i) {

            for(int j=1;j*j+i<=n;++j) {
                d[i+j*j]=d[i+j*j]<(d[i]+1)?d[i+j*j]:(d[i]+1);
            }

        }

        return d[n];
    }

    // Bruce force
    public int numSquares(int n) {
        if (n < 1)
            return 0;

        boolean[] isPerfect = new boolean[n];
        for (int i = 0; i < n; ++i)
            isPerfect[i] = false;

        isPerfect[0] = true;
        for (int i = 1; i * i <= n; ++i) {
            isPerfect[i * i - 1] = true;
        }
        if (isPerfect[n - 1])
            return 1;

        helper(isPerfect, n, 0);
        return min;
    }

    public void helper(boolean[] isPerfect, int sum, int n) {
        if (sum == 0) {
            min = n < min ? n : min;
            return;
        }

        for (int i = sum; i >= 1; --i) {
            if (isPerfect[i - 1]) {
                helper(isPerfect, sum - i, n + 1);
            }

        }

    }
}
