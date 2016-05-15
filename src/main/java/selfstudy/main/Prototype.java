package selfstudy.main;

import java.io.Serializable;

/**
 * Created by Y on 2016-05-15.
 */
public class Prototype implements Cloneable,Serializable {

    /*浅复制*/
    public Object clone() throws CloneNotSupportedException {
        Prototype proto= (Prototype) super.clone();
        return proto;
    }



}
