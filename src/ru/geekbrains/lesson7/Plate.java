package ru.geekbrains.lesson7;

public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int i) {
        food += i;
    }

}
