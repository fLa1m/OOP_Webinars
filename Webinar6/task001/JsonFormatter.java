package Webinar6.task001;

import java.util.List;

public class JsonFormatter implements Formatter {

    @Override
    public void formatted(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.toString() + " переведена в формат: " + Format.JSON);
        }
    }

}
