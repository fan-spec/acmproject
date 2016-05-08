package leetcode.chapter3;

/**
 * Created by Y on 2016-05-06.
 */
public class Problem3_2 {

    public static void main(String[] args) {

        Problem3_2 p=new Problem3_2();
        System.out.println(p.strStr_v2("abcbd","cb"));
        System.out.println(p.strStr_v2("",""));
        System.out.println(p.strStr_v2(" "," "));

    }

    //算法复杂度为O(m*n)
    public int strStr_v2(String haystack, String needle) {
        if(haystack.equals("")&&needle.equals(""))
            return 0;

        for(int i=0,j;i<=haystack.length()-needle.length();++i){
            for(j=0;j<needle.length();++j){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }

            if(j==needle.length()){
                return i;
            }
        }

        return -1;
    }

    //利用Java的String.substring()方法，速度回快点
    public int strStr_v1(String haystack, String needle) {
        if(haystack.equals("")&&needle.equals(""))
            return 0;

        for(int i=0;i<haystack.length();++i){
            if(haystack.length()-i<needle.length())
                break;

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }

        return -1;
    }

}
