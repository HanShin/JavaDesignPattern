/**
 * Created by H2014154 on 2015-05-08.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Start.");
        SingletoneEnum obj1 = SingletoneEnum.INSTANCE;
        SingletoneEnum obj2 = SingletoneEnum.INSTANCE;
        obj1.TestMethod();
        obj2.TestMethod();
        /*Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        */
        if(obj1 == obj2){
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else{
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }
        System.out.println("End.");
    }
}
