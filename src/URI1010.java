import java.util.Scanner;
import java.util.Locale;

public class URI1010 {

	public static void main(String[] args) {
		//Exercício URI 1010
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, valor2, prod1, prod2, soma;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		prod1 = numero1 * valor1;
		prod2 = numero2 * valor2;
		
		soma = prod1 + prod2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
		
		sc.close();
	}

}
