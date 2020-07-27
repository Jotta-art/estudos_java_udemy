import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		// Exercício URI  1009
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		double salario;
		double vendas;
		double total;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		total = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}
