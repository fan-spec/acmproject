package leetcode.chapter2;

import java.util.HashMap;

/**
 * Created by yuhaozhe on 2016/5/5.
 */
public class Problem2_1_7 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] rslt = new int[] { 0, 0 };

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;++i){
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;++i){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                rslt[0]=i;
                rslt[1]=map.get(target-nums[i]);
            }
        }

        return rslt;

    }

}
