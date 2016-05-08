package leetcode.chapter3;

/**
 * Created by Y on 2016-05-06.
 */
public class Problem3_1 {

    public static void main(String[] args) {
        Problem3_1 p=new Problem3_1();


        System.out.println(p.isPalindrome_v2("A man, a plan, a canal: Panama"));

    }

    public boolean isPalindrome_v2(String s) {
        if(s.trim().equals(""))
            return true;

        s=s.trim().toLowerCase();
        StringBuilder sb=new StringBuilder();
        int pre=0,post=s.length()-1;

        while (pre < post){
            if(!((s.charAt(pre)>='0'&&s.charAt(pre)<='9')||(s.charAt(pre)>='a'&&s.charAt(pre)<='z'))){
                ++pre;
                continue;
            }else if(!((s.charAt(post)>='0'&&s.charAt(post)<='9')||(s.charAt(post)>='a'&&s.charAt(post)<='z'))){
                --post;
                continue;
            }else{
                if ((s.charAt(pre)-s.charAt(post))!=0) {
                    return false;
                }
            }
            ++pre;
            --post;
        }

        return true;
    }

    public boolean isPalindrome_v1(String s) {
        if(s.trim().equals(""))
            return true;

        s=s.trim().toLowerCase();
        StringBuilder sb=new StringBuilder();
        char ch;
        for(int i=0;i<s.length();++i){
            ch=s.charAt(i);
            if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')){
                sb.append(ch);
            }
        }
        s=sb.toString();

        int pre=0,post=s.length()-1;
        while(pre<post){
            if(s.charAt(pre)!=s.charAt(post))
                return false;

            ++pre;
            --post;
        }

        return true;
    }

}
