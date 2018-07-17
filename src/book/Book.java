package book;

public class Book {

    String title;
    String author;
    int pageNumbers;
    int year;

    public Book(String title, String author, int pageNumbers, int year) {
        this.title = title;
        this.author = author;
        this.pageNumbers = pageNumbers;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }
}
