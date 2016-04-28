package acmbook.chapter1;

import java.util.Scanner;

/**
 * Created by yuhaozhe on 2016/4/28.
 */
public class Test {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(true){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println("a: "+a+" b: "+b);

            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("a: "+a+" b: "+b);

        }

    }

}
