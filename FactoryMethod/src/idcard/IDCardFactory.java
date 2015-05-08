package idcard;

import framework.Factory;
import framework.Product;

import java.util.*;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add((((IDCard)product).getOwner()));
    }
    public List getOwners(){
        return owners;
    }
}
