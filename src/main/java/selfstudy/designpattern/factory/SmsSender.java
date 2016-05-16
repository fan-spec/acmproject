package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("This is sms sender!");

    }

}
