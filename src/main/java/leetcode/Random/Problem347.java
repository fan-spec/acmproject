package leetcode.Random;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Y on 2016-05-19.
 */
public class Problem347 {

    public static void main(String[] args) {
        List<Integer> list=new Problem347().topKFrequent(new int[]{5,2,5,3,5,3,1,1,3},2);
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list_rslt=new LinkedList<Integer>();
        if(nums==null||k==0)
            return list_rslt;

        //Get nums count use HashMap, O(n)
        HashMap<Integer,Integer> map_num=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;++i) {
            if (map_num.keySet().contains(nums[i])) {
                map_num.put(nums[i], map_num.get(nums[i]) + 1);
            } else {
                map_num.put(nums[i],1);
            }
        }

        //Get top k use a linkedlist contained k elements
        int count=0;
        int key,val;
        List<Map.Entry<Integer, Integer>> list=new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : map_num.entrySet()) {
            key=entry.getKey();
            val=entry.getValue();

            if (count <= k) {
                if (count == 0) {
                    list.add(entry);
                    ++count;
                } else {
                    int i;
                    for(i=0;i<list.size();++i) {
                        if (list.get(i).getValue() <= val) {
                            list.add(i,entry);
                            break;
                        }
                    }
                    if(i==list.size())
                        list.add(i,entry);

                    ++count;
                }

            } else {
                if (list.get(k-1).getValue() >= val) {
                    ++count;
                    continue;
                }

                int i;
                for(i=0;i<k;++i) {
                    if (list.get(i).getValue() <= val) {
                        list.add(i,entry);
                        break;
                    }
                }
                if(i==list.size())
                    list.add(i,entry);

                ++count;
            }
        }

        int i=0;
        for (Map.Entry<Integer, Integer> entry : list) {
            list_rslt.add(entry.getKey());
            if(++i==k)
                break;
        }

        return list_rslt;
    }

}
