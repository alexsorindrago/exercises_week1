package day3.exceptions.file_handling_app.exercises.file_reader;

import java.io.File;

import static java.util.Objects.isNull;

public class ReadFile {

    String location = "https://github.com/fsdtrinings/NCSCoreJava/blob/main/Collection%20Map%20Assignment/mapdemo.csv";


    public static void main(String[] args) {


        ReadFile readFile = new ReadFile();
        readFile.scan(readFile.location);

    }

    public void scan(String folderPath) {
        if (isNull(folderPath) || folderPath.isEmpty()) {
            return;
        }

        File directory = new File(folderPath);

        if (isNull(directory.listFiles())) {
            return;
        }

        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + " is a directory");
            } else {
                System.out.println(file.getName() + " is a " + getFileExtension(file));
            }
        }
    }


    private String getFileExtension(File file) {
        String name = file.getName();
        return name.substring(name.lastIndexOf("."));
    }
}
