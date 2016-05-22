package leetcode.chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-05-19.
 */
public class Problem78 {

    public static void main(String[] args) {

    }


    //Time Limit Exceeded, Nonrecursivly version
    public List<List<Integer>> subsets_nonRecursivly(int[] nums) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        list_rslt.add(new ArrayList<Integer>());
        if(nums==null||nums.length==0)
            return list_rslt;

        for(int i=0;i<nums.length;++i) {
            for (int j=0;j<list_rslt.size();++j) {
                ArrayList<Integer> temp=new ArrayList<Integer>(list_rslt.get(j));
                temp.add(nums[i]);
                list_rslt.add(temp);
            }

        }

        return list_rslt;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list_rslt=new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0)
            return list_rslt;

        helper(nums,0,0,new ArrayList<Integer>(),list_rslt);
        helper(nums,0,1,new ArrayList<Integer>(),list_rslt);

        return list_rslt;
    }

    public void helper(int[] nums,int i,int flag,List<Integer> list,List<List<Integer>> list_rslt) {
        if (i == nums.length - 1) {
            if (flag == 1) {
                list.add(nums[i]);
            }
            list_rslt.add(list);
            return;
        }

        if (flag == 1) {
            list.add(nums[i]);
        }

        helper(nums,i+1,0,new ArrayList<Integer>(list),list_rslt);
        helper(nums,i+1,1,new ArrayList<Integer>(list),list_rslt);

    }
}
