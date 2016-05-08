package leetcode.chapter3;

import java.util.HashMap;

/**
 * Created by Y on 2016-05-07.
 */
public class Problem3_11 {

    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int next=0,num=0;
        for(int i=0;i<s.length();++i){
            next=i+1;
            if(next<s.length()){
                if(map.get(s.charAt(i))>=map.get(s.charAt(next))){	//不是4或9的情况
                    num+=map.get(s.charAt(i));
                }else{	  //是4或9的情况
                    num+=(map.get(s.charAt(next))-map.get(s.charAt(i)));
                    ++i;
                }

            }else{	//最后一位
                num+=map.get(s.charAt(i));
            }

        }

        return num;
    }

}
