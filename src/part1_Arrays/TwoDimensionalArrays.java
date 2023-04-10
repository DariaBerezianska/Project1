package part1_Arrays;

public class TwoDimensionalArrays {
    private static int[][] initializeArray1(int rows, int columns, int value) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
            }
        }
        return array;
    }

    private static int[][] initializeArray2(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = j;
            }
        }
        return array;
    }

    private static int[][] initializeArray3(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = counter;
                counter++;
            }
        }
        return array;
    }

    private static int[][] initializeArray4(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int counter = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = counter;
                counter--;
            }
            counter += 10;
        }
        return array;
    }

    private static int[][] initializeArray5(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int counter = 24;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = counter;
                counter--;
            }
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array1 = initializeArray1(5, 5, 5);
        int[][] array2 = initializeArray2(5, 5);
        int[][] array3 = initializeArray3(5, 5);
        int[][] array4 = initializeArray4(5, 5);
        int[][] array5 = initializeArray5(5, 5);


        System.out.println("Array1:");
        printArray(array1);

        System.out.println("Array2:");
        printArray(array2);

        System.out.println("Array3:");
        printArray(array3);

        System.out.println("Array4:");
        printArray(array4);

        System.out.println("Array5:");
        printArray(array5);
    }

}

