package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Ivanov Sergey", "Engineer", "iv@gmail.com",
               "880055543", 50000,31 );
        emp[1] = new Employee("Anisimov Andrey", "Мanager", "an@gmail.com",
                "89510053", 45000,27);
        emp[2] = new Employee("Volkova Anna", "Technical Director", "boss@mail.ru",
                "899917823", 65000, 41);
        emp[3] = new Employee("Kotova Marina", "Designer", "web@yandex.ru",
                "887155312", 50000, 25);
        emp[4] = new Employee("Timofeev Alexey", "System Administrator", "admin@gmail.com",
                "890183429", 45000, 43);

        for (int i = 0; i<emp.length; i++) {  //вывод информации о сотрудниках старше 40 лет;
            if (emp[i].getAge() > 40) {
                emp[i].printInfo();
            }
        }
    }
}
