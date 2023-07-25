package Webinar6.task001;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {

    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Library() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Library [bookList=" + bookList + "]";
    }

    @Override
    public List<Book> authorSearch(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

}
