package leetcode.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Y on 2016-05-14.
 */
public class Problem2_1_8 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(nums==null)
            return list_rslt;

        int count=0;
        Arrays.sort(nums);
        ArrayList<Integer> list_neg=new ArrayList<Integer>();
        ArrayList<Integer> list_pos=new ArrayList<Integer>();

        for(int i=0;i<nums.length;++i) {
            if(nums[i]<0)
                list_neg.add(nums[i]);
            else
                list_pos.add(nums[i]);
        }

        HashMap<Integer,Integer> map_neg=new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> map_pos=new HashMap<Integer, Integer>();
        for(int i=0;i<list_neg.size();++i) {
            map_neg.put(list_neg.get(i),i);
        }
        for(int i=0;i<list_pos.size();++i) {
            map_pos.put(list_pos.get(i),i);
        }


        for (int ele : list_neg) {
            List<Integer> list=countPair(-ele,list_pos,map_pos);

            if(list.size()>0)
                list_rslt.add(list);
        }
        for (int ele : list_pos) {
            List<Integer> list=countPair(-ele,list_neg,map_neg);

            if(list.size()>0)
                list_rslt.add(list);
        }

        return list_rslt;
    }

    public List<Integer> countPair(int target,List<Integer> list,HashMap<Integer,Integer> map) {
        List<Integer> list_rslt=new ArrayList<Integer>();

        for(int i=0;i<list.size();++i) {
            int val=list.get(i);

            if (map.containsKey(target - val) && (map.get(target - val) > i)) {
                list_rslt.add(-target);
                list_rslt.add(val);
                list_rslt.add(target-val);
            }
        }

        return list_rslt;
    }

}
