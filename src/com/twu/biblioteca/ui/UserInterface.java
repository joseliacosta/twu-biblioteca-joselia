package com.twu.biblioteca.ui;

import book.Book;

import java.util.List;

public class UserInterface {

    public String getMessage(String message) {
        return message;
    }

    public void printMessage(String message) {
        System.out.println(getMessage(message));
    }

    public void printWelcomeMessage(String welcome) {
        System.out.println(welcome);
    }

    public void printBookList(List<Book> bookList) {
        System.out.printf("%-20s %-20s %-20s\n", "Book", "Author", "Year");

        for(int index = 0; index < bookList.size(); index++) {

            System.out.printf("%-20s %-20s %-10s\n", bookList.get(index).getTitle(), bookList.get(index).getAuthor(), bookList.get(index).getYear());

        }
    }


    public void getMenuOptions() {
        System.out.println("1 - List books");
    }
}
