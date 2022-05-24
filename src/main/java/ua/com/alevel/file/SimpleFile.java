package ua.com.alevel.file;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class SimpleFile {

    public void createFile(String path) {
        File file = new File(path);
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createDirectory(String path) {
        File file = new File(path);
        System.out.println(file.mkdir());
    }

    public void createDirectories(String path) {
        File file = new File(path);
        System.out.println(file.mkdirs());
    }

    public void deleteFile(String path) {
        File file = new File(path);
        System.out.println(file.delete());
    }

    public void deleteIfThereAreSubFiles(String path) {
        File file = new File(path);
        FileUtils.deleteQuietly(file);
    }

    public void renameFile(String pathBefore, String pathTo) {
        File file = new File(pathBefore);
        System.out.println(file.renameTo(new File(pathTo)));
    }

    public void checkLengthInside(String path) {
        File file = new File(path);
        System.out.println(file.length());
    }

    public void readInside(String path) throws IOException {
        try (Reader reader = new FileReader(path)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            Stream<String> lines = bufferedReader.lines();
            lines.forEach(System.out::println);
        }
    }

    public void writeInside(String path) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(path);
             FileWriter fileWriter = new FileWriter(path, true)) {
            outputStream.write(new byte[]{'a', 'b'});
            String s = "Hello world";
            fileWriter.write('\n');
            fileWriter.write(s);
            fileWriter.flush();
            s = "\n Again";
            Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
        }
    }
}
