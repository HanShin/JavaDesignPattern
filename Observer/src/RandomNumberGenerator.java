import java.util.Random;

/**
 * Created by H2014154 on 2015-05-15.
 */
public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i = 0; i < 20; i++){
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
