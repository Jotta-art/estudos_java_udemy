import java.util.Locale;
import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		// Exercício URI 1045

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double l1 = 0, l2 = 0, l3 = 0;
		String triangulo = "";

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		if (A > B && A > C) {

			l1 = A;

			if (B > C) {

				l2 = B;
				l3 = C;
			}

			else {

				l3 = C;
				l2 = B;

			}
		}

		else if (B > C) {

			l1 = B;

			if (A > C) {

				l2 = A;
				l3 = C;
			}

			else {

				l3 = C;
				l2 = A;

			}
		}

		else {

			l1 = C;

			if (A > B) {

				l2 = A;
				l3 = B;
			}

			else {

				l3 = B;
				l2 = A;

			}
		}

		if (l1 >= l2 + l3) {

			System.out.println("NAO FORMA TRIANGULO ");

		}

		else {

			if (l1 * l1 == l2 * l2 + l3 * l3) {

				System.out.println("TRIANGULO RETANGULO ");

			}

			else if (l1 * l1 > l2 * l2 + l3 * l3) {

				triangulo = "obtusangulo";
				System.out.println("TRIANGULO OBTUSANGULO ");

			}

			else {

				triangulo = "acutangulo";
				System.out.println("TRIANGULO ACUTANGULO ");

			}

			if (l1 == l2 && l2 == l3) {

				System.out.println("TRIANGULO EQUILATERO");

			}

			else if (l1 == l2 || l2 == l3 || l3 == l1) {

				System.out.println("TRIANGULO ISOSCELES");

			}

		}

		sc.close();

	}

}
