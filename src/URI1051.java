import java.util.Locale;
import java.util.Scanner;

public class URI1051 {

	public static void main(String[] args) {
		// Exercício URI 1051
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			
			System.out.println("Isento");
			
		}
		
		else if (salario <= 3000.00) {
			
			imposto = (salario - 2000.00) * 0.08 ;
			
			System.out.printf("R$ %.2f%n", imposto);
			
		}
		
		else if (salario <= 4500.00) {
			
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			
			System.out.printf("R$ %.2f%n", imposto);
			
		}
		
		else {
			
			imposto = (salario - 4500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
	
			System.out.printf("R$ %.2f%n", imposto );
	
		}
		
		sc.close();

	}

}
