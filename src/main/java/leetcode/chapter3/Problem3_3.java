package leetcode.chapter3;

/**
 * Created by Y on 2016-05-06.
 */
public class Problem3_3 {

    public static void main(String[] args) {

    }

    public int myAtoi(String str) {
        str = str.trim();
        if (str.equals("")) {
            return 0;
        }

        if (str.charAt(0) == '-') {
            long num = 0;

            for (int i = 1; i < str.length(); ++i) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    if (num > 0) {
                        break;
                    } else {
                        return 0;
                    }
                }

                if (-num<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }

                num = num * 10 + (str.charAt(i) - '0');
            }

            if (-num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else
                return -(int) num;
        } else if (str.charAt(0) == '+') {
            long num = 0;

            for (int i = 1; i < str.length(); ++i) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    if (num > 0) {
                        break;
                    } else {
                        return 0;
                    }
                }

                if (num > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;

                num = num * 10 + (str.charAt(i) - '0');
            }

            if (num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                return (int) num;

        } else {
            long num = 0;

            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    if (num > 0) {
                        break;
                    } else {
                        return 0;
                    }
                }

                if (num > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;

                num = num * 10 + (str.charAt(i) - '0');
            }

            if (num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                return (int) num;
        }

    }

}
