import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by H2014154 on 2015-06-01.
 */
public class Main {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;
            while((text = reader.readLine()) != null){
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
