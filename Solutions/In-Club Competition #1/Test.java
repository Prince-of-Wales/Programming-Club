package useful_tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] bills = new int[n];
		boolean isPossible = true;
		
		for (int i = 0; i < n; i++) {
			bills[i] = sc.nextInt();
		}
		
		int tenDollars = 0;
        int fiveDollars = 0;
        
        for (int i = 0; i < bills.length; i++) {
        	if (bills[i] == 5) {
        		fiveDollars ++;
        	}
        	
        	else if (bills[i] == 10) {
        		tenDollars ++;
        		if (fiveDollars > 0) {
        			fiveDollars --;
        		}
        		
        		else {
        			isPossible = false;
        			break;
        		}
        	}
        	
        	//15 give back -> 10 & 5 || 5 & 5 & 5
        	else if (bills[i] == 20) {  
        		
        		if (tenDollars > 0 && fiveDollars > 0) {
        			tenDollars --;
        			fiveDollars --;
        		}
        		
        		else if (tenDollars <= 0 && fiveDollars >= 3) {
        			fiveDollars -= 3;
        		}
        		
        		else {
        			isPossible = false;
        			break;
        		}
        	}
        }
        
        System.out.println(isPossible);
	}

}
