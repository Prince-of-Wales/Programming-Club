/*
If average percentage >= 90%: Grade A 
If average percentage >= 80%: Grade B 
If average percentage >= 70%: Grade C 
If average percentage >= 60%: Grade D 
If average percentage >= 40%: Grade E 
If average percentage < 40%: Grade F 
*/

import java.util.Scanner;

public class Hard {
  public static void main(String[] args) {
    // input is between 0 - 100 both inclusive
    Scanner sc = new Scanner(System.in);
    int oneSubject = sc.nextInt();
    int twoSubject = sc.nextInt();
    int threeSubject = sc.nextInt();
    int fourSubject = sc.nextInt();
    int fiveSubject = sc.nextInt();
    int average = (oneSubject+twoSubject+threeSubject+fourSubject+fiveSubject)/5;
    if (average == 100) {
      System.out.println("A+");
    } else if (average >= 90) {
      System.out.println("A");
    } else if (average >= 80) {
      System.out.println("B");
    } else if (average >= 70) {
      System.out.println("C");
    } else if (average >= 60) {
      System.out.println("D");
    } else if (average >= 40) {
      System.out.println("E");
    } else if (average < 40) {
      System.out.println("F");
    }
  }
}
