import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {
		// Exercício URI 1074

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			if (x % 2 == 0 && x > 0) {

				System.out.println("EVEN POSITIVE");

			}

			else if (x % 2 == 0 && x < 0) {

				System.out.println("EVEN NEGATIVE");

			}

			else if (x % 2 != 0 && x > 0) {

				System.out.println("ODD POSITIVE");

			}
			
			else if (x % 2 != 0 && x < 0) {
				
				System.out.println("ODD NEGATIVE");
				
			}
			
			else {
				
				System.out.println("NULL");
				
			}

		}

		sc.close();

	}

}
