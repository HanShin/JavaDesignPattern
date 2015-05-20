/**
 * Created by H2014154 on 2015-05-20.
 */
public class Main {
    public static void main(String[] args){
        if(args.length == 0){
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
