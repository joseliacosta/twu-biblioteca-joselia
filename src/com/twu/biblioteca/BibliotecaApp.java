package com.twu.biblioteca;


import book.Book;
import book.BookCatalog;
import com.twu.biblioteca.ui.UserInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {

        BookCatalog catalog = new BookCatalog();

        UserInterface ui = new UserInterface(catalog.getBookList());
        ui.printWelcomeMessage("Welcome to Biblioteca");

        System.out.println("Please, choose one option");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        ui.getMenuOptions();

        ui.chooseOption(option);

    }


}
