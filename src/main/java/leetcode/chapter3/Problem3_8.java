package leetcode.chapter3;

/**
 * Created by Y on 2016-05-07.
 */
public class Problem3_8 {

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        String prefix="";

        if(strs.length==0)
            return "";

        int minLen=strs[0].length();
        for(int i=1;i<strs.length;++i){
            if(minLen>strs[i].length()){
                minLen=strs[i].length();
            }
        }

        for(int i=0;i<minLen;++i){
            prefix=strs[0].substring(0, i+1);

            for(String str:strs){
                if(!str.substring(0, i+1).equals(prefix)){
                    return prefix.substring(0, i);
                }
            }
        }

        return prefix;
    }

}
