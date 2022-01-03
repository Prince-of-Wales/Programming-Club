//https://dmoj.ca/problem/ccc21s1

import java.util.Scanner;

public class Hard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		double[] heights =  new double [n+1];
		double[] widths = new double [n];
		double total = 0;
		
		for (int i = 0; i < n+1; i++) {
			heights[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			widths[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			total += ((heights[i] + heights[i+1])*widths[i])/2;
		}
		
		System.out.println(total);
	}

}

