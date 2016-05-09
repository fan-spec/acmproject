package leetcode.chapter3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by yuhaozhe on 2016/5/9.
 */
public class Problem3_14 {

    public static void main(String[] args) {
        Problem3_14 p=new Problem3_14();
        System.out.println(p.simplifyPath("/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///"));


    }

    public String simplifyPath(String path) {
        if (path == null || path.equals("")) {
            return "";
        }

        StringBuilder sb=new StringBuilder("");
        LinkedList<String> stack=new LinkedList<String>();

        for(int i=1;i<path.length();++i) {
            if (path.charAt(i) == '/') {
                if(sb.toString().equals("..")){
                    if(!stack.isEmpty())
                        stack.removeLast();
                } else if (!sb.toString().equals(".")&&sb.length()>0) {
                    stack.add(sb.toString());
                }

                sb = new StringBuilder("");
            } else {
                sb.append(path.charAt(i));
            }
        }
        if (sb.length() > 0) {
            if(sb.toString().equals("..")){
                if(!stack.isEmpty())
                    stack.removeLast();
            } else if (!sb.toString().equals(".")) {
                stack.add(sb.toString());
            }
        }

        sb=new StringBuilder();
        for (String str : stack) {
            if(!str.equals(""))
                sb.append("/"+str);
        }

        if (sb.length() == 0) {
            sb.append("/");
        }

        return sb.toString();
    }

}
