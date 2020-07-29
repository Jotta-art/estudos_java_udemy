import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		// Exercicio URI 1060
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, n5, n6;
		int c;

		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();

		c = 0;

		if (n1 > 0) {

			c += 1;

		}
		
		if (n2 > 0) {

			c += 1;

		}
		
		if (n3 > 0) {

			c += 1;

		}
		
		if (n4 > 0) {

			c += 1;

		}
		
		if (n5 > 0) {

			c += 1;

		}
		
		if (n6 > 0) {

			c += 1;

		}

		System.out.println(c + " valores positivos");
		
		sc.close();

	}

}
