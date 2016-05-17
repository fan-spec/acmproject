package selfstudy.multithread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Generator {
    private AtomicInteger val=new AtomicInteger(0);

    public int getVal() {
        return val.incrementAndGet();
    }

}
