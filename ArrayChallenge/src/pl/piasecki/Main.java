package pl.piasecki;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] array = getIntegers(5);
        printArray(sortIntegers(array));
    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " numbers:\r");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];

        for (int i=0; i<sortedArray.length; i++){
            sortedArray[i] = array[i];
        }

        boolean loopAgain = true;
        while(loopAgain){
            loopAgain = false;
            int record;
            for (int i=1; i<sortedArray.length; i++){
                if (sortedArray[i-1] < sortedArray[i]){
                    record = sortedArray[i];
                    sortedArray[i] = sortedArray[i-1];
                    sortedArray[i-1] = record;
                    loopAgain = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray( int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
