package leetcode.Random;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem342 {

    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int num) {
        if(num<1)
            return false;

        int n=(1<<30);
        while (n > 0) {
            if(n==num)
                return true;

            n=(n>>2);
        }

        return false;
    }

}
