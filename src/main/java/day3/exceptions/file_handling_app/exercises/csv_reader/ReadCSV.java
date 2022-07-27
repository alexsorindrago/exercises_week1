package day3.exceptions.file_handling_app.exercises.csv_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.util.Objects.isNull;

public class ReadCSV {

    public static void main(String[] args) {
        //TODO fix this

        ReadCSV readCSV = new ReadCSV();
        String fileLocation = "D:\\dev\\Hcl Romania\\trainig\\exercises_week1\\src\\main\\java\\day3\\exceptions\\file_handling_app\\exercise1\\mapdemo.csv";

        readCSV.readCsv(fileLocation);
    }

    private void readCsv(String filepath) {

        File file = readFile(filepath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println(scanner.next());
    }

    public File readFile(String filePath) {
        if (isNull(filePath) || filePath.isEmpty()) {
            return null;
        }
        return new File(filePath);
    }
}
