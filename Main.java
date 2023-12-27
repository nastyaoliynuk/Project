package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = InputArray(); 
        bubbleSort(array);
        OutputArray(array); 
    }

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Error! Please enter an integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int[] InputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = getIntInput(scanner);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = getIntInput(scanner);
        }

        return array; 
    }

    private static void OutputArray(int[] array) {
        System.out.println("Array after sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " element: "+ array[i] );
        }
    }
}
