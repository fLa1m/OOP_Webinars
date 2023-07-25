package Webinar6.task001;

public class ElectronBook extends Book {
    String format;
    Double size;

    public ElectronBook(String name, String author, int year, BookGenre genre, String format, Double size) {
        super(name, author, year, genre);
        this.format = format;
        this.size = size;
    }

    public ElectronBook() {

    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ElectronBook [name=" + super.getName() + ", author=" + super.getAuthor() + ", year=" + super.getYear()
                + ", format=" + format + ", size=" + size + "]";
    }

}
