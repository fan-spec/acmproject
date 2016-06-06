package leetcode.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem350 {

    public static void main(String[] args) {

    }


    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0)
            return new int[0];

        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        Integer temp;
        for(int i=0;i<nums1.length;++i) {
            temp=map1.get(nums1[i]);
            map1.put(nums1[i],(temp==null)?1:(temp+1));
        }

        for(int i=0;i<nums2.length;++i) {
            temp=map1.get(nums2[i]);
            if (temp != null && temp > 0) {
                list.add(nums2[i]);
                map1.put(nums2[i],temp-1);
            }
        }

        int[] rslt=new int[list.size()];
        for(int i=0;i<rslt.length;++i)
            rslt[i]=list.get(i);

        return rslt;
    }

}
