package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class SendFactoryMultiStatic {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
