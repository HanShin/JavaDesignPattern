import java.util.ArrayList;
import java.util.List;

/**
 * Created by H2014154 on 2015-05-15.
 */
public class Memento {
    int money;
    ArrayList fruits;
    public int getMoney(){
        return money;
    }
    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit){
        fruits.add(fruit);
    }
    List getFruits(){
        return (List)fruits.clone();
    }
}
