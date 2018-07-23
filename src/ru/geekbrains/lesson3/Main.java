package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            guessNumber();
            System.out.println("Сыграть еще раз? 1 - ДА; другое - НЕТ");
            i = scanner.nextInt();
        } while(i == 1);
    }
    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(10);
        int number;
        System.out.println("Угадайте число от 0 до 9 с 3-х попыток");
        for(int i=1; i<4; i++){  //3 попытки
            System.out.println("Введите число (" + i +"-я попытка):" );
            number = sc.nextInt();
            if(number == a) {
                System.out.println("Вы угадали!");
                break;
            } else if(number > a) {
                System.out.println("Загаданное число меньше ;)");
            } else {
                System.out.println("Загаданное число больше ;)");
            }
            if(i == 3){
                System.out.println("Вы проиграли :(");
            }
        }

    }

}


