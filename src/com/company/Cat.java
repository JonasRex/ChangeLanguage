package com.company;

public class Cat extends Animal{
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String animalGreeting() {
        return "\nBrhhhhh";
    }
}
