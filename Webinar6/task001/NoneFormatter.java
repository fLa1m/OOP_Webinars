package Webinar6.task001;

import java.util.List;

public class NoneFormatter implements Formatter {

    @Override
    public void formatted(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString() + " переведена в формат: " + Format.NONE);
        }
    }

}
