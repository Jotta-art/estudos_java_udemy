import java.util.Scanner;

public class URI1054 {

	public static void main(String[] args) {
		// Exercício URI 1059
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (x >= 0) {
			
			soma += x;
			cont += 1;
			
			x = sc.nextInt();
			
		}
		
		double media = (double)soma / cont;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}

}
