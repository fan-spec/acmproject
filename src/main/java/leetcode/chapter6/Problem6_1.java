package leetcode.chapter6;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem6_1 {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = n + m - 1 ;
        int p1 = m-1 , p2 = n-1;
        while(ind >= 0){
            if(p1 < 0)
                nums1[ind--] = nums2[p2--];
            else if(p2 < 0)
                nums1[ind--] = nums1[p1--];
            else
                nums1[ind--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--] ;
        }

    }

}
