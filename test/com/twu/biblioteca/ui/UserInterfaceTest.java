package com.twu.biblioteca.ui;
import book.BookCatalog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

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
    public void printMenuOptions_shouldShowOptions_whenProgramStarts() {
        UserInterface ui = new UserInterface();

        ui.printMenuOptions();
        Assert.assertThat(outContent.toString(), containsString("1 - List books"));
    }

    @Test
    public void chooseOption_shouldShowContent_whenUserChooseOneOption() {
        BookCatalog catalog = new BookCatalog();
        UserInterface ui = new UserInterface(catalog.getBookList());

        ui.chooseOption(1);
        String expectedFirstLine = String.format("%-20s %-20s %-20s\n", "Head First Java", "Sierra & Bates", "2018");
        String expectedSecondLine = String.format("%-20s %-20s %-20s\n", "Head First HTML", "Maiara & Maraisa", "2017");
        String expectedThirdLine = String.format("%-20s %-20s %-20s\n", "Head First CSS", "Leandro & Leonardo", "2017");

        Assert.assertThat(outContent.toString(), containsString("Book"));
        Assert.assertThat(outContent.toString(), containsString("Author"));
        Assert.assertThat(outContent.toString(), containsString("Year"));
        Assert.assertThat(outContent.toString(), containsString(expectedFirstLine));
        Assert.assertThat(outContent.toString(), containsString(expectedSecondLine));
        Assert.assertThat(outContent.toString(), containsString(expectedThirdLine));
    }

    @Test
    public void chooseOption_shouldPrintAnErrorMessage_whenTheOptionIsInvalid() {
        BookCatalog catalog = new BookCatalog();
        UserInterface ui = new UserInterface(catalog.getBookList());

        ui.chooseOption(0);

        Assert.assertThat(outContent.toString(), containsString("Select a valid option!"));
    }

}