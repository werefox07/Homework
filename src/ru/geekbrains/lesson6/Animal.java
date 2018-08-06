package ru.geekbrains.lesson6;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected float maxJump;
    protected int maxSwim;
    protected String type;

    public Animal (String name) {
        this.name = name;
    }

    public void animalInfo () {
        System.out.println (type + " " + name);
        System.out.println("Макс. длина бега: " + maxRun + ", макс. высота прыжка: " + maxJump +
                ", макс. длина заплыва: " + maxSwim);
    }

    public abstract void run (int len);

    public abstract void jump (int height);

    public abstract void swim (int len);
}
