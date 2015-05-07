import java.util.ArrayList;

/**
 * Created by H2014154 on 2015-05-07.
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(){
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }
    public  void appendBook(Book book){
        books.add(book);
        last++;
    }
    public  int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
