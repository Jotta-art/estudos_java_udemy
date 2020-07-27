import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		// Exercício URI 1048

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, Novosalario;
		
		Novosalario = 0.0;

		salario = sc.nextDouble();

		if (salario <= 400.00) {

			Novosalario = salario + (salario * 0.15);
			
			System.out.printf("Novo salario: %.2f%n", Novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", salario * 0.15 );
			System.out.println("Em percentual: 15 %");

		}

		else if (salario > 400.00 && salario <= 800.00) {

			Novosalario = salario + (salario * 0.12);
			
			System.out.printf("Novo salario: %.2f%n", Novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", salario * 0.12 );
			System.out.println("Em percentual: 12 %");

		}

		else if (salario > 800.00 && salario <= 1200.00) {

			Novosalario = salario + (salario * 0.10);
			
			System.out.printf("Novo salario: %.2f%n", Novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", salario * 0.10 );
			System.out.println("Em percentual: 10 %");

		}

		else if (salario > 1200.00 && salario <= 2000.00) {

			Novosalario = salario + (salario * 0.07);
			
			System.out.printf("Novo salario: %.2f%n", Novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", salario * 0.07 );
			System.out.println("Em percentual: 7 %");

		}

		else if (salario > 2000.00) {

			Novosalario = salario + (salario * 0.04);
			
			System.out.printf("Novo salario: %.2f%n", Novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", salario * 0.04 );
			System.out.println("Em percentual: 4 %");

		}
		
		sc.close();
	}

}
