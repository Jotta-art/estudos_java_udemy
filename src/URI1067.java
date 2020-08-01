import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		// Exercicio URI 1067

		Scanner sc = new Scanner(System.in);

		int n, impar;

		n = sc.nextInt();
		
		//Resposta da internet
		System.out.print(1 + "\n");

		for (int i = 1; i < n - 1; i += 2) {

			impar = i + 2;

			System.out.print(impar + "\n");

		}
		
		//Resposta do intrutor
		/*for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}*/
		
		
		sc.close();
	}
}
