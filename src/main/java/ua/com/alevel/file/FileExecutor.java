package ua.com.alevel.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileExecutor {

//    private static SimpleFile simpleFile;

    public static void main(String[] args) throws IOException {
        SimpleFile simpleFile = new SimpleFile();
        simpleFile.checkLengthInside("D:/Projects/gradle_test/iua.doc");
        simpleFile.writeInside("D:/Projects/gradle_test/iua.doc");
        simpleFile.readInside("D:/Projects/gradle_test/iua.doc");
    }

}
