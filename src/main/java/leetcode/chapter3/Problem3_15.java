package leetcode.chapter3;

/**
 * Created by yuhaozhe on 2016/5/9.
 */
public class Problem3_15 {

    public static void main(String[] args) {
        Problem3_15 p=new Problem3_15();

        long start1=System.currentTimeMillis();
        System.out.println(p.lengthOfLastWord_v3("Hello World   dfe feDFEFieje ewEE ewwwwwwwwwwww werweiofd weoifw we  ewfrwei fwe         weroih EWFEFWEFEWF WEFOWEIFN WEOIWJEROIWEJO WE W ER WEROIOWFNE FWJ"));
        long end1=System.currentTimeMillis();

        System.out.println("time1: "+(end1-start1));

    }

    //0ms
    public int lengthOfLastWord_v3(String s) {
        if(s==null||s.length()==0)
            return 0;

        int end=s.length()-1,start=0;

        while(end>=0&&s.charAt(end)==' '){
            --end;
        }
        start=end;
        while(start>=0&&s.charAt(start)!=' '){
            --start;
        }
        return end-start;
    }

    //4ms
    public int lengthOfLastWord_v2(String s) {
        s=s.trim();
        int count=0;
        for(int i=0;i<s.length();++i) {
            if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                ++count;
            }
        }

        return count;
    }

    //3ms
    public int lengthOfLastWord_v1(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        String[] strs=s.split(" ");
        if(strs.length>0){
            return strs[strs.length-1].length();
        }

        return 0;
    }



}
