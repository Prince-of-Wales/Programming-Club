//https://dmoj.ca/problem/ccc18s2
import java.util.Scanner;

public class Hard1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] growth = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				growth[i][j] = in.nextInt();
			}
		}
		
		int min = growth[0][0];
		int row = 0;
		int column = 0;
		
		if (growth[0][n-1] < min) {
			row = 0;
			column = n-1;
			min = growth[0][n-1];
		}
		
		if (growth[n-1][0] < min) {
			row = n-1;
			column = 0;
			min = growth[n-1][0];
		}
		
		if (growth[n-1][n-1] < min) {
			row = n-1;
			column = n-1;
			min = growth[n-1][n-1];
		}
		
		if (row == 0 && column == 0) {
			for (int i= 0; i < n; i++) {
				for (int j = 0; j<n; j++) {
					System.out.print(growth[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		else if (row == 0 && column > 0) {
			for (int i= n-1; i >= 0; i--) {
				for (int j = 0; j<n; j++) {
					System.out.print(growth[j][i] + " ");
				}
				System.out.println();
			}
		}
		
		else if (row > 0 && column > 0) {
			for (int i= n-1; i >= 0; i--) {
				for (int j = n-1; j>=0; j--) {
					System.out.print(growth[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		else {
			for (int i= 0; i < n; i++) {
				for (int j = n-1; j>=0; j--) {
					System.out.print(growth[j][i] + " ");
				}
				System.out.println();
			}
		}
	}

}
