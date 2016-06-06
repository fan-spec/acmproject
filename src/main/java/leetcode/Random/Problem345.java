package leetcode.Random;

/**
 * Created by Y on 2016-06-05.
 */
public class Problem345 {

    public static void main(String[] args) {

    }


    public String reverseVowels(String s) {
        if(s==null||s.length()==1)
            return s;

        char[] chArr=s.toCharArray();
        int i=0,j=chArr.length-1;
        char ch;
        while (i < j) {
            if (isVowel(chArr[i]) && isVowel(chArr[j])) {
                ch=chArr[i];
                chArr[i]=chArr[j];
                chArr[j]=ch;

                ++i;--j;
            } else if (!isVowel(chArr[i])) {
                ++i;
            } else {
                --j;
            }
        }

        return new String(chArr);
    }

    public boolean isVowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
