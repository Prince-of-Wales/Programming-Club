// Given an integer input, check if the input is even or not.
import java.util.Scanner;

public class Easy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    if (i % 2 == 0) {
      System.out.println("The input is even.");
    } else {
      System.out.println("The input is odd.");
    }
  }
}
