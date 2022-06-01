import java.util.Scanner;

public class MoneyChange {

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
