package leetcode.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-05-20.
 */
public class Problem131 {
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

        helper(s.toCharArray(),0,new ArrayList<String>(),list_rslt);
        return list_rslt;
    }

    public void helper(char[] s,int index, ArrayList<String> list,List<List<String>> list_rslt) {
        if (index == s.length) {
            list_rslt.add(list);
            return;
        }


        for(int i=index+1;i<=s.length;++i) {

            if (isPalindrome(s,index,i-1)) {
                String str=new String(s,index,i-index);
                ArrayList<String> list_new = new ArrayList<String>(list);
                list_new.add(str);
                helper(s, i, list_new, list_rslt);
            }
        }

    }

    public boolean isPalindrome(char[] s,int l,int r) {
        while (l < r) {
            if(s[l++]!=s[r--])
                return false;
        }

        return true;
    }
}
