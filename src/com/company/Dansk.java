package com.company;

public class Dansk extends Language{
    @Override
    public String welcome() {
        return "\nHej og velkommen.";
    }

    @Override
    public String chooseAnimal() {
        return """
                
                Vælg dyr:\s
                
                1) Hund\s
                2) Kat\s
                """;
    }

    @Override
    public String chooseAction() {
        return """
                
                Vælg aktion:\s
                
                1) Hvad siger dyret\s
                2) Vis objekt info\s
                3) Stop programmet\s
                """;
    }

    @Override
    public String chooseObjectInfo() {
        return """
                
                Vælg hvilke objekt infomation du vil se:\s
                
                1) Vis alle fælter\s
                2) Vis Super klassen\s
                3) Vis kun nedarvet metoder\s
                """;
    }

    @Override
    public String goodbye() {
        return "\nFarvel og tak.";

    }
}
