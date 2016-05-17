package leetcode.chapter6;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem6_1 {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0,p2=0;

        while (p1 < nums1.length && p2 < nums2.length) {

            while (nums1[p1] <= nums2[p2]) {++p1;}

            for(int i=nums1.length;i>p1;--i) {
                nums1[i]=nums1[i-1];
            }
            nums1[p1]=nums2[p2];
            ++p2;

        }

        while (p2 < nums2.length) {

        }

    }

}
