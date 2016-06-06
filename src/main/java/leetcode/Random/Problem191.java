package leetcode.Random;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem191 {

    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int count=0;

        if (n < 0){
            ++count;
            n=(n&2147483647);
        }

        while (n > 0) {
            if((n&1)>0) ++count;

            n=n>>1;
        }

        return count;
    }
}
