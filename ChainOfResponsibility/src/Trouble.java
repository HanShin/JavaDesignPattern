/**
 * Created by H2014154 on 2015-05-14.
 */
public class Trouble {
    private int number;
    public Trouble(int number){
        this.number = number;
    }

    public  int getNumber(){
        return number;
    }

    public String toString(){
        return "[Trouble " + number + "]";
    }
}
