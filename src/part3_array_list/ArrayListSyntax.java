package part3_array_list;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListSyntax {
    //method with enhanced for loop to print array
    private static void printArrListInt(ArrayList<Integer> list) {
        for (Integer lis : list) {
            System.out.print(lis + " ");
        }
        System.out.println();
    }

    private static void printArrListStr(ArrayList<String> list) {
        for (String lis : list) {
            System.out.print(lis + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rd = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("The initial integer array list:  ");
        //method add(value) and regular for loop
        for (int i = 0; i < 16; i++) {
            numbers.add(rd.nextInt(100));
        }
        printArrListInt(numbers);
        //method add(index, value)
        //method get()
        //method set()
        //method remove()
        //method addAll()
        //method indexOf()
        numbers.add(3, 66);
        int a = numbers.set(4, 99);
        numbers.remove(5);
        int b = numbers.get(9);
        numbers.indexOf(99);

        ArrayList<Integer> specialNumbers = new ArrayList<>();
        specialNumbers.add(22);
        specialNumbers.add(12);
        specialNumbers.add(26);
        specialNumbers.add(11);
        numbers.addAll(2, specialNumbers);
        numbers.remove(Integer.valueOf(22));

        System.out.println("The integer array list with some changes:");
        printArrListInt(numbers);

        ArrayList<String> fruits = new ArrayList<>();
        //method add(value)
        //method add(index, value)
        //method get()
        //method set()
        //method remove()
        //method addAll()
        //method indexOf()
        //method remove()
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("peach");
        fruits.add("orange");
        fruits.add("pear");

        System.out.println("The initial string array list: ");
        printArrListStr(fruits);

        fruits.add(3, "mango");
        String fruit1 = fruits.get(2);
        fruits.set(1, "melon");
        fruits.remove("pear");

        ArrayList<String> specialFruits = new ArrayList<>();
        specialFruits.add("kiwi");
        specialFruits.add("grape");
        specialFruits.add("strawberry");
        fruits.addAll(0, specialFruits);
        int fruit2 = fruits.indexOf("banana");

        //regular for loop and method remove()
        for (int i = 0; i < fruits.size(); i += 2) {
            fruits.remove(i);
        }

        System.out.println("The string array list with some changes: ");
        printArrListStr(fruits);
    }
}
