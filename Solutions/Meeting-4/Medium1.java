// Given an integer array, reverse the order of the array. Ex. 1, 2, 3, 4, 5 –> 5, 4, 3, 2, 1 Array: 31, 24, 76, 8, 9, 342, 546, 3 

import java.util.Arrays; // used for checking the value. Not important to program's functionality

public class Medium1 {
  public static void main(String[] args) {
    int[] myArray = {31, 24, 76, 8, 9, 342, 546, 3};
    for (int i = 0; i < myArray.length / 2; i++) {
      int temp = myArray[i];
      myArray[i] = myArray[myArray.length - i - 1];
      myArray[myArray.length - i - 1] = temp;
    }
    int[] check = {3, 546, 342, 9, 8, 76, 24, 31}; // could be removed
    System.out.println(Arrays.equals(myArray, check)); // could be removed
  }
}
