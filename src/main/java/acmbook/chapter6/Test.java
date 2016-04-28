package acmbook.chapter6;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by yuhaozhe on 2016/4/28.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(true){
            int ok=1;
            int n=in.nextInt();
            int[] target=new int[n+1];
            for(int i=1;i<=n;++i){
                target[i]=in.nextInt();
            }
            Stack<Integer>  stack=new Stack<Integer>();

            int pa=1,pb=1;

            while(pb<=n){
                if(pa==target[pb]){
                    ++pa;
                    ++pb;
                }else if(!stack.empty()&&target[pb]==stack.peek()){
                    stack.pop();
                    ++pb;
                }else if(pa<n){
                    stack.push(pa++);
                }else{
                    ok=0;
                    break;
                }

            }

            System.out.println(ok==1?"Yes":"No");
        }

    }

}
