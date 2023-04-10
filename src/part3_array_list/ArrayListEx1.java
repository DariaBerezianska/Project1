package part3_array_list;

import java.util.ArrayList;

public class ArrayListEx1 {
    //method for printing string array list
    private static void printArrListStr(ArrayList<String> list) {
        for (String lis : list) {
            System.out.print(lis + " ");
        }
        System.out.println();
    }

    private static void insertName(ArrayList<String> list, String name) {
        int i = 0;
        while (i < list.size() && name.compareTo(list.get(i)) > 0) {
            i++;
        }
        list.add(i, name);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alexandr");
        names.add("Solomia");
        names.add("Mark");
        names.add("Vlada");
        insertName(names, "Daria");
        printArrListStr(names);
    }
}

