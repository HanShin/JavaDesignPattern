package framework;
/**
 * Created by H2014154 on 2015-05-11.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
