package factory;

/**
 * Created by H2014154 on 2015-05-11.
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }

}
