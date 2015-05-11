/**
 * Created by H2014154 on 2015-05-07.
 */
public class BookShelfIterator implements Iterator {
    private  BookShelf bookShelf;
    private  int index;
    public  BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
