/**
 * Created by H2014154 on 2015-05-13.
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        for(int i= 0; i < getRows(); i++){
            System.out.println(getRowText(i));
        }
    }
}
