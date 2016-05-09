package leetcode.chapter3;

/**
 * Created by Y on 2016-05-07.
 */
public class Problem3_12 {

    public static void main(String[] args) {
        Problem3_12 p=new Problem3_12();

        System.out.println(p.countAndSay(1));
        System.out.println(p.countAndSay(2));
        System.out.println(p.countAndSay(3));
        System.out.println(p.countAndSay(4));
        System.out.println(p.countAndSay(5));
        System.out.println(p.countAndSay(6));


    }

    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder("1");
        StringBuilder tempSb=new StringBuilder();
        int count=0;

        for(int i=1;i<n;++i) {
            for(int j=0;j<sb.length();++j) {
                if (j < sb.length() - 1) {
                    if (sb.charAt(j) == sb.charAt(j + 1)) {
                        ++count;
                    } else {
                        tempSb.append((++count)+""+sb.charAt(j));
                        count=0;
                    }
                } else {
                    count=count>0?(count+1):1;
                    tempSb.append(count+""+sb.charAt(j));
                    count=0;
                }
            }

            sb=tempSb;
            tempSb=new StringBuilder();

        }


        return sb.toString();
    }

}
