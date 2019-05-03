package com.Yulia.workWithText.fileWork;

import java.io.*;

public class BufferedFileWork {
    private static String readFilePath = "ReadFile.txt";
    private static String writeFilePath = "WriteFile.txt";


    public static String readFromFile() {
        try (BufferedReader bufReader = new BufferedReader(
                new FileReader(readFilePath))) {
            String text = "";
            String newStr = bufReader.readLine();
            while (newStr != null) {
                text += newStr;
                text += "\n";
                newStr = bufReader.readLine();
            }
            return text;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeInFile(String text) {
        try (BufferedWriter bufWriter = new BufferedWriter(
                new FileWriter(writeFilePath))) {

            bufWriter.write(text);
            bufWriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
