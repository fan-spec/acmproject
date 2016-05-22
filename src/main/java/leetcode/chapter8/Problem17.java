package leetcode.chapter8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem17 {

    public static void main(String[] args) {




    }

    public List<String> letterCombinations(String digits) {
        List<String> list_rslt=new ArrayList<String>();
        if(digits==null||digits.length()==0)
            return list_rslt;

        HashMap<Character,String> map_num2Str=new HashMap<Character,String>();
        map_num2Str.put('1',"");
        map_num2Str.put('2',"abc");
        map_num2Str.put('3',"def");
        map_num2Str.put('4',"ghi");
        map_num2Str.put('5',"jkl");
        map_num2Str.put('6',"mno");
        map_num2Str.put('7',"pqrs");
        map_num2Str.put('8',"tuv");
        map_num2Str.put('9',"wxyz");
        map_num2Str.put('0'," ");
        list_rslt.add("");

        for(int i=0;i<digits.length();++i) {
            String str=map_num2Str.get(digits.charAt(i));
            ArrayList<String> list_temp=new ArrayList<String>();
            for(int k=0;k<list_rslt.size();++k) {

                for(int j=0;j<str.length();++j) {
                    list_temp.add(list_rslt.get(k)+str.charAt(j));
                }

            }

            list_rslt=list_temp;
        }

        return list_rslt;
    }
}
