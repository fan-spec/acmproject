package acmbook.chapter2;

/**
 * Created by yuhaozhe on 2016/4/28.
 */
public class Problem2_1 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        for(int a=1;a<=9;++a){
            for(int b=0;b<=9;++b){
                for(int c=0;c<=9;++c){
                    if((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
                            ==(a*100+b*10+c)){
                        System.out.println(a*100+b*10+c);
                    }

                }
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("Time: "+(end-start)+" ms");
    }

}
