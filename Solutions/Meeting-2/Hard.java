//Print the multiplication table from 1 – 10 using a nested loop. 

public class Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

}
