package leetcode.chapter4;

import java.util.LinkedList;

/**
 * Created by Y on 2016-05-09.
 */
public class Problem4_0_232 {

    public static void main(String[] args) {

    }

    class MyQueue{
        LinkedList<Integer> list=new LinkedList<Integer>();


        // Push element x to the back of queue.
        public void push(int x) {
            list.addLast(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            if (list.size() > 0) {
                list.removeFirst();
            }
        }

        // Get the front element.
        public int peek() {
            if (list.size() > 0) {
                return list.getFirst();
            }
            return -1;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return list.size()>0?false:true;
        }

    }


}
