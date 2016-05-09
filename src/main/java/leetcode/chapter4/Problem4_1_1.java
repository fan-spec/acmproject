package leetcode.chapter4;

import java.util.LinkedList;

/**
 * Created by yuhaozhe on 2016/5/9.
 */
public class Problem4_1_1 {

    public static void main(String[] args) {
        Problem4_1_1 p=new Problem4_1_1();

        System.out.println(p.isValid("([])")+"");

    }

    public boolean isValid(String s) {
        LinkedList<Character> stack=new LinkedList<Character>();

        for(int i=0;i<s.length();++i) {
            if(!stack.isEmpty()){
                if (stack.getLast() == '(' && s.charAt(i) == ')') {
//                    stack.pop();
                    stack.removeLast();
                } else if (stack.getLast() == '{' && s.charAt(i) == '}') {
//                    stack.pop();
                    stack.removeLast();
                } else if (stack.getLast() == '[' && s.charAt(i) == ']') {
//                    stack.pop();
                    stack.removeLast();
                } else {
//                    stack.push(s.charAt(i));
                    stack.addLast(s.charAt(i));
                }

            }else{
                stack.addLast(s.charAt(i));
            }
        }

        return stack.size()>0?false:true;
    }

}
