import java.util.Scanner;

public class Main5_49 {

	public static void main(String[] args) {
		// For
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			soma = soma + x;			
			
		}
		
		System.out.println(soma);
		
		// Contagem Progressiva
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("valor de i: " + i );
			
		}
		
		// Contagem Regressiva
		
				for (int i = 5; i >= 0; i--) {
					
					System.out.println("valor de i: " + i );
					
				}
		
		sc.close();

	}

}
