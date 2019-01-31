package com.davidschrik;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        for (int i =0; i<intArray.length; i++){
            System.out.println("the array " + intArray[i]);
        }

        int[] sortedArray = new int[intArray.length];
        sortedArray = sortArray(intArray);
        for (int i=0; i<sortedArray.length; i++){
            System.out.println("sorted array " + sortedArray[i]);
        }

        for (int i=0; i<intArray.length; i++){
            System.out.println("sorted array " + intArray[i]);
        }

    }

    public static int[] getIntegers(int intCnt){
        System.out.println("Enter " + intCnt + " integer values\r");
        int[] values = new int[intCnt];

        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortArray(int[] arrayIn){

//        int[] arrayOut = new int[arrayIn.length];
//
//        for (int i=0; i<arrayIn.length; i++ ){
//            arrayOut[i] = arrayIn[i];
//        }

        int[] arrayOut = Arrays.copyOf(arrayIn, arrayIn.length);

        for (int i=0; i < arrayOut.length; i++) {
            int temp = 0;
            for (int j=0; j<arrayOut.length-1; j++){
                if (arrayOut[j]<arrayOut[j+1]){
                    temp = arrayOut[j+1];
                    arrayOut[j+1] = arrayOut[j];
                    arrayOut[j] = temp;
                }
            }
        }
        return arrayOut;
    }
}
