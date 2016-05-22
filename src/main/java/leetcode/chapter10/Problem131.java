package leetcode.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem131 {   //not completed
    private int count=0;
    public static void main(String[] args) {
        List<List<String>> list_rslt=new Problem131().partition("1223");//
        for (List<String> list_str : list_rslt) {
            for (String str : list_str) {
                System.out.print(str+",");
            }
            System.out.println();
        }

    }

    public List<List<String>> partition(String s) {
        List<List<String>> list_rslt=new ArrayList<List<String>>();
        if(s==null)
            return list_rslt;

        helper(s,new ArrayList<String>(),list_rslt);

        return list_rslt;
    }

    public void helper(String s, ArrayList<String> list,List<List<String>> list_rslt) {
        if (s.length()==1) {
            list.add(s);
            list_rslt.add(list);
            return;
        }
        if(s.equals(""))
            return;

//        System.out.println(++count);
        for(int i=1;i<s.length();++i) {
            String str1=s.substring(0,i);
            String str2=s.substring(i);
            ArrayList<String> list_temp=new ArrayList<String>(list);

            if (!isPalindrome(str1)) {
                helper(str2,list_temp,list_rslt);
                return;
            } else {
                list_temp.add(str1);
            }


            helper(str2,list_temp,list_rslt);
        }

    }

    public boolean isPalindrome(String s) {
        if(s.length()==1)
            return true;
        if(s.equals(""))
            return false;

        int i=0,j=s.length()-1;
        while (i<=j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;

            ++i;
            --j;
        }

        return true;
    }
}
