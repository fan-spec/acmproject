package leetcode.chapter4;

import java.util.LinkedList;

/**
 * Created by Y on 2016-05-09.
 */
public class Problem4_1_4 {

    public static void main(String[] args) {
        Problem4_1_4 p=new Problem4_1_4();

        System.out.println(p.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(p.evalRPN(new String[]{"4", "13", "5", "/", "+"}));


    }

    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack_num=new LinkedList<Integer>();

        String str;
        for(int i=0;i<tokens.length;++i) {
            str=tokens[i];
            if ((str.charAt(0) >= '0' && str.charAt(0) <= '9')||(str.length()>1)) {
                int num=Integer.parseInt(str);
                stack_num.push(num);
            }else{
                int b=stack_num.pop();
                int a=stack_num.pop();

                if (str.equals("+")) {
                    stack_num.push(a+b);
                } else if (str.equals("-")) {
                    stack_num.push(a-b);
                } else if (str.equals("*")) {
                    stack_num.push(a*b);
                } else if (str.equals("/")) {
                    stack_num.push(a/b);
                }
            }

        }


        return stack_num.peek();
    }


}
