package leetcode.chapter4;

import java.util.ArrayList;

/**
 * Created by Y on 2016-05-09.
 */
public class Problem4_0_225 {

    public static void main(String[] args) {

    }


    class MyStack {
        ArrayList<Integer> list=new ArrayList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            list.add(x);
        }

        // Removes the element on top of the stack.
        public void pop() {
            if (list.size() > 0) {
                list.remove(list.size()-1);
            }
        }

        // Get the top element.
        public int top() {
            if (list.size() > 0) {
                return list.get(list.size()-1);
            }
            return -1;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return list.size()>0?false:true;
        }
    }

}
