package leetcode.chapter13;

/**
 * Created by Y on 2016-05-25.
 */
public class Problem62 {

    public static void main(String[] args) {

    }

    /**
     * 此题只用一维数组和一个int型变量存储历史信息即可，可以提高代码速度
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        if(m==1||n==1)
            return 1;

        int[] d=new int[n];
        int last=1;
        for(int i=0;i<n;++i)
            d[i]=1;


        for(int i=1;i<m;++i) {
            last=1;
            for(int j=1;j<n;++j) {
                d[j]=last+d[j];
                last=d[j];
            }
        }

        return d[n-1];
    }


}
