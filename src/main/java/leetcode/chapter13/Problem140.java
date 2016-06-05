package leetcode.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Y on 2016-05-25.
 */
public class Problem140 {

    public static void main(String[] args) {

    }

    /**
     * 此题在LeetCode上的测试有一个用时较长但不能被break的用例，会造成超时，
     * 所以要先用Word Break中的方法判断一下该字符串能否被break，然后再进行改天的操作。
     * @param s
     * @param wordDict
     * @return
     */
    public List<String> wordBreak(String s, Set<String> wordDict) {

        ArrayList<String> list_rslt=new ArrayList<String>();
        helper(s,wordDict,0,new StringBuilder(),list_rslt);
        return list_rslt;
    }

    public void helper(String s, Set<String> wordDict,int index, StringBuilder sb, ArrayList<String> list_rslt) {
        if (index == s.length()) {
            list_rslt.add(sb.deleteCharAt(sb.length()-1).toString());
            return;
        }

        if(!wordBreak_helper(s.substring(index,s.length()),wordDict))
            return;

        for (String str : wordDict) {
            if (index + str.length() <= s.length()) {
                if (str.equals(s.substring(index, index + str.length()))) {
                    StringBuilder sb_new=new StringBuilder(sb.toString());
                    sb_new.append(str+" ");
                    helper(s,wordDict,index+str.length(),sb_new,list_rslt);
                }
            }
        }

    }

    public boolean wordBreak_helper(String s, Set<String> wordDict) {
        if(s.length()==1)
            return wordDict.contains(s);

        boolean d[]=new boolean[s.length()];
        d[0]=wordDict.contains(s.substring(0,1));

        for(int i=1;i<s.length();++i) {
            if (wordDict.contains(s.substring(0, i + 1))) {
                d[i]=true;
                continue;
            }

            for(int j=0;j<i;++j) {
                if (d[j] && wordDict.contains(s.substring(j + 1, i + 1))) {
                    d[i]=true;
                    break;
                }
            }
        }

        return d[s.length()-1];
    }
}
