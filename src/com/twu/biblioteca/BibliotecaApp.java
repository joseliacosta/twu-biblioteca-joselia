package com.twu.biblioteca;

import book.BookCatalog;
import com.twu.biblioteca.ui.UserInterface;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) throws Exception {

        BookCatalog catalog = new BookCatalog();

        UserInterface ui = new UserInterface(catalog.getBookList());
        ui.printWelcomeMessage("Welcome to Biblioteca");

        int option = 1;
        while(option != 0){
            ui.printMenuOptions();
            System.out.println("Please, choose one option");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            ui.chooseOption(option);
        }


    }
}
