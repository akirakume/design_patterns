package classes;

import java.util.Iterator;
import java.util.NoSuchElementException;


// ConcreteIterator（具体的な反復子）の役
public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }


    // 次にnextメソッドを読んでも大丈夫かどうかを調べるもの
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }


    // returnCurrentElementAndAdvanceToNextPosition
    // 現在の要素を返しつつ、次の位置に進める
    @Override
    public Book next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}