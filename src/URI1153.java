import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		// Exercício URI 1153

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int resultado = 1;

		for (int i = 1; i <= n; i++) {

			resultado *= i;
		}

		System.out.println(resultado);

		sc.close();

	}

}
