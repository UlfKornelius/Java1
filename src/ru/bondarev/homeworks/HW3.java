package ru.bondarev.homeworks;

import java.util.Random;
import java.util.Scanner;

public class HW3 {

    private static final char HUMAN_DOT = 'X';
    private static final char PC_DOT = 'O';
    private static final char EMPTY_DOT = '_';
    private static final int TO_WIN = 4; // выйгрышная комбинация

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static int fieldSizeX;
    public static int fieldSizeY;
    public static char[][] field;

    public static void initMap() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты через Enter: ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));
        field[y][x] = HUMAN_DOT;
    }

    public static void pcTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(y, x));
        field[y][x] = PC_DOT;
    }


    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return field[y][x] == EMPTY_DOT;
    }
    // использование цикла для определения победителя
    public static boolean checkWin(char c) {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkLine(y, x, 0, 1, c)) return true;   // проверим линию по х
                if (checkLine(y, x, 1, 1, c)) return true;   // проверим по диагонали х у
                if (checkLine(y, x, 1, 0, c)) return true;   // проверим линию по у
                if (checkLine(y, x, -1, 1, c)) return true;  // проверим по диагонали х -у
            }
        }
        return false;
    }


    // метод для проверки линии
    private static boolean checkLine(int y, int x, int vy, int vx, char c) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > fieldSizeX - 1 || wayY > fieldSizeY - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != c) return false;
        }
        return true;
    }
    // старый метод для определения победителя
//            if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//            if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//            if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//            if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//            if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//            if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//            if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//            if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//            return false;
//        }

    public static boolean isFullMap(){
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN_DOT)) {
                System.out.println("Ты выйграл! Ура!)");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья.");
                break;
            }
            System.out.println();
            pcTurn();
            printMap();
            if (checkWin(PC_DOT)) {
                System.out.println("Компьютер выйграл.");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья.");
                break;
            }
            System.out.println();
        }
    }

}
