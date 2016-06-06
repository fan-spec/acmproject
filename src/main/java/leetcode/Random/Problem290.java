package leetcode.Random;

import java.util.HashMap;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem290 {

    public static void main(String[] args) {
        new Problem290().wordPattern("abba","dog dog dog dog");

    }

    public boolean wordPattern(String pattern, String str) {
        if(pattern==null||str==null)
            return false;

        String[] words=str.split(" ");
        char[] chars=pattern.toCharArray();

        if(words.length!=chars.length)
            return false;

        HashMap<Character,String> map_c2w=new HashMap<>();
        HashMap<String,Character> map_w2c=new HashMap<>();

        String tempStr;
        Character tempCh;
        for(int i=0;i<chars.length;++i) {
            tempStr=map_c2w.put(chars[i],words[i]);
            if(tempStr!=null&&!tempStr.equals(words[i]))
                return false;

            tempCh=map_w2c.put(words[i],chars[i]);
            if(tempCh!=null&&tempCh!=chars[i])
                return false;

        }

        return true;
    }

}
