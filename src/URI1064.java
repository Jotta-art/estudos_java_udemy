import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		// Exercicio URI 1064
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, n5, n6, m;
		int c;

		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();

		c = 0;
		m = 0;

		if (n1 > 0) {

			c += 1;
			
			m += n1;

		}
		
		if (n2 > 0) {

			c += 1;
			
			m += n2;

		}
		
		if (n3 > 0) {

			c += 1;
			
			m += n3;

		}
		
		if (n4 > 0) {

			c += 1;
			
			m += n4;

		}
		
		if (n5 > 0) {

			c += 1;
			
			m += n5;

		}
		
		if (n6 > 0) {

			c += 1;
			
			m += n6;

		}
		
		m = m / c;
		
		System.out.println(c + " valores positivos");
		System.out.printf("%.1f%n", m);
		
		sc.close();

	}

}
