package selfstudy.designpattern.proxy;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        this.source=new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before() {
        System.out.println("Before the method");
    }

    public void after() {
        System.out.println("After the method");
    }

}
