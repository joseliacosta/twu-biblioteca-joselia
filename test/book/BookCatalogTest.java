package book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BookCatalogTest {

    @Test
    public void getBookList_shouldReturnAListOfAllBooks() {
        BookCatalog bookList = new BookCatalog();

        List<Book> listBook = bookList.getBookList();

        Assert.assertEquals(5, listBook.size());

    }
}