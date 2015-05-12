package factory;

import java.util.ArrayList;

/**
 * Created by H2014154 on 2015-05-11.
 */
public abstract class Tray extends Item {
   protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }
    public  void add(Item item){
        tray.add(item);
    }
}
