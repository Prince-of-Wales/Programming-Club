// Given a set of numbers, using an array and for-loop, find the sum of all the numbers.

public class Easy2 {
  public static void main(String[] args) {
    int[] sumArray = {1,72,43,4,5,26,7,8,19,10};
    int sum = 0;
    for (int myInt : sumArray) {
      sum += myInt;
    }
    System.out.println(sum);
  }
}
