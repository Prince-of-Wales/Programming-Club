public class Hard {
  public static void main(String[] args) {
    // input is between 0 - 100 both inclusive
    int oneSubject = /* input */;
    int twoSubject = /* input */;
    int threeSubject = /* input */;
    int fourSubject = /* input */;
    int fiveSubject = /* input */;
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
