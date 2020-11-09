package ru.bondarev.homeworks.HW6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainHW6 {

    public static void main(String[] args) {

        GreatFile1("text1.txt");
        GreatFile2("text2.txt");
        glueFiles(new String[]{"text1.txt", "text2.txt"}, "text3.txt");


    }
// Задание 1.
// Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);


    public static void GreatFile1(String fileName1) {

        try {
            FileOutputStream fos = new FileOutputStream(fileName1);
            byte[] b = ("У лукоморья дуб зелёный;\n" +
                    "Златая цепь на дубе том:\n" +
                    "И днём и ночью кот учёный\n" +
                    "Всё ходит по цепи кругом;\n" +
                    "Идёт направо — песнь заводит,\n" +
                    "Налево — сказку говорит.\n" +
                    "Там чудеса: там леший бродит,\n" +
                    "Русалка на ветвях сидит;\n" +
                    "Там на неведомых дорожках\n" +
                    "Следы невиданных зверей;\n" +
                    "Избушка там на курьих ножках\n" +
                    "Стоит без окон, без дверей;\n" +
                    "Там лес и дол видений полны;\n" +
                    "Там о заре прихлынут волны\n" +
                    "На брег песчаный и пустой,\n" +
                    "И тридцать витязей прекрасных\n" +
                    "Чредой из вод выходят ясных,\n" +
                    "И с ними дядька их морской;\n" +
                    "Там королевич мимоходом\n" +
                    "Пленяет грозного царя;\n").getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void GreatFile2(String fileName2) {

        try {
            FileOutputStream fos = new FileOutputStream(fileName2);
            PrintStream ps = new PrintStream(fos);
            ps.println("Там в облаках перед народом\n" +
                    "Через леса, через моря\n" +
                    "Колдун несёт богатыря;\n" +
                    "В темнице там царевна тужит,\n" +
                    "А бурый волк ей верно служит;\n" +
                    "Там ступа с Бабою Ягой\n" +
                    "Идёт, бредёт сама собой,\n" +
                    "Там царь Кащей над златом чахнет;\n" +
                    "Там русский дух… там Русью пахнет!\n" +
                    "И там я был, и мёд я пил.\n" +
                    " - А.С. Пушкин");
            ps.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
// Задание 2.
// Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    public static void glueFiles(String[] names, String newName) {
        try {
            FileOutputStream fos = new FileOutputStream(newName);
            for (String name : names) {
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if (i != -1) {
                        fos.write(i);
                    }
                } while (i != -1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


// Чтение файла в консоль с изменением кодировки.
//        try (FileInputStream fis = new FileInputStream("text1.txt");
//             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
//             BufferedReader reader = new BufferedReader(isr)
//        ) {
//
//            String str;
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

}





















