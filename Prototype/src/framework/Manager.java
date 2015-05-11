package framework;

import java.util.HashMap;

/**
 * Created by H2014154 on 2015-05-11.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }
    public  Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
