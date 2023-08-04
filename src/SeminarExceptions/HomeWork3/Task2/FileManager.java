package SeminarExceptions.HomeWork3.Task2;

import java.io.*;

public class FileManager {
    /**
     * Метод, который создает файл.
     *
     * @throws IOException Если создать не получилось.
     */
    public static void createFile (){
        File myfile = new File("myfile.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Метод, который читает файл.
     *
     * @throws FileNotFoundException (файл не найден), IOException (ошибка ввода-вывода).
     */

    public static void readFile(){
        File myFile = new File("myfile.txt");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        byte[] buffer = new byte[1024];
        int bytesRead;
        while (true) {
            try {
                if (!((bytesRead = inputStream.read(buffer)) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print(new String(buffer, 0, bytesRead));
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Метод, который записывает в файл.
     *
     * @throws FileNotFoundException (файл не найден), IOException (ошибка ввода-вывода).
     */
    public static void writeFile (){
        File myFile = new File("myfile.txt");
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        byte[] buffer = "Hello, world!".getBytes();
        try {
            outputStream.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Метод, который удаляет файл.
     *
     */
    public static void deliteFile(){
        File myFile = new File("myfile.txt");
        myFile.delete();
    }

}
