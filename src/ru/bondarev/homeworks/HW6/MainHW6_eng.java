package ru.bondarev.homeworks.HW6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MainHW6_eng {
    public static void main(String[] args) {
            try    {
                FileOutputStream fos = new FileOutputStream("text4.txt");
                PrintStream ps = new PrintStream(fos);
                ps.println("The Leaves Are Falling Down\n" +
                        "The leaves are falling down,\n" +
                        "The leaves are falling down,\n" +
                        "School is here and fall in near,\n" +
                        "The leaves are falling down.\n" +
                        "\n" +
                        "The leaves are falling down,\n" +
                        "The leaves are falling down,\n" +
                        "Some are red and some are brown,\n" +
                        "The leaves are falling down.\n" +
                        "\n" +
                        "The leaves are falling down,\n" +
                        "The leaves are falling down,\n" +
                        "They tickle your nose and touch your toes,\n" +
                        "The leaves are falling down.\n" +
                        "June Haggard");
                ps.close();
            } catch (
            IOException e)

            {
                System.out.println(e.getMessage());
            }
}



}
