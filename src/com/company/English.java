package com.company;

public class English extends Language{
    @Override
    public String welcome() {
        return "\nHello and welcome.";
    }

    @Override
    public String askName() {
        return "What's the name: ";
    }

    @Override
    public String askAge() {
        return "What's the age: ";
    }

    @Override
    public String chooseAnimal() {
        return """
                                
                Choose animal:\s
                
                1) Dog\s
                2) Cat\s
                """;
    }

    @Override
    public String chooseAction() {
        return """
                
                Choose action:\s
                
                1) What does the animal say\s
                2) Show object info\s
                3) Quit\s
                """;

    }

    @Override
    public String chooseObjectInfo() {
        return """
                
                Choose object info to display:\s
                
                1) Show all fields\s
                2) Show Superclass\s
                3) Show only inherited methods\s
                """;
    }

    @Override
    public String goodbye() {
        return "\nGoodbye and take care.";
    }
}
