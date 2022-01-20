import java.util.*;

public class TelemarketerOrNot_2018 {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		int fourth = in.nextInt();
		boolean ignore = false;
		
		if (first == 8 || first == 9) {
			if (second == third) {
				if (fourth == 8 || fourth == 9) {
					ignore = true;
					System.out.println("ignore");
				}
			}
		}
		
		if(!ignore) {
			System.out.println("answer");
		}
    
    }
}
