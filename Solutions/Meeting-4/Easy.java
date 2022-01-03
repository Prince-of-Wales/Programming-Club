/* Initialize an Integer array to have the value: [10, -4, 39, -999, -23, 16, 35, -5, 49, -8]. 
Using a for-loop, iterate through the array and print all the negative numbers.   
*/

public class Easy {
  public static void main(String[] args) {
    int[] myArray = {10, -4, 39, -999, -23, 16, 35, -5, 49, -8};
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] < 0) {
        System.out.println(myArray[i]);
      }
    }
  }
}
