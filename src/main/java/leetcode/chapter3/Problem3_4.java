package leetcode.chapter3;

/**
 * Created by Y on 2016-05-06.
 */
public class Problem3_4 {

    public static void main(String[] args) {
        Problem3_4 p=new Problem3_4();

        System.out.println(p.addBinary("111","11"));


    }

    public String addBinary(String a, String b) {
        if(a.trim().equals(""))
            return b.trim();
        if(b.trim().equals(""))
            return a.trim();

        int carry=0;
        StringBuilder sb=new StringBuilder();
        int numA,numB;
        int i,j;
        for(i=a.length()-1,j=b.length()-1;i>=0&&j>=0;--i,--j) {
            numA=a.charAt(i)-'0';
            numB=b.charAt(j)-'0';

            if(numA+numB+carry>1){
                sb.insert(0,numA+numB+carry-2+"");
                carry=1;
            }else{
                sb.insert(0,numA+numB+carry+"");
                carry=0;
            }

        }

        while (i >= 0) {
            numA=a.charAt(i)-'0';
            if (numA + carry > 1) {
                sb.insert(0,numA+carry-2+"");
                carry=1;
            }else{
                sb.insert(0,numA+carry+"");
                sb.insert(0,a.substring(0,i));
                carry=0;
                break;
            }

            --i;
        }

        while (j >= 0) {
            numB=b.charAt(j)-'0';
            if (numB + carry > 1) {
                carry=1;
                sb.insert(0,numB+carry-2+"");
            }else{
                sb.insert(0,numB+carry+"");
                sb.insert(0,b.substring(0,j));
                carry=0;
                break;
            }

            --j;
        }

        if(carry>0)
            sb.insert(0,"1");

        return sb.toString();
    }

}
