/**
 * Created by H2014154 on 2015-05-12.
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
