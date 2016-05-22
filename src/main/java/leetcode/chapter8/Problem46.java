package leetcode.chapter8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem46 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> list_rslt = new ArrayList<List<Integer>>();
        if (nums == null)
            return list_rslt;

        LinkedList<Integer> nums_list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            nums_list.add(nums[i]);
        }

        helper_v2(nums_list,new ArrayList<Integer>(),list_rslt);
        return list_rslt;
    }

    public void helper_v2(LinkedList<Integer> nums, ArrayList<Integer> list, ArrayList<List<Integer>> list_rslt) {
        if (nums.size() == 1) {
            list.add(nums.getFirst());
            list_rslt.add(list);
            return;
        }

        for(int i=0;i<nums.size();++i) {
            LinkedList<Integer> list_temp=new LinkedList<Integer>(nums);
            list_temp.remove(i);

            ArrayList<Integer> list_cur=new ArrayList<Integer>(list);
            list_cur.add(nums.get(i));

            helper_v2(list_temp,list_cur,list_rslt);
        }

    }

    public List<List<Integer>> helper_v1(LinkedList<Integer> nums) {
        if (nums.size() == 1) {
            List<List<Integer>> list_rslt = new ArrayList<List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums.getFirst());
            list_rslt.add(list);

            return list_rslt;
        }

        List<List<Integer>> list_rslt = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.size(); ++i) {
            LinkedList<Integer> nums_temp = new LinkedList<Integer>(nums);
            nums_temp.remove(i);
            List<List<Integer>> list_temp = helper_v1(nums_temp);

            for (List<Integer> ele : list_temp) {
                ele.add(nums.get(i));
                list_rslt.add(ele);
            }
        }

        return list_rslt;
    }

}
