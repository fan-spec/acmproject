package leetcode.chapter6;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem6_7 {

    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int[] colorCount=new int[]{0,0,0};
        for(int i=0;i<nums.length;++i) {
            colorCount[nums[i]]++;
        }


        int index=0;
        for(int i=0;i<3;++i) {
            for(int j=0;j<colorCount[i];++j) {
                nums[index++]=i;
            }
        }

    }

}
