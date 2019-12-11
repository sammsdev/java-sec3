package Sec8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quantos numeros? ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        array = readIntegers(array,count);
        array = reverseArray(array);
        System.out.println("Reverse = " + Arrays.toString(array));
        int min = findMin(array);
        System.out.println("min = " + min);
        scanner.close();
    }

    public static int[] readIntegers(int[] array, int count) {
        for (int i = 0; i < count; i++)
            array[i] = scanner.nextInt();
        return array;
    }

    public static int findMin(int[] array){
        int aux;
        for(int i = 0; i<array.length; i++){
            for(int j = 0 ; j <= i; j++){
                if(array[j] > array[i]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j]  = aux;
                }
            }
        }
        return  array[0];
    }

    public static  int[] reverseArray(int[] array) {
        int aux = 0;
        int[] newArray = new int[array.length];
        for(int i = array.length-1; i >= 0; i--){
            newArray[aux] = array[i];
            System.out.println(newArray[aux]);
            aux++;
        }
        return  newArray;
    }

}
