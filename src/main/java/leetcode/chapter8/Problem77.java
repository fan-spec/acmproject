package leetcode.chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem77 {

    public static void main(String[] args) {
        List<List<Integer>> list_rslt=new Problem77().combine(4,2);
        for (List<Integer> list : list_rslt) {
            for (int i : list) {
                System.out.print(i+",");
            }
            System.out.println();
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(n==0||k==0)
            return list_rslt;

        int[] nums=new int[n];
        for(int i=1;i<=n;++i) {
            nums[i-1]=i;
        }

        helper(nums,0,k,new ArrayList<Integer>(),list_rslt);
        return list_rslt;
    }

    public void helper(int[] nums, int start, int k, ArrayList<Integer> list,List<List<Integer>> list_rslt) {
        if (list.size() == k) {
            list_rslt.add(list);
            return;
        }

        if((nums.length-start+list.size())<k)
            return;


        for(int i=start;i<nums.length;++i) {
            ArrayList<Integer> list_temp=new ArrayList<Integer>(list);
            list_temp.add(nums[i]);

            helper(nums,i+1,k,list_temp,list_rslt);
        }

    }

}
