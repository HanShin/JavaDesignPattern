package idcard;

import framework.Factory;
import framework.Product;

import java.util.*;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()),card.getOwner() );
    }
    public HashMap getDatabase(){
        return database;
    }
}
