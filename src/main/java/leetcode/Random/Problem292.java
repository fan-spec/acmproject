package leetcode.Random;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem292 {

    public static void main(String[] args) {

        System.out.println(new Problem292().canWinNim(5));

    }

    public boolean canWinNim(int n) {
        return n%4==0?false:true;
    }




}
