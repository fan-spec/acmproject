package leetcode.Tag_HashTable;

import java.util.HashSet;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem202 {

    public static void main(String[] args) {
        System.out.println(new Problem202().isHappy(82));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            int temp=n;
            n=0;
            while (temp > 0) {
                n+=(temp%10)*(temp%10);
                temp/=10;
            }

            if(n==1)
                return true;

        }

        return false;
    }
}
