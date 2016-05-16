package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class SendFactoryMulti {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
