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

    public void printMessage(String message) {
        System.out.println(getMessage(message));
    }

    public void printWelcomeMessage(String welcome) {
        System.out.println(welcome);
    }

    public void printBookList() {
        System.out.printf("%-20s %-20s %-20s\n", "Book", "Author", "Year");

        for(int index = 0; index < this.bookList.size(); index++) {

            System.out.printf("%-20s %-20s %-10s\n", this.bookList.get(index).getTitle(), this.bookList.get(index).getAuthor(), this.bookList.get(index).getYear());

        }
    }


    public void getMenuOptions() {
        System.out.println("1 - List books");
    }


    public void chooseOption(int option) throws Exception {
        switch (option){
            case 1: this.printBookList();
            default: throw new Exception();
        }

    }
}
