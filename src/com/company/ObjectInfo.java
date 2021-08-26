package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.TreeSet;

public class ObjectInfo {

    public static TreeSet<String> showAllMethods(Object o){

        TreeSet<String> stringSet = new TreeSet<>();
        Method[] methods = o.getClass().getMethods();

        for(Method method : methods){
            stringSet.add(method.getName());
//            System.out.println(method.getName());
        }

        return stringSet;
    }

    public static TreeSet<String> showObjectsMethods(Object o){
        TreeSet<String> stringSet = new TreeSet<>();
        Method[] methods = o.getClass().getDeclaredMethods();

//        System.out.println("\nMetoder i objected: \n");
        for(Method method : methods){
            stringSet.add(method.getName());
//            System.out.println(method.getName());
        }
        return stringSet;
    }

    public static void showFields(Object o){
        Field[] fields = o.getClass().getDeclaredFields();
        System.out.println("");
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }

    public static void showSuperClass(Object o){
        System.out.println("");
        System.out.println( o.getClass().getSimpleName() + " --------> " +o.getClass().getSuperclass().getSimpleName());
    }

    public static void removeDuplicates(Object o){
        Method[] methods = o.getClass().getDeclaredMethods();
    }

    public static void showOnlyInheritedMethods(Object o){
        System.out.println("");
        TreeSet<String> classMethods = showObjectsMethods(o);
        TreeSet<String> allMethods = showAllMethods(o);

        allMethods.removeAll(classMethods);

        for (String s : allMethods) {
            System.out.println(s);
        }
    }


}
