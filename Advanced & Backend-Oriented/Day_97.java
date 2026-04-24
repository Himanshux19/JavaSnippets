// Day 97 : File read & write

import java.io.*;

public class Day_97 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello Everyone!");
            writer.newLine();
            writer.write("This is Read & Write example.");
            writer.newLine();
            writer.write("File handling in Java is important.");
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing to file:");
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nReading file content:\n");
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            System.out.println("\nFile read successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error while reading file:");
            e.printStackTrace();
        }
    }
}