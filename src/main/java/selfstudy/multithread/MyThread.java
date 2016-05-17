package selfstudy.multithread;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class MyThread implements Runnable {
    private Generator g;

    public MyThread(Generator g) {
        this.g=g;
    }
    @Override
    public void run() {
        for(int i=1;i<=20;++i) {
            System.out.println(Thread.currentThread().getName()+"-"+i+"-"+g.getVal());
        }
    }

    public static void main(String[] args) {
        Generator g=new Generator();
        Thread a=new Thread(new MyThread(g));
        Thread b=new Thread(new MyThread(g));

        a.start();
        b.start();
    }

}
