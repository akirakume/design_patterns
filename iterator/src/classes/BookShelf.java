package classes;

import java.util.ArrayList;
import java.util.Iterator;


// ConcreteAggregate（具体的な集合体）の役
public class BookShelf implements Iterable<Book>{
    private ArrayList<Book> books = new ArrayList<>();
//    private int last = 1;

//    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
//    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
//        last++;
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}