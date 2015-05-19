/**
 * Created by H2014154 on 2015-05-19.
 */
public interface State {
    public abstract void doClock(Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
