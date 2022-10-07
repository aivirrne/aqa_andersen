package school.lesson7;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesApp {
    static void saveToFile(File file, AppData data) {
        try {
            FileWriter outputFile = new FileWriter(file);

            for (int i = 0; i < data.getHeader().length; i++) {
                outputFile.write(data.getHeader()[i]);
                if (i < data.getHeader().length - 1) {
                    outputFile.write(';');
                }
            }
            outputFile.write('\n');

            for (int i = 0; i < data.getData().length; i++) {
                for (int j = 0; j < data.getData()[i].length; j++) {
                    outputFile.write(String.valueOf(data.getData()[i][j]));
                    if (j < data.getData()[i].length - 1) {
                        outputFile.write(';');
                    }
                }
                outputFile.write('\n');
            }

            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static AppData readFromFile(File file) {
        Path filePath = Paths.get(file.getPath());
        Charset charset = StandardCharsets.UTF_8;
        try {
            List<String> lines = Files.readAllLines(filePath, charset);
            String[] header = lines.get(0).split(";");

            int[][] data = new int[lines.size()-1][];

            for (int i = 1; i < lines.size(); i++) {
                String[] items = lines.get(i).split(";");
                data[i - 1] = new int[items.length];
                for (int j = 0; j < items.length; j++) {
                    data[i - 1][j] = Integer.parseInt(items[j]);
                }
            }


            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return new AppData(new String[]{}, new int[][]{});
        }
    }

    public static void main(String[] args) {
        AppData data = new AppData(new String[]{"a", "b", "c"}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println("Initial data: " + data);
        File file = new File("./file.csv");
        saveToFile(file, data);
        AppData fromFile = readFromFile(file);
        System.out.println("Read from file: " + fromFile);
    }
}
