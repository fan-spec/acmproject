package leetcode.chapter13;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Y on 2016-05-25.
 */
public class Problem139 {

    public static void main(String[] args) {
        Set<String> wordDict=new HashSet<String>();
        wordDict.add("acm");
        wordDict.add("gan");
//        wordDict.add("ganker");

        System.out.println(new Problem139().wordBreak("acmganker",wordDict));
    }

    public boolean wordBreak(String s, Set<String> wordDict) {
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
