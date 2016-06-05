package leetcode.Tag_HashTable;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem349 {

    public static void main(String[] args) {

    }


    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0) {
            return new int[0];
        }


        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set_inser=new HashSet<>();
        for(int i=0;i< nums1.length;++i)
            set1.add(nums1[i]);
        for(int i=0;i< nums2.length;++i) {
            if (set1.contains(nums2[i])) {
                set_inser.add(nums2[i]);
            }
        }



        int[] rslt=new int[set_inser.size()];
        int i=0;
        for (int n : set_inser) {
            rslt[i++]=n;
        }

        return rslt;
    }
}
