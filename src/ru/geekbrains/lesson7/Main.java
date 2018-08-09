package ru.geekbrains.lesson7;

public class Main {

    public static void repast(Cat[] mas, Plate plate) {    //коты кушают
        for (int i=0; i < mas.length; i++){
            mas[i].eat(plate);
            mas[i].info();
            plate.info();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cat[] mas = new Cat[6];
        mas[0] = new Cat("Barsik", 19, false);
        mas[1] = new Cat("Ryzhik", 15, false);
        mas[2] = new Cat("Raketa", 16, false);
        mas[3] = new Cat("Pushok", 15, false);
        mas[4] = new Cat("Tisha", 17, false);
        mas[5] = new Cat("Tom", 20, false);

        Plate plate = new Plate(100);

        System.out.println("Покушать пришло котов: " + mas.length + ". В тарелке " + plate.getFood() + " единиц еды.");

       repast(mas, plate);


    }
}
