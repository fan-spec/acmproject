package leetcode.Random;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem263 {

    public static void main(String[] args) {

    }

    public boolean isUgly(int num) {
        if(num<1) return false;

        while(num%2==0) num/=2;
        while(num%3==0) num/=3;
        while(num%5==0) num/=5;

        return num==1;
    }

}
