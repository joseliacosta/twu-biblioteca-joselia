package com.twu.biblioteca;


import book.Book;
import book.BookCatalog;
import com.twu.biblioteca.ui.UserInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();
        ui.printWelcomeMessage("Welcome to Biblioteca");

        BookCatalog catalog = new BookCatalog();

        ui.printBookList(catalog.getBookList());


    }


}
