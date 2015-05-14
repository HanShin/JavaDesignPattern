import java.util.Iterator;

/**
 * Created by H2014154 on 2015-05-14.
 */
public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
