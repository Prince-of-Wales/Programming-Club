import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n < 0)
			System.out.println("False");
		
		else {
			int temp = n;
			int res = 0;
			
			while (temp != 0) {
				res = res*10 + temp%10;
				temp /= 10;
			}
			
			if (res == n)
				System.out.println("True");
			else
				System.out.println("False");
		} 
  }
}
