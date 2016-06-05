package leetcode.Random;

/**
 * Created by Y on 2016-05-31.
 */
public class Problem231 {

    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        if(n==0||n==Integer.MIN_VALUE)
            return false;

        return (n&(n-1))==0;
    }

}
