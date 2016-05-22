package leetcode.chapter8;

import sun.rmi.server.InactiveGroupException;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Y on 2016-05-19.
 */
public class Problem90 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0)
            return list_rslt;

        Arrays.sort(nums);
        ArrayList<Integer> lastsize=new ArrayList<Integer>();
        lastsize.add(0);
        return helper(nums,nums.length-1,lastsize);
    }

    public List<List<Integer>> helper(int[] nums, int index, ArrayList<Integer> lastsize) {
        if (index == -1) {
            ArrayList<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
            ArrayList<Integer> list=new ArrayList<Integer>();

            list_rslt.add(list);
            return list_rslt;
        }

        List<List<Integer>> list_rslt=helper(nums,index-1,lastsize);
        int size=list_rslt.size();
        int start=0;
        if (index > 0 && nums[index] == nums[index - 1]) {
            start=lastsize.get(0);
        }

        for(int i=start;i<size;++i) {
            ArrayList<Integer> list=new ArrayList<Integer>(list_rslt.get(i));
            list.add(nums[index]);
            list_rslt.add(list);
        }
        lastsize.set(0,size);
        return list_rslt;
    }

}
