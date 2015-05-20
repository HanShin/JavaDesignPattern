/**
 * Created by H2014154 on 2015-05-20.
 */
public class Main {
    public static void main(String[] args){
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");
    }
}
