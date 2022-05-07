package ua.com.alevel.collections.abstractvsinterface;

import ua.com.alevel.collections.Book;

@FunctionalInterface
public interface StudentInterface {

    Book book = new Book();

    String firstName = "kiril";
    String lastName = "rokot";
    int age = 12;

    Book get();

    default Book create(){
        Book book = new Book();
        return book;
    }
}
