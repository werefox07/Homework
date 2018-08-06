package ru.geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(  "Котя");
        Dog dog = new Dog("Цербер");

        cat.animalInfo();
        cat.run(200);
        cat.jump(1);
        cat.swim(7);
        System.out.println();
        dog.animalInfo();
        dog.run(300);
        dog.jump(2);
        dog.swim(9);
    }
}
