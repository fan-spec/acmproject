package leetcode.Random;

import java.util.HashMap;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem169 {

    public static void main(String[] args) {

        System.out.println(new Problem169().majorityElement_v2(new int[]{1,2,3,4,5,5,5,9,5,5}));

    }

    public int majorityElement_v2(int[] nums) {
        int rslt=0;
        int[] bit=new int[32];
        for(int i=0;i<32;++i) bit[i]=0;

        int len=nums.length/2;
        for(int i=0;i<nums.length;++i) {
            int j=0;

            while (nums[i] > 0) {
                bit[j]=(nums[i]&1)>0?bit[j]+1:bit[j];

                if(bit[j]>len)
                    rslt=(rslt|(1<<j));

                ++j;
                nums[i]=nums[i]>>1;
            }

        }

        return rslt;
    }


    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];

        HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        Integer temp=0;
        for(int i=0;i<len;++i) {
            temp=map.get(nums[i]);
            map.put(nums[i],(temp==null)?1:(temp+1));

            if(temp!=null&&((temp+1)>(len/2)))
                return nums[i];
        }

        return 0;
    }
}
