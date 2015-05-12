import java.util.Random;

/**
 * Created by H2014154 on 2015-05-12.
 */
public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private  int[][] history ={
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvlaue = 0;
        if(bet < history[currentHandValue][0]){
            handvlaue = 0;
        } else if(bet < history[currentHandValue][0] + history[currentHandValue][1]){
            handvlaue = 1;
        } else {
            handvlaue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvlaue;
        return Hand.getHand(handvlaue);
    }

    private int getSum(int hv){
        int sum = 0;
        for(int i = 0; i < 3 ; i++){
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHandValue][currentHandValue]++;
        } else{
            history[prevHandValue][(currentHandValue+1) % 3]++;
            history[prevHandValue][(currentHandValue+2) % 3]++;
        }
    }

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

}
