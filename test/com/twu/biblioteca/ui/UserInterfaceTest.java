package com.twu.biblioteca.ui;

import book.Book;
import book.BookCatalog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class UserInterfaceTest {

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }


    @Test
    public void printWelcomeMessage_shouldPrintWelcomeMessage_whenReceiveAString() {
        UserInterface ui = new UserInterface();

        ui.printWelcomeMessage("Welcome");

        assertThat(outContent.toString(), containsString("Welcome"));
    }

    @Test
    public void printBookList_shouldPrintAllBooksDetails_whenReceiveABookList() {
        UserInterface ui = new UserInterface();
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Java", "Autor", 300, 2017);
        Book book2 = new Book("C#", "Autor 2", 300, 2018);
        bookList.add(book1);
        bookList.add(book2);

        ui.printBookList();

        Assert.assertThat(outContent.toString(), containsString("Book"));
        Assert.assertThat(outContent.toString(), containsString("Author"));
        Assert.assertThat(outContent.toString(), containsString("Year"));
        Assert.assertThat(outContent.toString(), containsString("Java"));
        Assert.assertThat(outContent.toString(), containsString("2017"));
        Assert.assertThat(outContent.toString(), containsString("C#"));
        Assert.assertThat(outContent.toString(), containsString("Autor 2"));
        Assert.assertThat(outContent.toString(), containsString("2018"));
    }

    @Test
    public void getMenuOptions_shouldShowOptions_whenProgramStarts() {
        UserInterface ui = new UserInterface();

        ui.getMenuOptions();
        Assert.assertThat(outContent.toString(), containsString("1 - List books"));
    }

    @Test
    public void chooseOption_shouldShowContent_whenUserChooseOneOption() throws Exception {
        BookCatalog catalog = new BookCatalog();
        UserInterface ui = new UserInterface(catalog.getBookList());

        ui.chooseOption(1);
        Assert.assertTrue(outContent.size() > 0);

    }

    @Test(expected = Exception.class)
    public void chooseOption_shouldThrowAnException_whenUserChooseInvalidOption() throws Exception {
        BookCatalog catalog = new BookCatalog();
        UserInterface ui = new UserInterface(catalog.getBookList());
        ui.chooseOption(0);

    }


}