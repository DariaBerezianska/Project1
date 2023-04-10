package part4_read_write_to_file;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input file name:");
        String userInput = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(userInput);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileName = userInput + ".txt";
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            int lineNum = 1;
            String line = bufferedReader.readLine();
            while (line != null) {
                printWriter.printf("[%03d] %s%n", lineNum, line);
                lineNum++;
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("There is no file with name " + userInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

