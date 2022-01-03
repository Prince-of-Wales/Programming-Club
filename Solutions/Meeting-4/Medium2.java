// Write a program to find the largest and smallest number in a given array. Array: 9, 3, 5, 9, 19, 294, 94, 287, 33, 87, 56, 37, 56, 42, 78, 89, 1, 5, 8, 4, 9, 89, 4, 74, 32, 29 

public class Medium2 {
  public static void main(String[] args) {
    int[] myArray = {9, 3, 5, 9, 19, 294, 94, 287, 33, 87, 56, 37, 56, 42, 78, 89, 1, 5, 8, 4, 9, 89, 4, 74, 32, 29};
    int length = myArray.length; // used to make program more readable
    int min = myArray[0];
    int max = myArray[0];
    for (int i = 0; i < length; i++) {
      if (myArray[i] > max) {
        max = myArray[i];
      }
      if (myArray[i] < min) {
        min = myArray[i];
      }
    }
    System.out.println("Min: "+min);
    System.out.println("Max: "+max);
  }
}
