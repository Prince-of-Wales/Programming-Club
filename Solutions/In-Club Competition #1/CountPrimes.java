import java.util.Scanner;

public class CountPrimes {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
    
	    boolean[] notPrimes = new boolean [n];
	    if (n <= 2) System.out.println(0);
		
	    else {
    		// initializing 2 as a prime
		int count = 1; 
		//skipping all even numbers
		for (int i = 3; i < n; i += 2) { 
			if (!notPrimes[i]) {
				count++;
				//all multiples of the prime number are not primes - set them to not prime
				for (int j = 1; j*i < n; j++) { 
					notPrimes[j*i] = true;
				}
			}
		}
		
		System.out.println(count);
	    } 
	  }
}
