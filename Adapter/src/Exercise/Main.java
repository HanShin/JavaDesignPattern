package Exercise;

import java.io.IOException;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class Main {
    public static void main(String[] args){
        FileIO f = new FileProperties();
        try{
            f.readFromFile("C:\\Users\\h2014154\\MyProjects\\JavaDesignPattern\\Adapter\\src\\Exercise\\file.txt");
            f.setValue("year","2004");
            f.setValue("month", "4");
            f.setValue("day","21");
            f.writeToFile("C:\\Users\\h2014154\\MyProjects\\JavaDesignPattern\\Adapter\\src\\Exercise\\newfile.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
