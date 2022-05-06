package ua.com.alevel.stream;

public class StreamMain {

    public static void main(String[] args) {
        SimpleStream simpleStream = new SimpleStream();
        simpleStream.add();
        System.out.println(simpleStream.list);
        simpleStream.sortAsc();
    }
}
