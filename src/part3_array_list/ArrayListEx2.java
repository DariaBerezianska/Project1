package part3_array_list;

import java.util.ArrayList;

public class ArrayListEx2 {
    //method for making array list with the same values
    private static ArrayList<Integer> makeArrListSameValue(ArrayList<Integer> list, int value) {
        for (int i = 0; i < 5; i++) {
            list.add(value);
        }
        return list;
    }

    //method for printing integer array list
    private static void printArrListInt(ArrayList<Integer> list) {
        for (Integer lis : list) {
            System.out.print(lis + " ");
        }
        System.out.println();
    }

    //method for making array from 1 to 10
    private static ArrayList<Integer> makeArrList1to10(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        return list;
    }

    private static void arrayListRemove(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            int value1 = list.get(i);
            if (value == value1) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Array list with applying arrayListRemove method: ");
        printArrListInt(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        printArrListInt(makeArrListSameValue(list1, 6));
        printArrListInt(makeArrList1to10(list2));
        //QUESTION !!!
        arrayListRemove(list1, 6);//all elements are removed
        //QUESTION!!!!
        arrayListRemove(list1, 3);//no elements are removed
        arrayListRemove(list2, 1);//the first element is removed
        arrayListRemove(list2, 10);//the last element is removed
        arrayListRemove(list2, 5);//the middle element is removed
        arrayListRemove(list3, 8);//the empty list

    }
}
