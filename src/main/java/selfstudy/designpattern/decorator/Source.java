package selfstudy.designpattern.decorator;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("This is original method!");
    }

}
