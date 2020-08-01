import java.util.Scanner;

public class URI1157 {

	public static void main(String[] args) {
		// Exercício URI 1157

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				System.out.println(i);

			}

		}

		sc.close();

	}

}
