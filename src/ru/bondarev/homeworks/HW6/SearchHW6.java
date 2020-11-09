package ru.bondarev.homeworks.HW6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SearchHW6 {

    public static void main(String[] args) {
        SearchFile("text4.txt", "Haggard");

    }

// Задание 3.
// Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
    public static void SearchFile(String fileName, String word) {

        try{
            FileInputStream fis = new FileInputStream(fileName);
            int symbol;
            int index = 0;
            byte[] wordBytes = word.getBytes();
            do{
                symbol = fis.read();
                if (wordBytes[index] == symbol){
                    index++;
                    if (index == wordBytes.length){
                        System.out.println("Слово найдено.");
                        break;
                    }
                }else{
                    index = 0;
                }
            }while (symbol != -1);


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




