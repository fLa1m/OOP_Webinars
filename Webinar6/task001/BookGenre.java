package Webinar6.task001;

public class BookGenre implements Genre {
    String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }

}
