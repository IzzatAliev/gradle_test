package ua.com.alevel.algoritms.searchFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        SearchFile searchFile = new SearchFile();
        searchFile.searchFile(new File("C:\\"), fileList);
        for (File file:fileList){
            System.out.println(file.getAbsolutePath());
        }
    }

    public void searchFile(File rootFile, List<File> list) {
        if (rootFile.isDirectory()) {
            File[] files = rootFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchFile(file, list);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".doc")) {
                            list.add(file);
                        }
                    }
                }
            }
        }
    }
}
