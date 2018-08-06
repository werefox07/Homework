package ru.geekbrains.lesson6;

import java.util.Random;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        Random rand = new Random();
        maxRun = rand.nextInt(150) + 150;
        maxJump = rand.nextFloat() + 1f;
        type = "Кот";
    }

    @Override
    public void run(int len) {
        if (len <= Math.abs(this.maxRun)) {
            System.out.println("Кот пробежал " + len + " м.");
        } else {
            System.out.println("Кот не смог пробежать " + len + " м.");
        }

    }

    @Override
    public void jump(int height) {
        if (height <= Math.abs(this.maxJump)) {
            System.out.println("Кот подпрыгнул на " + height + " м.");
        } else {
            System.out.println("Кот не смог подпрыгуть на " + height + " м.");
        }
    }

    @Override
    public void swim(int len) {
        System.out.println("Не заставляйте кота плыть, он утонет.");
    }
}
