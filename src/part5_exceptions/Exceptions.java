package part5_exceptions;

public class Exceptions {
    public static void main(String[] args) {
        //part5.1
        try {
            int[] array = {3, 6, 7};
            array[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        //part5.2
        try {
            int[] array1 = {3, 6, 7};
            array1[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This error always will occur when you try to access to non-existent element");
        }

    }
}
