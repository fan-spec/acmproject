package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("Please input a valid type!");
            return null;
        }
    }

}
