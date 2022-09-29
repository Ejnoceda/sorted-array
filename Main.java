package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            public static int getIntegers(int z) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter " + z + " numbers: ");
                Integer[] intArray = new Integer[z];
                for (int i = 0; i < z; i++) {
                    intArray[i] = input.nextInt();

                }
                PrintArray(intArray);
                SortIntegers(intArray);

            }
        }
        public static void PrintArray(Integer[] intArray){
            System.out.println("The array before sorting is: " + Arrays.toString(intArray));
        }

        public static void SortIntegers(Integer[] intArray){
            Arrays.sort(intArray, Collections.reverseOrder());
            System.out.println("The array after sorting is: " + Arrays.toString(intArray));
        }
    }

}
