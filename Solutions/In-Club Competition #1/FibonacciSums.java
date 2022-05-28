import java.util.Scanner;

public class FibonacciSums {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		
		int[] dp = new int [n];
		int sum = 1;
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			sum += dp[i];
		}
		
		System.out.println(sum);
	}
}
