package org.example.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericMethod {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] booleanArray = {true, false, true, false};
    static String[] shoppingItems = {"oranges", "cauliflower", "marrow", "walnut"};

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(booleanArray, new ArrayList<>());
        System.out.println(intList.get(0));
        printShoppingList(shoppingItems);
    }

    public static <T> List<T> arrayToList(
            T[] array, List<T> list) {
        for (T obj : array) {
            list.add(obj);
        }
        return list;
    }

   /* public static void printShoppingList(String string1, String string2) {
        System.out.println("Shopping List");
        System.out.println(string1);
        System.out.println(string2);
    }

    public static void printShoppingList(String string1, String string2, String string3) {
        System.out.println("Shopping List");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }

    public static void printShoppingList(String[] items) {
        for(String item : items) {
            System.out.println(item);
        }
    }*/

    //pass the list into method directly
    public static void printShoppingList(String... items) {
        for(String item : items) {
            System.out.println(item);
        }
    }
}
