package leetcode.Tag_HashTable;

import java.util.Arrays;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem204 {

    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        if(n<=2)
            return 0;

        boolean[] isPrime=new boolean[n];
        for(int i=0;i<n;++i)
            isPrime[i]=true;


        int count=0;
        for(int i=2;i<n;++i) {
            if (isPrime[i]) {
                ++count;
                for(int j=2;j*i<n;++j)
                    isPrime[j*i]=false;
            }

        }

        return count;
    }
}
