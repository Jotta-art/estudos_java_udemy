import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		// Exercício URi 1117

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		double cont = 0;
		
		double n1 = sc.nextDouble();
		
		while (n1 < 0.0 || n1 > 10.0) {

			System.out.println("nota invalida");
			
			n1 = sc.nextDouble();

		}

		soma += n1;
		cont += 1;

		double n2 = sc.nextDouble();
		
		while (n2 < 0.0 || n2 > 10.0) {

			System.out.println("nota invalida");
			
			n2 = sc.nextDouble();

		}
		
			soma += n2;
			cont += 1;


		double media = soma / cont;

		System.out.printf("media = %.2f%n", media);

		sc.close();

	}

}
