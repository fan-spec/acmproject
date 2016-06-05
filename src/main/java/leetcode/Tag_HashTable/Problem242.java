package leetcode.Tag_HashTable;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem242 {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        int[] count=new int[26];

        for(int i=0;i<26;++i) count[i]=0;

        for(char ch:s.toCharArray()) ++count[ch-'a'];
        for(char ch:t.toCharArray()) --count[ch-'a'];

        for(int i=0;i<26;++i) {
            if(count[i]!=0)
                return false;
        }

        return true;
    }
}
