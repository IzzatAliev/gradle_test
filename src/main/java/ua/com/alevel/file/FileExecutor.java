package ua.com.alevel.file;

import java.io.IOException;

public class FileExecutor {

    public static void main(String[] args) throws IOException {
        SimpleFile simpleFile = new SimpleFile();
        simpleFile.checkLengthInside("D:/Projects/gradle_test/iua.doc");
        simpleFile.writeInside("D:/Projects/gradle_test/iua.doc");
        System.out.println();
        System.out.println();
        System.out.println();
        simpleFile.readInside("D:/Projects/gradle_test/iua.doc");
    }

}
