package selfstudy.designpattern.decorator;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source=new Source();
        Sourceable obj=new Decorator(source);
        obj.method();
    }
}
