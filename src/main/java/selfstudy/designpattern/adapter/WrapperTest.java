package selfstudy.designpattern.adapter;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class WrapperTest {

    public static void main(String[] args) {
        Wrapper wrapper=new Wrapper(new Source());

        wrapper.method1();
        wrapper.method2();
    }

}
