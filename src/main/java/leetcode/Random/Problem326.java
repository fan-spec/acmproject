package leetcode.Random;

/**
 * Created by Y on 2016-05-31.
 */
public class Problem326 {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(81));
    }

    public boolean isPowerOfThree(int n) {
        if (n < 3 && n != 1)
            return false;


        while (n >= 3) {
            if (n % 3 != 0)
                return false;

            n /= 3;
        }

        return n == 1 ? true : false;
    }
}
