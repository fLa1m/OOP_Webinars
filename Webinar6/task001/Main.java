package Webinar6.task001;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Library library = new Library(Arrays.asList(
                new Book("Книга1", "Автор1", 1990, new BookGenre("проза")),
                new Book("Книга2", "Автор2", 2000, new BookGenre("роман")),
                new Book("Книга3", "Автор3", 1995, new BookGenre("роман")),
                new Book("Книга4", "Автор3", 1998, new BookGenre("проза"))));

        System.out.println(library.authorSearch("Автор3"));

        Formatter formatter = new JsonFormatter();
        formatter.formatted(library.getBookList());
    }
}
