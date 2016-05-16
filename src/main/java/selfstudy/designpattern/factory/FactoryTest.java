package selfstudy.designpattern.factory;

/**
 * Created by Y on 2016-05-15.
 */
public class FactoryTest {
    public static void main(String[] args) {
//        sendFactoryTest();
//        sendFactoryMultiTest();
        sendFactoryMultiStaticTest();
    }

    public static void sendFactoryTest() {
        SendFactory factory=new SendFactory();
        Sender sender=factory.produce("mail");
        sender.send();
    }

    public static void sendFactoryMultiTest() {
        SendFactoryMulti factory=new SendFactoryMulti();
        Sender sender=factory.produceMail();
        sender.send();
    }

    public static void sendFactoryMultiStaticTest() {
        Sender sender=SendFactoryMultiStatic.produceMail();
        sender.send();
    }

}
