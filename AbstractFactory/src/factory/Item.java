package factory;

/**
 * Created by H2014154 on 2015-05-11.
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
