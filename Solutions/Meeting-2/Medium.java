// Using a while loop, starting at a 0, keep adding a given integer i to the total sum until the total sum exceeds 200.

public class Medium {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int i = sc.nextInt();
    int sum = 0; 
    
    while (sum < 200) {
      sum += i; 
      i++; 
    }
    System.out.println(i);
  }
}

