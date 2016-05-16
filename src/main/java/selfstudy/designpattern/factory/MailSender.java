package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("This is mailsender!!");
    }

}
