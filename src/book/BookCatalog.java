package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCatalog {

    List<Book> bookList;

    public BookCatalog() {
        Book book1 = new Book("Head First Java", "Sierra & Bates", 300, 2018);
        Book book2= new Book("Head First HTML", "Maiara & Maraisa", 100, 2017);
        Book book3 = new Book("Head First CSS", "Leandro & Leonardo", 400, 2017);
        Book book4 = new Book("Head First Redes", "Maria & José", 200, 2017);
        Book book5 = new Book("Head First PHP", "Terra & Fogo", 50, 2017);

        this.bookList = new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4, book5));
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}
