package book;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getTitle() {
        Book book = new Book("Head First Java", "Sierra & Bates", 300, 2018);
        Assert.assertEquals("Head First Java", book.getTitle());
    }

    @Test
    public void getAuthor() {
        Book book = new Book("Head First Java", "Sierra & Bates", 300, 2017);
        Assert.assertEquals("Sierra & Bates", book.getAuthor());
    }

    @Test
    public void getPageNumbers() {
        Book book = new Book("Head First Java", "Sierra & Bates", 300, 2016);
        Assert.assertEquals(300, book.getPageNumbers());
    }

}