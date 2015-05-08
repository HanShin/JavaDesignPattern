/**
 * Created by H2014154 on 2015-05-08.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("인스턴스를 생성했습니다.");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
