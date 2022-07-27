package day3.exceptions.file_handling_app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingApp {

    String filePath = "D:\\dev\\Hcl Romania\\trainig\\exercises_week1\\src\\main\\java\\day3\\exceptions\\file_handling_app";

    public static void main(String[] args) {

        try {
            FileHandlingApp fileHandlingApp = new FileHandlingApp();
            fileHandlingApp.createFile("myFile1.txt");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void createFile(String fileName) throws IOException {
        File f = new File(filePath + "\\" + fileName);

        boolean status = f.exists();
        System.out.println(status);

        status = f.createNewFile();
        System.out.println(status);

        writeDataOverFile(f);

        readFile(f);
    }

    public void writeDataOverFile(File f) throws IOException {

        FileWriter fw = new FileWriter(f, false); // change to TRUE to be able to update, not replace
        PrintWriter pw = new PrintWriter(f);

        pw.write("Hello");
        pw.close();

        System.out.println("-------DONE---------");
    }

    public void readFile(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));

        String line = "";

        line = br.readLine();
        System.out.println("--->> " + line);
    }
}
