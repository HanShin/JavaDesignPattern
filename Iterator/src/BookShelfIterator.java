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
        if(index < bookShelf.getLength()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
