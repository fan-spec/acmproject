package selfstudy.designpattern.adapter;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is targetable's method!");
    }
}
