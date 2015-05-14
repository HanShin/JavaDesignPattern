import java.util.Iterator;

/**
 * Created by H2014154 on 2015-05-14.
 */
public class ListVisitor extends Visitor{
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
   }
}
