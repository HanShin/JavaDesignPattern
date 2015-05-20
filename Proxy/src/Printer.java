/**
 * Created by H2014154 on 2015-05-20.
 */
public class Printer implements Printable{
    public Printer() {
        heavyJob("Printer의 인스턴스를 생성 중");
    }

    public Printer(String name){
        this.name = name;
        heavyJob("Printer의 인스턴스를 생성 중");
    }

    private String name;

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " +  name + " ===");
    }

    private void heavyJob(String msg){
        System.out.print(msg);
        for(int i = 0; i < 5; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.print(".");
        }
        System.out.println("완료.");
    }
}
