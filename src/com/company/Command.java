package com.company;

import java.util.Scanner;

public class Command {
    public Language language;
    public Animal animal;

    public Command(){
        language = chooseLanguage();
        welcomeMessage(language);
        chooseAnimal(language);
        while(true) {
            chooseAction(language, animal);
        }
    }

    public void chooseObjectInfo(Language lng, Animal animal){
        int answer = getIntInput(lng.chooseObjectInfo());
        switch (answer) {
            case 1 -> ObjectInfo.showFields(animal);
            case 2 -> ObjectInfo.showSuperClass(animal);
            case 3 -> ObjectInfo.showOnlyInheritedMethods(animal);
            }
    }


    public void chooseAction(Language lng, Animal animal){
        int answer = getIntInput(lng.chooseAction());
        switch (answer) {
            case 1 -> System.out.println(animal.animalGreeting());
            case 2 -> chooseObjectInfo(lng, animal);
            case 3 -> {
                System.out.println(lng.goodbye());
                System.exit(0);}

        }
    }

    public void chooseAnimal(Language lng){
        int answer = getIntInput(lng.chooseAnimal());
        switch (answer) {
            case 1 -> animal = new Dog();
            case 2 -> animal = new Cat();
        }
    }

    public void welcomeMessage(Language lng){
        System.out.println(lng.welcome());
    }

    public Language chooseLanguage(){
        boolean validAnswer = false;
        Language lng = null;
        while (!validAnswer){
            int answer = getIntInput(
                    """
                            
                            Choose language:\s
                            
                            1) English\s
                            2) Dansk\s
                            3) Svenska\s
                            4) Norsk\s
                            """);

            switch (answer) {
                case 1 -> {
                    lng = new English();
                    validAnswer = true;
                }
                case 2 -> {
                    lng = new Dansk();
                    validAnswer = true;
                }
                default -> System.out.println("Not a valid input..\n");
            }
        }
        return lng;
    }

    public static String getStringInput(String s){
        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    public static int getIntInput(String s){
        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
