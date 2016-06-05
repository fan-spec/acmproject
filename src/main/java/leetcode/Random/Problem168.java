package leetcode.Random;

/**
 * Created by Y on 2016-06-04.
 */
public class Problem168 {

    public static void main(String[] args) {
        System.out.println((char)('A'+25)+" ");
    }

    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();

        while (n > 0) {
            sb.insert(0,(char)((--n)%26+'A'));
            n/=26;
        }

        return sb.toString();
    }
}
