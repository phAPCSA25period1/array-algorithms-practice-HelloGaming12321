package com.csplusplus;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int arrayVal : array){
            sum += arrayVal;
        }
        return sum;
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        int max = array[0];
        for(int arrayVal : array){
            if(arrayVal > max){
                max = arrayVal;
            }
        }
        return max;
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        boolean isAscending = true;
        int prevVal = -2147483648;
        for(int arrayVal : array){
            if(arrayVal < prevVal){
                isAscending = false;
            }
            prevVal = arrayVal;
        }
        return isAscending;
    }

    // 5. Implement a method that counts how many times a given number appears in the array.
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        int timesAppeared = 0;
        for(int arrayVal : array){
            if(number == arrayVal){
                timesAppeared++;
            }
        }
        return timesAppeared;
    }
}
