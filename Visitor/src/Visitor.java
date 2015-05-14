/**
 * Created by H2014154 on 2015-05-14.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
