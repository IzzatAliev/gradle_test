package ua.com.alevel.collections.abstractvsinterface;

import ua.com.alevel.collections.Book;

public abstract class StudentAbstract {

    Book book = new Book();

    private String firstName;
    private String lastName;
    private int age;

    public StudentAbstract(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void hellos() {
        System.out.println("hello");
    }

    abstract void hello();

    abstract Book get();

    public Book create(){
        Book book = new Book();
        return book;
    }
}
