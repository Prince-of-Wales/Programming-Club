public class Hard {
  public static void main(String[] args) {
    int 1Subject = /* input */;
    int 2Subject = /* input */;
    int 3Subject = /* input */;
    int 4Subject = /* input */;
    int 5Subject = /* input */;
    int average = (1Subject+2Subject+3Subject+4Subject+5Subject)/5;
    if (average >= 90) {
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
