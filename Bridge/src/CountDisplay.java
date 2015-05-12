/**
 * Created by H2014154 on 2015-05-12.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for(int i = 0; i <times ; i++){
            print();
        }
        close();
    }

}
