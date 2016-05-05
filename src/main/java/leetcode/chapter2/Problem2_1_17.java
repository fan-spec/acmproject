package leetcode.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_17 {

    public static void main(String[] args) {
        Problem2_1_17 problem=new Problem2_1_17();

        int[] array=problem.plusOne(new int[]{9,9,9});
        for(int a:array){
            System.out.println(a);
        }


    }

    public int[] plusOne(int[] digits) {
        int carry=1,sum;
        for(int i=digits.length-1;i>=0;--i){
            sum=digits[i]+carry;
            carry=0;

            if(sum<10){
                digits[i]=sum;
                break;
            }else{
                carry=1;
                digits[i]=sum-10;
            }

        }

        int[] newDigits;

        if(carry==1){
            newDigits=new int[digits.length+1];
            newDigits[0]=1;
            for(int i=0;i<digits.length;++i){
                newDigits[i+1]=digits[i];
            }
        }else{
            newDigits=digits;
        }

        return newDigits;
    }
}
