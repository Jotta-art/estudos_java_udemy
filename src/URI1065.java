import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		// Exercicio URI 1065

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5, c;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();

		c = 0;

		if (n1 % 2 == 0) {

			c += 1;

		}

		if (n2 % 2 == 0) {

			c += 1;

		}

		if (n3 % 2 == 0) {

			c += 1;

		}

		if (n4 % 2 == 0) {

			c += 1;

		}

		if (n5 % 2 == 0) {

			c += 1;

		}

		System.out.println(c + " valores pares");

		sc.close();

	}

}
