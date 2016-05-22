package leetcode.chapter8;

import java.util.*;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem47 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(nums==null)
            return list_rslt;

        Arrays.sort(nums);
        LinkedList<Integer> nums_list=new LinkedList<Integer>();
        for(int i=0;i<nums.length;++i) {
            nums_list.add(nums[i]);
        }

        helper(nums_list,new ArrayList<Integer>(),list_rslt);
        return list_rslt;
    }

    public void helper(LinkedList<Integer> nums,ArrayList<Integer> list,ArrayList<List<Integer>> list_rslt) {
        if (nums.size() == 1) {
            list.add(nums.getFirst());
            list_rslt.add(list);
            return;
        }

        for(int i=0;i<nums.size();++i) {
            if(i>0&&(nums.get(i)==nums.get(i-1)))
                continue;

            LinkedList<Integer> nums_temp=new LinkedList<Integer>(nums);
            nums_temp.remove(i);
            ArrayList<Integer> list_temp=new ArrayList<Integer>(list);
            list_temp.add(nums.get(i));

            helper(nums_temp,list_temp,list_rslt);
        }

    }

}
