import java.util.*;
public class BoilingWater_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int b = in.nextInt();
		
		int p = 5 * b - 400;
		System.out.println(p);
		
		if (p < 100) {
			System.out.println(1);
		}
		
		else if (p > 100) {
			System.out.println(-1);
		}
		
		else if (p == 100) {
			System.out.println(0);
		}
	}

}
