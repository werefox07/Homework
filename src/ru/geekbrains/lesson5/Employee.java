package ru.geekbrains.lesson5;

public class Employee {
    private String full_name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employee (String full_name, String position, String email, String phone_number, int salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.println("Full name: " + full_name + "; " +
                "Position: " + position + "; " +
                "Email: " + email + "; " +
                "Phone number: " + phone_number + "; " +
                "Salary: " + salary + "; " +
                "Age: " + age
        );
    }

    public int getAge() {
        return this.age;
    }

}



