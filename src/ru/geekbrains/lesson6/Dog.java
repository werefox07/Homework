package ru.geekbrains.lesson6;


import java.util.Random;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        Random rand = new Random();
        maxRun = rand.nextInt(200) + 400;
        maxJump = (rand.nextFloat() * 0.4f) + 0.3f;
        maxSwim = rand.nextInt(5) + 7;
        type = "Собака";
    }

    @Override
    public void run(int len) {
        if (len <= Math.abs(this.maxRun)) {
            System.out.println("Собака пробежала " + len + " м.");
        } else {
            System.out.println("Собака не смогла пробежать " + len + " м.");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= Math.abs(this.maxJump)) {
            System.out.println("Собака подпрыгнула на " + height + " м.");
        } else {
            System.out.println("Собака не смогла подпрыгнуть на " + height + " м.");
        }
    }

    @Override
    public void swim(int len) {
        if (len <= this.maxSwim) {
            System.out.println("Собака проплыла " + len + " м.");
        } else {
            System.out.println("Собака не смогла проплыть " + len + " м.");
        }
    }

}
