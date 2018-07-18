package com.twu.biblioteca.ui;

import book.Book;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    List<Book> bookList;

    public UserInterface() {

    }

    public UserInterface(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getMessage(String message) {
        return message;
    }

    private void printMessage(String message) {
        System.out.println(getMessage(message));
    }

    public void printWelcomeMessage(String welcome) {
        System.out.println(welcome);
    }

    private void printBookList() {
        System.out.println("\n=======================");
        System.out.println("       Book List");
        System.out.println("=======================\n");

        System.out.printf("%-20s %-20s %-20s\n", "Book", "Author", "Year");

        for(int index = 0; index < this.bookList.size(); index++) {

            System.out.printf("%-20s %-20s %-20s\n", this.bookList.get(index).getTitle(), this.bookList.get(index).getAuthor(), this.bookList.get(index).getYear());

        }
    }


    public void printMenuOptions() {
        System.out.println("\n=======================");
        System.out.println("      MENU OPTIONS");
        System.out.println("=======================\n");
        System.out.println("1 - List books");
        System.out.println("0 - Quit Library");
    }


    public void chooseOption(int option) {

        switch (option){
            case 1: this.printBookList();
                break;

            default: printMessage("Select a valid option!");
                break;
        }
    }
}
