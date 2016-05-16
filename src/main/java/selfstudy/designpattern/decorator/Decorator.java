package selfstudy.designpattern.decorator;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source=source;
    }

    @Override
    public void method() {
        System.out.println("Before the original method");
        source.method();
        System.out.println("After the original method");
    }
}
