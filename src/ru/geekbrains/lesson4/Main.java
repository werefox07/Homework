package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '•';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)) {
                System.out.println("Победил игрок");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
            }
            aiTurn();
            printMap();
            if(checkWin(DOT_O)){
                System.out.println("Победил ИИ");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static void initMap() {  //инициализировать поле
        map = new char[SIZE][SIZE];
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap(){ //вывести поле
        for(int i=0; i<=SIZE; i++) {   //вывод шапки
            System.out.print(i + " ");
        }
        System.out.println();          //вывод тела поля
        for(int i=0; i<SIZE; i++){
            System.out.print(i + 1 + " ");
            for(int j=0; j<SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean checkWin(char symb) { //проверить выигрыш
        int count;
        for(int i = 0; i < SIZE; i++) {    //проверка столбцов
            count = 0;
            for(int j=0; j<SIZE; j++) {
                if (map[i][j] == symb) {
                    count++;
                }
            }
            if (count == SIZE) {
                    return true;
            }
        }
        for (int j=0; j<SIZE; j++) {  //проверка строк
            count = 0;
            for(int i=0; i<SIZE; i++) {
                if (map[i][j] == symb) {
                    count++;
                }
            }
            if (count == SIZE) {
                return true;
            }

        }
        count = 0;
        for (int i=0; i<SIZE; i++) {    //проверка диагонали
                if (map[i][i] == symb) {
                    count++;
            }
        if (count == SIZE) {
                return true;
        }
        }
        count = 0;
        for(int j=0; j<SIZE; j++) {   //проверка 2-й диагонали
            if (map[j][j] == symb) {
                count++;
            }
        }
        if (count == SIZE) {
            return true;
        }
        return false;
    }
    public static boolean isMapFull() {  //проверить поле на заполнененность
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if(map[i][j] == DOT_EMPTY) return false;
            }
        } return true;
    }
    public static boolean isCellValid(int x, int y) { //проверить установку ячейки
        if(x<0||x>=SIZE||y<0||y>=SIZE)return false;
        if(map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void aiTurn() { //компьютер ходит ноликом
    int x,y;
        do{
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x,y));
          System.out.println("Компьютер походил в точку" + (x+1) +""+(y+1));
          map[y][x] = DOT_O;
    }
    public static void humanTurn() { //игрок ходит крестиком
    int x, y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (!isCellValid(x,y)); //пока ячейка занята или значения введены неверно
            map[y][x] = DOT_X;
    }

}
