import java.util.ArrayList;
import java.util.List;

/**
 * Created by H2014154 on 2015-05-11.
 */
public class Triple {
    private static Triple[] triples = new Triple[]{
        new Triple(),
        new Triple(),
        new Triple()
    };
    private Triple(){
        System.out.println("인스턴스를 만들었습니다.");
    }
    public static Triple getInstance(int id){
        return triples[id];
    }

}
