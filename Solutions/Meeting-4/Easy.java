/* Initalize an Integer array to have the valaue 10, -4, 39, -999, -23, 16, 35, -5, 49, -8 
Using a for-loop, iterate through the array and print whether the value is even or odd and greater or less than zero. 
*/

public class Easy {
  public static void main(String[] args) {
    int[] myArray = {10, -4, 39, -999, -23, 16, 35, -5, 49, -8};
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("Odd");
      }
      if (myArray[i] > 0) {
        System.out.println("Greater than zero");
      } else if (myArray[i] < 0) {
        System.out.println("Less than zero");
      }
    }
  }
}
