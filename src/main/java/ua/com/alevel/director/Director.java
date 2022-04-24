package ua.com.alevel.director;

public class Director {

    private static Director instance = null;

    private Director(){

    }

    public static Director getInstance(){
        if (instance == null){
           instance = new Director();
        }
        return instance;
    }
}
