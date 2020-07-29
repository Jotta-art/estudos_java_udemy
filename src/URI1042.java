import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		// Exercício URI 1042

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;
		int a, b, c;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if (n1 < n2 && n1 < n3) {

			a = n1;

			if (n2 < n3) {

				b = n2;
				c = n3;

			}

			else {

				b = n3;
				c = n2;
				;

			}

		}

		else if (n2 < n3) {

			a = n2;

			if (n1 < n3) {

				b = n1;
				c = n3;

			}

			else {

				b = n3;
				c = n1;
				;

			}

		}

		else {

			a = n3;

			if (n1 < n2) {

				b = n1;
				c = n2;

			}

			else {

				b = n2;
				c = n1;
				;

			}

		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("\n");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		sc.close();

	}

}
