package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
    public void info() {
        System.out.println("name: " + name + ", full: " + full);
    }

    public boolean eat(Plate p) {
        boolean isAte = p.decreaseFood(appetite);
        if (isAte) {
            full = true;
            return this.full;
        } else {
            full = false;
            return this.full;
        }
    }
}
