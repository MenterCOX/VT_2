package task16;

import task12.Book;

import java.util.Comparator;

public class PriceComp implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}