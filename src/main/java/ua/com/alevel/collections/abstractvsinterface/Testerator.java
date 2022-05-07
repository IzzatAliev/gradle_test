package ua.com.alevel.collections.abstractvsinterface;

import ua.com.alevel.collections.Book;

public class Testerator extends StudentAbstract implements StudentInterface {

    public Testerator(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public static void main(String[] args) {

    }

    @Override
    public Book get() {
        return new Book();
    }

    @Override
    public Book create() {
        return StudentInterface.super.create();
    }
}
