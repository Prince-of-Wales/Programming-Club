import java.util.Scanner;

public class CountPrimes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    boolean[] notPrimes = new boolean [n];
    if (n <= 2) System.out.println(0);
		
    else {
      	int count = 1; //initializing that 2 is prime
	
	for (int i = 3; i < n; i += 2) { //skipping all even numbers
		if (!notPrimes[i]) {
			count++;
				
			for (int j = 1; j*i < n; j++) { //all multiples of the prime number are not primes
				notPrimes[j*i] = true;
			}
		}
	}
		
	System.out.println(count);
    } 
  }
}
