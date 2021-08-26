package com.company;

public class Dog extends Animal{
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String animalGreeting() {
        return "\nBark Bark";
    }
}
