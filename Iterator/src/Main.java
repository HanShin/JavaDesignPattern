import java.time.Clock;

/**
 * Created by H2014154 on 2015-05-07.
 */
public class Main {
    public  static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("a"));
        bookShelf.appendBook(new Book("b"));
        bookShelf.appendBook(new Book("c"));
        bookShelf.appendBook(new Book("d"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
