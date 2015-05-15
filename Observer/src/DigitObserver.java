/**
 * Created by H2014154 on 2015-05-15.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){}
    }
}
