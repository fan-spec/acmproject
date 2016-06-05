package leetcode.Random;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem171 {

    public static void main(String[] args) {

    }

    public int titleToNumber(String s) {
        char[] charArray=s.toCharArray();

        int col=0;
        int rad=1;
        for(int i=charArray.length-1;i>=0;--i) {
            col+=(charArray[i]-'A'+1)*rad;
            rad*=26;
        }

        return col;
    }

}
