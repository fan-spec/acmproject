package leetcode.Tag_HashTable;

import java.util.HashMap;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem219 {

    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;++i) {
            Integer j=map.put(nums[i],i);

            if(j!=null&&(i-j)<=k)
                return true;

        }

        return false;
    }

}
